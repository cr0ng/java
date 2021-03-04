package day11.solv;

/*
	Student 클래스(HomeWork02)를 이용해서 ==> 함수를 이용해서 접근해라...
	우리반 친구들 5명을 관리할 배열을 만들고
	출력하는 프로그램을 각각 제작하세요.
*/

/*
	extra ]
		이름 또는 아이디를 입력하면
		해당 친구의 정보를 출력해주는 프로그램을 제작하세요.
		
		전화번호를 입력하면 해당 학생의 정보를 출력해주도록 처리...
 */

import java.util.*;
public class HomeWork02 {
	Scanner sc = new Scanner(System.in);
	public HomeWork02() {
		// 배열 준비하고
		Student[] stud = getDataArr();
		// 실행하면 인스턴스와 데이터 모두 채워서 반환해주는 함수를 이미 만들어 뒀으니
		// 호출만하면 원하는 Student 배열을 얻을 수 있다.
		
		// 출력해준다.
		toPrint(stud);
		
		exec(stud);
		sc.close();
	}
	
	// 실행처리함수
	public void exec(Student[] st) {
		// 할일
		// 무한 반복해서 친구의 이름을 입력할 것인지 아니면 아이디를 입력할 것인지를 입력 받는다.
		// 이름입력은 0번 아이디입력은 1번으로 처리하기로 한다.
		
		// 입력도구 준비
		while(true) {
			// 메세지 출력한다.
			System.out.print("이름으로 검색은 0, 아이디로 검색은 1 , 전화번호 검색은 2를 입력하세요! 종료는 9 를 입력 : ");
			int no = sc.nextInt();
			System.out.println("no : " + no); 
			// 스캐너에서 정수를 입력할 때 엔티를 누를 것이고
			// 정수를 꺼내는 함수는 엔터키에 해당하는 키값을 꺼내오지 않는다.
			// 버퍼에 남아있는 내용 강제로 꺼내오고...
			sc.nextLine();
			
			
			// 종료코드 검사하고
			if(no == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 잘못입력인지 검사하고
			if(!(no == 0 || no == 1 || no == 2)) {
				System.out.println("잘못입력했습니다!");
				continue;
			}
			
			switch(no) {
			case 0:
				// 이름으로 검색하는 기능 처리
				nameToInfo(st);
				break;
			case 1:
				// 아이디로 검색하는 기능 처리
				idToInfo(st);
				break;
			case 2:
				// 전화번호 검색 기능 처리
				telToInfo(st);
				break;
			}
		}
	}
	
	// 배열을 입력해서 실행하면 이름을 입력받아서 
	// 해당 이름의 학생정보를 출력해주는 함수
	public void nameToInfo(Student[] st) {
		// 입력도구 준비하고
		// 메세지 출력하고
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		// 각 인덱스의 이름을 비교해서 같은 이름이면 정보를 출력해준다.
		for(int i = 0 ; i < st.length ; i++ ) {
			if(st[i].getName().equals(name)) {
//				System.out.println(st[i].toString());
				toPrint(st, i);
				break;
			}
		}
	}
	
	// 배열을 입력해서 실행하면 아이디를 입력받고
	// 해당아이디의 학생 정보를 출력해주는 함수
	public void idToInfo(Student[] st) {
		// 메세지 출력하고
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		// 각 인덱스의 이름을 비교해서 같은 이름이면 정보를 출력해준다.
		for(int i = 0 ; i < st.length ; i++ ) {
			if(st[i].getId().equals(id)) {
//				System.out.println(st[i].toString());
				toPrint(st, i);
				break;
			}
		}
	}
	
	public void telToInfo(Student[] st) {
		System.out.print("전화번호 입력 : ");
		String tel = sc.nextLine();
		
		for(int i = 0 ; i < st.length; i++) {
			if(st[i].getTel().equals(tel)) {
				toPrint(st,i);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new HomeWork02();
	}
	
	// 인스턴스와 데이터 채워주는 함수
	public Student[] getDataArr() {
		// 반환값 변수 만들고
		Student[] st = new Student[5];
		
		for(int i = 0 ; i < st.length ; i++ ) {
			st[i] = new Student();
		}
		
		// 데이터 삽입용 배열을 준비
		String[] name = {"윤태성", "최용훈", "허수경", "최다연", "김기은"};
		String[] id = {"tsung", "hoon", "soo", "yun", "ki"};
		String[] mail = {"tsung@increpas.com", "hoon@increpas.com", "soo@increpas.com", "yun@increpas.com", "ki@increpas.com"};
		String[] tel = {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-7777-7777", "010-5555-5555"};
		char[] gen = {'M', 'M', 'F', 'F', 'M'};
		
		//  데이터 채우고
		for(int i = 0 ; i < st.length ; i++ ) {
			String irum = name[i];
			String aidi = id[i];
			String juso = mail[i];
			String hp = tel[i];
			char gender = gen[i];
			
			st[i].setName(irum);
			st[i].setId(aidi);
			st[i].setMail(juso);
			st[i].setTel(hp);
			st[i].setGen(gender);
		}
		
		// 완성된 배열 반환해주고...
		return st;
	}
	
	// 출력용 함수 
	public void toPrint(Student[] st) {
		for(int i = 0 ; i < st.length ; i++ ) {
			System.out.println(st[i].toString());
		}
	}
	
	public void toPrint(Student[] st, int idx) {	// 오버로딩 ( <=== 매개변수의 갯수가 다르다.)
		System.out.println(st[idx].toString());
	}

	/*
	public String toPrint(Student[] st) { // 매개변수리스트의 형태가 같기 때문에 안된다.
		String str = "";
		
		return str;
	}
	*/
}