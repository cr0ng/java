package day05;

//���ڸ� ���ڿ��� �ٲٴ� ���...
public class Test03 {

	public static void main(String[] args) {
		char ch = (char)(Math.random()*256);
		// �ƽ�Ű�ڵ� ���ڴ� �ڵ尪�� 0 ~ 255 ���� 1����Ʈ�� �뷮�� �����͸� ������.
		
		// ch�� ���ڷ� ������.
		String str = ch + "";
		System.out.println(str);
	}

}
