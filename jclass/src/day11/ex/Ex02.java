package day11.ex;
/*
 	���� 2]
 		���� ������ ����� Ŭ����(Circle)�� �����ϰ�
 		�� Ŭ������ 10���� ������ �迭�� ����
 		������, �ѷ�, ����
 		�� ����ϼ���. 
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
			System.out.printf("������ : %2d, �ѷ� : %2f, ���� : %2f \n",r,around,area);
		}
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}
