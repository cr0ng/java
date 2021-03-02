package day10.ex;

/*
문제 4 ]
	1. 정수를 입력하면 그 정수에 해당하는 
		삼각형 배열을 기억할 배열을 반환해주는 함수
	2. 배열을 입력하면 배열의 삼각형들의 
		밑변, 높이 를 랜덤하게 셋팅해주는 함수
	3. 배열을 입력하면 배열의 삼각형들의 
		넓이를 입력해주는 함수
	4. 배열을 입력하면 배열의 삼각형들의 내용을 출력해주는 함수
		밑변 - 0000
		높이 - 0000
		넓이 - 0000
	5. 배열과 정수를 입력하면 배열의 정수 위치의 삼각형의
		정보를 출력해주는 함수
		
	를 만들어서 실행하세요.
 */

public class Ex04 {

	public Ex04() {
		printTriangle(triangle, 2);
	}
	
	public static void main(String[] args) {
		new Ex04();
		
	}
	
	public double[][] getTriangle() {
		double[][] triangle = new double[3][3];
		
		return triangle;
		
	}

	public void getNum(double[][] a) {
		
		for(int i = 0 ; i < a.length ; i++) {
			int bottom  = (int)(Math.random()*20+1);
			int height  = (int)(Math.random()*20+1);
			
			a[i][0] = bottom;
			a[i][1] = height;
		}
	}
	
	public void getArea(getNum(double[][] a)) {
		
		for(int i = 0 ; i < a.length ; i++) {
			double area = a[i][0] * a[i][1] * 0.5;
			a[i][2] = area;
		}
	}
	
	public void printInfo(getArea(double[][] a)) {
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println("밑변 : " + a[i][0]);
			System.out.println("높이 : " + a[i][1]);
			System.out.println("넓이 : " + a[i][2]);
		}
	}
	
	public void printTriangle(getNum(double[][] a), int b) {
		System.out.println("밑변 : "+a[b][0]);
		System.out.println("높이 : "+a[b][1]);
		System.out.println("넓이 : "+a[b][2]);
	}
}
