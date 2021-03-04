package day13.ex;
/*
문제 2 ]
	1. 두 변수( int x, int y)를 기억하는 클래스 MyPoint를 작성하고
	2. 사용자가 이 클래스를 new 시킬수 있는 생성자 함수를 만들고
		1) 기본 생성자함수
		2) 두 수를 알려주면 그 수를 x, y에 기억하는 생성자 함수
		3) 두수를 배열로 알려주면
			그 수를 x, y에 기억하는 생성자 함수
	3. 함수 추가
		1) x 값을 셋팅해주는 함수
		2) y 값을 셋팅해주는 함수
		3) x, y를 동시에 셋팅해주는 함수
		4) x 값을 꺼내오는 함수
		5) y 값을 꺼내오는 함수
		6) x와 y 값을 출력해주는 함수(display)
*/

public class Ex02 {

	public Ex02() {
		MyPoint p1 = new MyPoint();
		// p1출력
		p1.display();
		p1.setXY(3,5);
		p1.display();
		System.out.println();
		
		// 배열로 MyPoint 객체를 만들어보자.
		int[] no = {5, 10};
		//MyPoint p2 = new MyPoint(no);	// --- OK
		MyPoint p2 = new MyPoint(new int[] {5,10});
		p2.display();
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
