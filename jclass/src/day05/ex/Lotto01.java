package day05.ex;

/*
 * 	�ζ� �� ������ ��������.
 * 
 * 	�ζ� ������
 * 		1 ~ 45 ������ ���ڸ� 6���� �ߺ��� ���� �ʰ� �����ؼ� ���������.
 */
public class Lotto01 {

	public static void main(String[] args) {
		
		for(int j = 0; j <5;j++) {
			//��¿� ����� ���� �����
			String lotto = "";
			
			// 6�� �ݺ��ϰ�
			for(int i = 0; i < 6 ; i++) {
				// 1 ~ 45 ������ ������ �����ϰ� �ϳ� �߻���Ű�� ..
				int no = (int)(Math.random()*45+1);
				
				// ��º����� �����̰�
				lotto = lotto + no + " | "; 
			}
			//������ְ�
			System.out.println(lotto);
		}
	}

}
