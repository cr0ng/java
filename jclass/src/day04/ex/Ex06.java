package day04.ex;
/*
 ���� 6 ]
	5�ڸ� ���ڸ� �����ϰ� �߻��� ��
	�� �ڸ� ������ ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
	
	�� ]
		�߻��� ���� : 12345
		==>
			��� : 1 + 2 + 3 + 4 + 5
 */
public class Ex06 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*(99999-10000+1)+10000);
		int man,chun,baek,ten,il;
		int na = num;
		System.out.println("5�ڸ� ���� ���� : " + num);
		
		man = na / 10000;
		na %= 10000;
		
		chun = na / 1000;
		na %= 1000;
		
		baek = na / 100;
		na %= 100;
		
		ten = na / 10;
		na %= 10;
		
		il = na / 1;
		na %= 1;
		
		int result =man+chun+baek+ten+il;
		System.out.println("��� : "+man+"+"+chun+"+"+baek+"+"+ten+"+"+il+"="+result);
		
		
	}

}
