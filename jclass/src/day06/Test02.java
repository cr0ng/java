package day06;

/*
 	1	-2	+3	-4	+5	-6	... �����ϴµ�
 	
 	ó�� 100�� �ѱ�� ����� ������ ȸ���� ����ϼ���.
 */
public class Test02 {

	public static void main(String[] args) {
		int sum = 0;
		int gop = -1;
		int num = 0;
		
		for(int i = 0 ; ; i++) {	//���ǽĿ� �ƹ��͵� ������� ������ �׻� true�� ó��
			gop = gop * -1;
			int no = i * gop;
			sum = sum + no;
			
			num = i;
			if(sum > 100) break;
			// if ���ǹ��� �ܿ� �̷��� ������ ������ ����� �ϳ��� ���� ����ȣ�� ���� ����
			
		}
		System.out.println("ó�� 100�� �ѱ�� ȸ�� : "+num);

	}

}
