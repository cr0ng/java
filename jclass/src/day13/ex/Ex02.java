package day13.ex;
/*
���� 2 ]
	1. �� ����( int x, int y)�� ����ϴ� Ŭ���� MyPoint�� �ۼ��ϰ�
	2. ����ڰ� �� Ŭ������ new ��ų�� �ִ� ������ �Լ��� �����
		1) �⺻ �������Լ�
		2) �� ���� �˷��ָ� �� ���� x, y�� ����ϴ� ������ �Լ�
		3) �μ��� �迭�� �˷��ָ�
			�� ���� x, y�� ����ϴ� ������ �Լ�
	3. �Լ� �߰�
		1) x ���� �������ִ� �Լ�
		2) y ���� �������ִ� �Լ�
		3) x, y�� ���ÿ� �������ִ� �Լ�
		4) x ���� �������� �Լ�
		5) y ���� �������� �Լ�
		6) x�� y ���� ������ִ� �Լ�(display)
*/

public class Ex02 {

	public Ex02() {
		MyPoint p1 = new MyPoint();
		// p1���
		p1.display();
		p1.setXY(3,5);
		p1.display();
		System.out.println();
		
		// �迭�� MyPoint ��ü�� ������.
		int[] no = {5, 10};
		//MyPoint p2 = new MyPoint(no);	// --- OK
		MyPoint p2 = new MyPoint(new int[] {5,10});
		p2.display();
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
