package day13.ex;
/*
 	문제 1]
 		다음 변수를 멤버로 하는 Student 클래스를 만드세요.
 		필요한 생성자 함수들을 모두 작성해서 만드세요.
 		toString()도 추가하세요.
 			String name;
 			int ban, no, kor, eng, math, total;
 			
 		5명의 학생의 데이터를 배열에 담고
 		내용도 출력하세요.
 		
 		작업순서 ]
 			1. 필요한 변수를 가지는 클래스를 작성
 			2. 필요한 생성자를 정의한다.
 			3. Ex01 클래스 내에서 5학생의 데이터를 배열로 만든다.
 			4. 출력한다.
 		
 */

public class Ex01 {
	/*
	public Ex01() {
		
		Student[] st = getData();
		toPrint(st);
	
	}
	
	public Student[] getData() {
		
		Student[] st = new Student[5];
		
		for(int i = 0 ; i < st.length; i++) {
			st[i] = new Student();
		}
		
		String[] name = {"김유진","곽채원","박용수","윤건우","최태현"};
		int[] ban = {1,2,3,4,5};
		int[] no = {1,2,3,4,5};
		
		for(int i = 0 ; i < st.length ; i++) {
			String na = name[i];
			int b = ban[i];
			int n = no[i];
			int k = st[i].getKor();
			int e = st[i].getEng();
			int m = st[i].getMath();
			int t = st[i].getTotal(k,e,m);
			
			st[i].setName(na);
			st[i].setBan(b);
			st[i].setNo(n);
			st[i].setKor(k);
			st[i].setEng(e);
			st[i].setMath(m);
			st[i].setTotal(t);
			
			System.out.printf("이름 : %s, 반 : %d, 번호 : %d, 국어점수 : %d, 영어점수 : %d, 수학점수 : %d, 총점 : %d \n",na,b,n,k,e,m,t);
				
		}
		return st;
	}
	
	public void toPrint(Student[] st) {
		for(int i = 0 ; i < st.length ; i++) {
			System.out.println(st[i].toString());
		}
	}
	*/
	
	//선생님 코드
	public Ex01(){
		Student[] stud = getStud();
		
		// 출력해보자
		for(int i = 0 ; i < stud.length ; i++) {
			System.out.println(stud[i]);
			/*
			 	println()는 toString()를 자동호출해서 사용한다.
			 */
		}
	}
	
	//항색 배열 반환해주는 함수
	public Student[] getStud() {
		Student[] s = new Student[5];
		String[] name= {"홍길동","둘  리","고 길동","희동이","도우너"};
		int no = 1;
		int ban = 2;
		
		//배열 셋팅해주고
		for(int i = 0 ; i < s. length; i++) {
			// 먼저 과목별 점수 랜덤하게 만들고
			int k = (int)(Math.random()*41+60);
			int e = (int)(Math.random()*41+60);
			int m = (int)(Math.random()*41+60);
			
			//먼저 각 방에 인스턴스를 만들어서 기억시키고
			s[i] = new Student(name[i], ban, no++, k, e,m);
			/*
			s[i] = new Student(name[i], ban, no++);
			s[i].setKor(k);
			s[i].setEng(e);
			s[i].setMath(m);
			s[i].setTotal();
			s[i].setAvg();
			*/
			/*
			s[i] = new Student();
			s[i].setName(name[i]);
			s[i].setBan(ban);
			s[i].setKor(k);
			s[i].setEng(e);
			s[i].setMath(m);
			s[i].setTotal();
			s[i].setAvg();
			*/
		}
		
		return s;
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
