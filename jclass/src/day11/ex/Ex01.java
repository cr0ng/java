package day11.ex;
/*
 	�ﰢ���� ������ ����� Ŭ����(Semo)�� �����ϰ�
 	�� Ŭ������ Ÿ���� �����͸� �����
 	�迭�� ����
 	�غ� : xx - ���� : xx - ���� : xxx
 	�� �������� ����ϼ��� .
 	�غ��� ���̴� �ν��Ͻ��� ��������� 5 ~ 15 ������ ������ �����ϰ� 
 	�Է��� �ǵ��� ó���ϼ���.
 	������ �Լ��� ó���ϼ���.
 */
public class Ex01 {
	public Ex01() {
		Semo[] s = new Semo[5];
		
		for(int i = 0 ; i < s.length ; i++) {
			s[i] = new Semo();
		}
		
		for(int i = 0 ; i < s.length ; i++) {
			int under = s[i].under;
			int height = s[i].height;
			double area = s[i].area();
			System.out.printf("�غ� : %2d - ���� : %2d - ���� : %5.2f \n",under,height,area);			
		}	
	}
	
	
	public static void main(String[] args) {
		new Ex01();
	}

}
