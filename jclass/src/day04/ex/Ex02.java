package day04.ex;

/*
 	0 ~ 25 ������ ���� �����ϰ� �ϳ��� �߻����Ѽ�
 	
 		0	-	0�Դϴ�
 		2�� ���	-	2�� ����Դϴ�.
 		3�� ��� 	-	3�� ����Դϴ�.
 		2�� 3�� ����ΰ��	-	2�� 3�� ����Դϴ�.
 		�� �̿��� ���	-	������ ���Դϴ�.
 	�� ������ִ� ���α׷��� �ۼ��ϼ���.
 	
 */
public class Ex02 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*26);
		System.out.println("���� �߻� �� : " + num);
		
		//if ~ else if��
		/*
		if(num == 0) {
			System.out.println("0�Դϴ�");
		}else if(num % 2 == 0) {
			if(num % 3 != 0) {
				System.out.println("2�� ����Դϴ�.");
			}else {
				System.out.println("2�� 3�� ����Դϴ�.");
			}
		}else if(num % 3 == 0 ) {
			System.out.println("3�� ����Դϴ�.");
		}else
			System.out.println("������ �� �Դϴ�.");
		*/
		
		//switch��
		if(num ==0 ) {
			System.out.println("0�Դϴ�.");
		}
		switch(num%6) {
		case 0:
			System.out.println("2�� 3�� ����Դϴ�.");
			break;
		case 1: 
			System.out.println("������ �� �Դϴ�.");
			break;
		case 2: 
			System.out.println("2�� ����Դϴ�.");
			break;
		case 3: 
			System.out.println("3�� ����Դϴ�.");
			break;
		case 4: 
			System.out.println("2�� ����Դϴ�.");
			break;
		case 5: 
			System.out.println("������ �� �Դϴ�.");
			break;
		default :
			
		}
	}

}
