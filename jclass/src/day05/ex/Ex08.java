package day05.ex;
/*
���� 8 ]
		3 ~ 100 ������ ���ڸ� �����ϰ� �߻����Ѽ�
		�߻��� ���ڰ� �Ҽ������� �Ǵ��ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
		
		���� ]
			�ڼ� : 1�� �ڱ��ڽ����θ� ������ �ִ� ��
			
			�� ]
				2, 3, 5, 7, ....
*/

public class Ex08 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*(100-3+1)+3);
		int n = 0;
		
		for(int i = 2 ; i < num ; i++ ) {
			if(num % i == 0) {
				System.out.println(num+"�� �Ҽ��� �ƴմϴ�");
				n++;
				break;	
			}
		}
		if(n == 0) {
			System.out.println(num +"�� �Ҽ��Դϴ�.");
		}
		
		//�������ڵ�
		lbl:
			for(int i = 3; i <= 100; i++) {
				
				for(int j = 2; j < i ; j++ ) {
					if(i % j == 0) {
						continue lbl;
					}
				}
				System.out.print(i + ", ");
			}
	}

}
