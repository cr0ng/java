package day15.ex;

/*
���� ]
	
	Figure Ŭ������ ��ӹ��� 
	Semo, Nemo, Won Ŭ������ �����	
	�������� ������ ����ϼ���.
	
	�۾� ���� ]
		1. ��� ���� Ŭ������ �����Ѵ�.
		2. ��� ���� Ŭ������ ��ü�� ���� 
			Figure Ŭ������ ������ �޾Ƽ� ����Ѵ�.
		3. ������ ����Ѵ�.
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
