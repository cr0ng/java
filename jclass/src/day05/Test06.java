package day05;
/*
  10 ~ 49 ������ �� �� ���� �ϳ��� �Է¹޾Ƽ�
 
	10 ~ 19 : �ѹ���
	20 ~ 29 : ������
	30 ~ 39 : ȸ���
	40 ~ 49 : ���ߺ�
	
	�� ��� �ݺ��ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	99�� �Է��ϸ� ����ǵ��� �ϼ���.
*/
import java.util.*;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("�μ� ��ȣ : ");
			int num = in.nextInt();
			
			if(num == 99) {
				System.out.println("*** �ݺ����� �����մϴ� ***");
				break;
			}
			
			String dname = "";
			
			switch(num/10) {
			case 1:
				dname ="�ѹ���";
				break;
			case 2:
				dname ="������";
				break;
			case 3:
				dname ="ȸ���";
				break;
			case 4:
				dname ="���ߺ�";
				break;
			default:
				dname ="���� �μ�";
				break;
			}
		
		System.out.println("�Է��� "+ num + " �μ��� "+ dname + "�̴�");	
		}
	}

}
