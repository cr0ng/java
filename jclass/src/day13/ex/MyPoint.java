package day13.ex;

public class MyPoint {
	private int x,y;	// 1�� �ذ�
	
	public MyPoint() {	// 2-1 �ذ�
		
	}
	
	public MyPoint(int a, int b) {	// 2-2 �ذ�
		x = a;
		y = b;
	}
	
	public MyPoint(int[] a) {	// 2-3 �ذ�
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
		//this(a,b);	// this()�� �������Լ������� ����� �� �ְ� �� ù�������� ����ؾ� �Ѵ�.
		/*
		 	�� ����� ����
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
