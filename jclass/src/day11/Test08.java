package day11;

/*
 	우리반 친구들의 정보를 기억할 클래스를 제작하고
 	한명씩 정보를 입력해서 출력해보자.
 */
public class Test08 {
	
	public Test08() {
		
		String[] name = {"전은석","허수경","곽채원","김유진","신현식"};
		String[] id = {"euns","soo","won","jin","sin"};
		String [] mail = {"euns@increpas.com","soo@increpas.com","won@increpas.com","jin@increpas.com","sin@increpas.com"};
		String [] tel = {"010-1111-1111","010-2222-1111","010-1333-1111","010-4444-1111","010-5555-1111"};
		char[] gen = {'M','F','F','F','M'};
		
		Stud[] stud = new Stud[5];
		for(int i = 0 ; i < stud.length ; i++) {
			// 각 방에 인스턴스 만들어서 채워주고
			stud[i] = new Stud();
			
			// 데이터 셋팅해주고
			stud[i].name = name[i];
			stud[i].id = id[i];
			stud[i].mail = mail[i];
			stud[i].tel = tel[i];
			stud[i].gen = gen[i];
		}
		
		//출력
		for(int i = 0 ; i < stud.length ; i++) {
			System.out.println(stud[i].toString());
		}
		
		Student st = new Student();
		//st.name = "둘리";	// 당연히 에러가 발생한다 <== 접근지정자가 private이기 때문에 해당 클래스내에서만 접근할 수 있다.
		//String irum = st.name;
		st.setName("둘리");
		System.out.println("학생 이름 : " + st.getName());
	}
	
	public static void main(String[] args) {
		new Test08();
	}

}
