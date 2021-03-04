package day13.ex;

public class MyPoint {
	private int x,y;	// 1번 해결
	
	public MyPoint() {	// 2-1 해결
		
	}
	
	public MyPoint(int a, int b) {	// 2-2 해결
		x = a;
		y = b;
	}
	
	public MyPoint(int[] a) {	// 2-3 해결
		/*
		x = a[0];
		y = a[1];
		*/
		this(a[0],a[1]);
	}
	
	// 3-1
	public void setX(int a) {
		x = a;
	}
	
	// 3-2
	public void setY(int b) {
		y = b;
	}
	
	// 3-3
	public void setXY(int a, int b) {
		//this(a,b);	// this()는 생성자함수에서만 사용할 수 있고 맨 첫문장으로 사용해야 한다.
		/*
		 	이 방법도 가능
		 	setX(a);
		 	setY(b);
		 */
		
		x = a;
		y = b;
	}
	
	// 3-4
	public int getX() {
		return x;
	}
	
	// 3-5
	public int getY() {
		return y;
	}
	
	// 3-6
	public void display() {
		System.out.println("x : " + x + ", y : " + y);
	}
}
