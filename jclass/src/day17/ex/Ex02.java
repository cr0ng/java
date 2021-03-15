package day17.ex;

/*
	문제 2 ]
		학생의 성적을 관리하는 클래스를 작성하세요.
		학생의 정보는 학생번호, 이름을 기억하기로 하고
		점수는 java, db, web, jsp, 총점 을 기억하기로 한다.
		
		이 때
			학생번호가 같으면 같은 학생으로 처리되게 하세요.
		이 클래스의 변수를 출력할 때 해당 학생의 정보(기본정보 + 점수)가 출력되도록 하세요.
 */
public class Ex02 {

	public Ex02() {
		Student s1 = new Student(1,"김유진",100,100,100,100);
		System.out.println(s1);
		
		Student s2 = new Student(1,"곽채원",100,100,100,100);
		System.out.println(s2);
		
		if(s1.equals(s2)) {
			System.out.println("같은 학생");
		}else
			System.out.println("다른 학생");
	}

	public static void main(String[] args) {
		new Ex02();
	}

}