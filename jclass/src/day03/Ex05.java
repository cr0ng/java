package day03;
/*
 	���� 5 ]
 		25 ~ 95 ������ �����ϳ��� �����ϰ� �߻���Ų��
 		�� ���ڿ� ���� ����� 10�� ����� ������ִ� ���α׷��� �ۼ��ϼ���.
 		�߻��� ���ڿ� ����� 10�� ����� ��� ����ϼ���.
 		
 		�� ]
 			27 ==> 30
 			32 ==> 30
 */
public class Ex05 {

	public static void main(String[] args) {
		int hi = 95;
		int lo = 25;
				
		int num = (int)(Math.random()*(hi-lo+1)+lo);
		/*
		int sip = ((num-((num/10)*10))>=5) ? ((num/10)*10)+10 : (num/10)*10;
		
		System.out.println(num + "�� ���� ����� 10�� ����� "+ sip);
		*/
		//������ �ڵ�
		int rest = num % 10;
		
		int result = (rest <5) ? (num / 10 * 10) : ((num / 10 + 1)*10);
		
		System.out.println(num + "�� ����� 10�� ��� :" + result);
		
	}

}
