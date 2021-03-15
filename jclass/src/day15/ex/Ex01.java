package day15.ex;

/*
문제 ]
	
	Figure 클래스를 상속받은 
	Semo, Nemo, Won 클래스를 만들고	
	각도형의 정보를 출력하세요.
	
	작업 순서 ]
		1. 상속 받은 클래스를 정의한다.
		2. 상속 받은 클래스의 객체를 만들어서 
			Figure 클래스의 변수로 받아서 사용한다.
		3. 정보를 출력한다.
*/

public class Ex01 {

	public Ex01() {
		
		Figure f1 = new Semo();
		Figure f2 = new Nemo();
		Figure f3 = new Won();
		
		System.out.println(f1.getArea());
		f1.toPrint();
	 
		System.out.println(f2.getArea());
		f2.toPrint();
		
		System.out.println(f3.getArea());
		f3.toPrint();
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
