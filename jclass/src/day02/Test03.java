package day02;
/*
	���� ������
	==> Ư���� ������̳� ���� �� �Ǵ� ��ü�� ������ ����ų�� ����ϴ� ������.
*/
public class Test03 {

	public static void main(String[] args) {
		int no = 10; //�̶�  = �� ���Կ�����.
		
		System.out.println("1. no : " + no);
		
		//no�� 5�� ���� ������ ����� �ٽ� no�� �����Ѵ�.
		no = no + 5;
		System.out.println("2. no : " + no);
		
		// ==> 
		no += 5;
		System.out.println("3. no : " + no);
		
		// -=
		no -= 10;
		System.out.println("4. no : " + no);
		
		// *=
		no *= 2;
		System.out.println("5. no : " + no);
		
		// /=
		no /= 2;
		System.out.println("6. no : " + no);
		
		// %=
		no %= 3;
		System.out.println("7. no : " + no);
	}

}
