package day05.ex;
/*
	�����ϰ� ���ڸ� ���ڸ� �ϳ� �߻����Ѽ�
	����ڰ� �� ���ڸ� �˾Ƹ��ߴ� ������ �����ϼ���.
	������� ���ں��� ū ���� �Է��� ���� - "ū���Դϴ�."
				�������� �Է��� ���� - "�������Դϴ�."
	�� ��µǵ����ϰ�
	������ ���⶧���� �ݺ��ϵ��� �ϼ���.
 */
import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		int dap = (int)(Math.random()*(99-10+1)+10);
		
		Scanner in = new Scanner(System.in);

		do {
			
			System.out.print("���ڸ� ���߼��� : ");
			int num = in.nextInt();
			
			
			if(num>dap) {
				System.out.println("ū���Դϴ�.");
			}else if(num<dap){
				System.out.println("�������Դϴ�.");
			}else if(num == dap){
				System.out.println("*** ���ڸ� ������ϴ�! ***");
				System.out.println("������ " + dap);
				break;
			}else {
				System.out.println("�߸��Է��߽��ϴ�.");
			}
			
		}while(true);
	}

}
