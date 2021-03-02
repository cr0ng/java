package day10.ex;
/*
 	1. width에 정수를 입력받아 대입해주는 함수
 	2. height에 정수를 입력받아 대입해주는 함수
 	3. width와 height를 이용해서 사각형의 면적을 계산하고 반환해주는 함수
 	4. 정수 두개를 입력받아서 위에서 만든 함수를 사용해서 사각형의 가로세로를 셋팅하고
 	면적을 출력해주는 기능의 함수
 */
public class Ex03 {

	public Ex03() {
		printSquare(getWidth(),getHeight());
	}
	
	public static void main(String[] args) {
		new Ex03();
		
	}
	
	public int getWidth() {
		int width = (int)(Math.random()*10 + 1);
		return width;
	}
	
	public int getHeight() {
		int height = (int)(Math.random()*10 + 1);
		return height;
	}
	
	public int squareArea(int a, int b) {
		int area = a * b;
		return area;
	}
	
	public void printSquare(int width, int height) {
		System.out.println("width : " + width);
		System.out.println("height : " + height);
		System.out.println("area : "+squareArea(width,height));
	}
		

}
