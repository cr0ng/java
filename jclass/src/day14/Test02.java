package day14;

public class Test02 {
	public static int no;
	public int num = 2; //==> ����� �ʱ�ȭ 
	
	{
		// ==> �ʱ�ȭ ���� �̿��� �ʱ�ȭ
			no = 10;
			num = 20;
	}
	
	static {	// static ���� �̿��� �ʱ�ȭ : static ����� ���ؼ��� �ʱ�ȭ �ϴ� ���
		no = 50;	// 3
		//num = 50;	// static ����� �ƴϱ⶧���� ����..
	}
	public Test02() {
		/*
		 	num = 100;
		 	no = 200; // �������Լ��� �̿��� �ʱ�ȭ
		 */ 
		System.out.println("no : "+ no);	//	=>  1 => 3 => 2 ������ �ʱ�ȭ�� �̷�� ����.
		System.out.println("num : "+ num);
	}

	public static void main(String[] args) {
		new Test02();
		System.out.println("no : "+ no);
		//System.out.println("num : "+ num);
	}

}
