package day06.ex;
/*
 	���� 2]
 		�����̰� ������(100m)�� �ö󰣴�.
 		������ 0.87m�� �ö󰡰�
 		�㿡�� 0.35m �̲����� �����´�.
 		
 		���ϸ��� �� �����̴� ���翨 �ö� ���ΰ�?
 		��, ����⿡ �ö󰡸� �̲����� ����.
 */
public class Ex02 {

	public static void main(String[] args) {
		
		double result = 0;
		int day = 0;
		
		for(int i = 1; ;i++) {
			day = i;
			
			result += (0.87 );
			System.out.print("���� : " +result+"	");
			if(result > 100.0) {
				break;
			}else {
				result -= (0.35);
			}
			System.out.print("���� : " +result);
			System.out.println();
		}
		System.out.println("\n�����̰� ����⿡ �����µ� "+day+"�� �ɸ�");
	}

}
