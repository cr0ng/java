package day05.ex;
/*
 	���� 2]
 		�ټ��ڸ��� ���ڸ� �����ϰ� �߻���Ų��
 		�� �ڸ��� ���� �����ִ� ���α׷��� �ۼ��ϼ���.
 		��, �ݺ����� ����ؼ�  ó���ϼ���.
 		
 	��Ʈ 1 ]
 		charAt()	-	���ڿ��� Ư����ġ�� ���ڸ� �����ִ� �Լ�
 		Integer.parseInt()	-	���� ������ ���ڿ��� ������ ��ȯ�����ִ� �Լ�
 		
 	��Ʈ 2 ]
 		������ 10 ������ ���ڸ��� �پ���.
 		
 */
public class Ex02 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*(99999-10000+1)+10000);
		System.out.println("�������� : " + num);
		
		
		int sum = 0;

		String str = num +"";
		
		
		for(int i = 0; i < 5; i++){	
			char n = str.charAt(i);
			String tmp = n +"";
			int no = Integer.parseInt(tmp);
			sum += no;
		}
		System.out.println(sum);
		
		
		/*
		int sum = 0;
		do {
			sum += num%10;
			num/=10;
			
		}while(num != 0);
		System.out.println("�� �ڸ� ������ �� : "+sum);
		*/
	}

}
