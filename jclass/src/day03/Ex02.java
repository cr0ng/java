package day03;
/*
 	0 ~ 255 ������ �ƽ�Ű �ڵ尪�� ������ ������ ���ڸ� �߻����Ѽ�
 	�� ���ڰ� ���������� �ƴ��� �Ǻ��ؼ� ����ϼ���.
 */
public class Ex02 {

	public static void main(String[] args) {
		int hi = 255;
		int lo = 0;
		
		char ch = (char)(Math.random()*(hi-lo+1)+lo);
		String str = ((ch >= 'A' & ch <='Z') || (ch >= 'a' & ch <='z')) ? "�������̴�" : "�����ڰ� �ƴϴ�";

		System.out.println(ch + "�� "+ str);
	}

}
