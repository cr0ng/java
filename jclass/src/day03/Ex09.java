package day03;
/*
 ���� 9 ]
	�Խù��� �Խ��ǿ� ����ϴµ�
	�ϳ��� �Խ��� ���������� �Խù��� 15���� ����� �� �ִ�.
	�Խù��� ������ �����ϰ� �߻���Ų�� 
	�� ���� �������� �ʿ����� ����ؼ� ������ִ�
	���α׷��� �ۼ��ϼ���.
 */
public class Ex09 {

	public static void main(String[] args) {
		int no = (int)(Math.random()*101);
		int page = 0;
		
		System.out.println("�Խñ� ���� : " + no);
		
		if(no == 0) {
			page = 1;
		}else {
			if(no % 15 != 0) {
				page = (no /15) +1;
				System.out.println("�Խ��� ������ �� : " + page);
			}else {
				page = no/15;
				System.out.println("�Խ��� ������ �� : " + page);
			}
		}
	}

}
