package day11.ex;
/*
 	문제 2]
 		원의 정보를 기억할 클래스(Circle)을 정의하고
 		이 클래스를 10개를 관리할 배열을 만들어서
 		반지름, 둘레, 넓이
 		를 출력하세요. 
 */
public class Ex02 {

	public Ex02() {
		Circle[] c = new Circle[10];
		
		for(int i = 0 ; i < c.length ; i++) {
			c[i] = new Circle();
		}
		
		for(int i = 0 ; i < c.length ; i++) {
			int r = c[i].r;
			double around = c[i].Around();
			double area = c[i].Area();
			System.out.printf("반지름 : %2d, 둘레 : %2f, 넓이 : %2f \n",r,around,area);
		}
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
