package day07.ex;
/*
 	�ݺ��� ����]
 		
 		2g �߰� 5��
 		3g �߰� 4��
 		5g �߰� 3�� ���� ���
 		
 		15g ~ 25g �� ���Ը� �ٴ� ����� ������ ������
 		�� ����� ���� ��� ��� ���� ������ִ� ���α׷��� �ۼ��ϼ���.
 		
 */
public class Ex00_01 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 0;i <= 5;i++) {
			for(int j = 0 ; j <= 4 ; j++) {
				for(int k = 0 ; k <=3 ; k++) {
					int result = 2*i+3*j+5*k;
					if(result >=15 && result <=25){
						count++;
					}
				}
			}
		}
		System.out.println("15g ~ 25g�� ���Ը� �ٴ� ����� ��� " + count + "����");
	}

}
