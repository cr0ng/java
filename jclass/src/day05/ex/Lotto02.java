package day05.ex;
/*
	�ζ� 1������ ���� ����ϼ���.
	��, while �ݺ������� ó���ϼ���.
 */
public class Lotto02 {

	public static void main(String[] args) {
		//��º��� �����
		String lotto = "| ";
		
		// ī��Ʈ���� �����
		int i = 0;
		
		//�ݺ��ϰ�
		while(i < 6) {
			//������ ���� �����
			int no = (int)(Math.random()*45+1);
			
			//�����̱�
			lotto += (no + " | ");
			
			//������
			i++;
		}
		
		System.out.println(lotto);
	}

}
