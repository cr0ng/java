package day10.ex;
/*
 	1. width�� ������ �Է¹޾� �������ִ� �Լ�
 	2. height�� ������ �Է¹޾� �������ִ� �Լ�
 	3. width�� height�� �̿��ؼ� �簢���� ������ ����ϰ� ��ȯ���ִ� �Լ�
 	4. ���� �ΰ��� �Է¹޾Ƽ� ������ ���� �Լ��� ����ؼ� �簢���� ���μ��θ� �����ϰ�
 	������ ������ִ� ����� �Լ�
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
