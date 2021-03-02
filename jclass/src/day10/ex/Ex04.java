package day10.ex;

/*
���� 4 ]
	1. ������ �Է��ϸ� �� ������ �ش��ϴ� 
		�ﰢ�� �迭�� ����� �迭�� ��ȯ���ִ� �Լ�
	2. �迭�� �Է��ϸ� �迭�� �ﰢ������ 
		�غ�, ���� �� �����ϰ� �������ִ� �Լ�
	3. �迭�� �Է��ϸ� �迭�� �ﰢ������ 
		���̸� �Է����ִ� �Լ�
	4. �迭�� �Է��ϸ� �迭�� �ﰢ������ ������ ������ִ� �Լ�
		�غ� - 0000
		���� - 0000
		���� - 0000
	5. �迭�� ������ �Է��ϸ� �迭�� ���� ��ġ�� �ﰢ����
		������ ������ִ� �Լ�
		
	�� ���� �����ϼ���.
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
			System.out.println("�غ� : " + a[i][0]);
			System.out.println("���� : " + a[i][1]);
			System.out.println("���� : " + a[i][2]);
		}
	}
	
	public void printTriangle(getNum(double[][] a), int b) {
		System.out.println("�غ� : "+a[b][0]);
		System.out.println("���� : "+a[b][1]);
		System.out.println("���� : "+a[b][2]);
	}
}
