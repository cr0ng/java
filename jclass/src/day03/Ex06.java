package day03;
/*
 	���� 6 ]
 		�ҹ��ڸ� �����ϰ� �߻����Ѽ�
 		�� ���ڸ� �빮�ڷ� ��ȯ���Ѽ� ����ϼ���.
 */
public class Ex06 {

	public static void main(String[] args) {

		char low = (char)(Math.random()*('z'-'a'+1)+'a');
		
		System.out.println("�ҹ��� ���� ��� : "+low);
		
		char up = (char)(low - ('a'-'A'));
		
		System.out.println("�빮�ڷ� ��ȯ : "+up);
	}

}
