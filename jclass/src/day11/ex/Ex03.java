package day11.ex;
/*
 	�ﰢ���� 5�� ����� �迭�� �����
 	�� �ﰢ���� ������ ����ϼ���.
 	��, �ﰢ���� ���� ���� ������ �Լ��� ���� ó���ϼ���.
 	(==> �����ڿ��� ó������ �ʵ��� �ϼ���.)
 	��� �Լ��� �ﰢ�� Ŭ�������� ����Լ��� ������ ����
 	�Լ��� ȣ���ؼ� ó���ϵ��� �ϼ���.
 */
public class Ex03 {

	public Ex03() {
		Samgak[] sam = new Samgak[5];
		
		// �ν��Ͻ� ����
		for(int i = 0 ; i < sam.length ; i++) {
			sam[i] = new Samgak();
		}
		
		// ��������
		for(int i = 0 ; i < sam.length ; i++) {
			sam[i].width();
			sam[i].height();
			sam[i].area();
		}
		
		// ���
		for(Samgak s : sam) {
			s.toPrint();
		}
	}
	public static void main(String[] args) {
		new Ex03();
		
	}

}
