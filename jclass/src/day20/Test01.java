package day20;

import java.util.*;

public class Test01 {
	public Hashtable tab;
	
	public Test01() {
		// Hashtable 만들고
		tab = new Hashtable();
		// 데이터 채우고
		tab.put("이름","홍길동");
		/*
		 *  Map 계열은 데이터를 입력할 때
		 *  그 데이터를 구분하는 키값과 데이터를
		 *  한쌍으로 만들어서 입력해야 함
		 */
		tab.put("나이", 18);
		tab.put("전화", "010-1111-1111");
		tab.put("키", 173.0);
		System.out.println("이름 : " + tab.get("이름"));
				
		tab.put("이름", "고길동");
		System.out.println("이름 : " + tab.get("이름"));
		/*
		 * 같은 키값으로 데이터를 입력하면
		 * 먼저 저장된 데이터는 삭제되고
		 * 새로운 데이터가 입력된다.
		 * 즉, 같은 키값은 한 개의 데이터만 기억할 수 있다.
		 */
		
		tab.put("성명", "고길동");
		// 키 값이 달라지면 같은 데이터도 입력할 수 있다.
		System.out.println("성명 : " + tab.get("성명"));
		
		int len = tab.size();
		System.out.println("tab length : " + len );
		
		// 데이터만 추출
		Collection con = tab.values();
		
		// Iterator로 꺼내오고
		Iterator itor = con.iterator();
		
		// 하나씩 꺼내서 출력
		while(itor.hasNext()) {
			Object o = itor.next();
			if(o instanceof String) {
				String str = (String) o;
				System.out.println("문자열 데이터 : " + str);
			}else if(o instanceof Integer) {
				int no = (int) o;
				System.out.println("정수 데이터 : " + no);				
			}else if(o instanceof Double) {
				double num = (double) o;
				System.out.println("실수 데이터 : " + num );
				
			}
		}
				
		// 키 값만 추출
		// 키 값만 추출하는 함수는 keys(), keySet()
		Enumeration en = tab. keys();
		// 출력
		while(en.hasMoreElements()) {
			Object obj = en.nextElement();
			// 우리의 경우 키값이 모두 문자열이기 때문에 문자열로 강제 형변환 해주자.
			String skey = (String) obj;
		}
	}
	
	
	public static void main(String[] args) {
		new Test01();
	}

}
