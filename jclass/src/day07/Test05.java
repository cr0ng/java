package day07;
/*

1	2	3	4	5
6	7	8	9	10
11	12	13	14	15
16	17	18	19	20
21	22	23	24	25

 */
public class Test05 {

	public static void main(String[] args) {
		
		// 1. ������
		// ����� ������ ��� �ִ� ������ ���� �ذ��ϴ� ���
		int num = 1;
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print(num++ + "	");
			}
			System.out.println();
		}
		System.out.println();
		
		// 2.ī��Ʈ ������ Ȱ���ϴ� ���
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				int no = 5*i + 1*j + 1;	// a*i + b*j + c
				System.out.print(no + "	 ");
			}
			System.out.println();
		}
	}

}
