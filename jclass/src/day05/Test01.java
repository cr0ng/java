package day05;

public class Test01 {

	public static void main(String[] args) {
		
		int no = 0;
		for(;;) {
			// ���ǽ��� ������� ������ �׻� true�� ó���� �ǰ�
			// ���� �ݺ��ϰ� �ȴ�.
			// ���� ������ ������ ����Ѵ�.
			System.out.println(++no);
			if(no==10) {
				break;
				/*
				 	break ���ɹ�
				 		�ݺ����� switch~case������ ����ϴ� ����
				 		�ǹ̴� ��� �ش� ������ �����ϼ���. ��� �ǹ��̴�
				 */
			}
		}
	}

}