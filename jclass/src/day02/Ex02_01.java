package day02;

import javax.swing.JOptionPane;

public class Ex02_01 {

	public static void main(String[] args) {
		/*
		 	���⼭�� javax.swing ������ �̹� �ڵ��Ǿ��ִ�
		 	JOptionPane �̶�� Ŭ������
		 	���ڿ��� �޼����� �Է¹޴� ����� �Լ�
		 	showInpuDialog()�� ����ؼ� ���ڿ��� �Է¹޵��� �Ѵ�.
		 	
		 	 �� �Լ��� GUI â�� ������� �Է¹޴´�.
		 	 (�Է� �޼��� â�� ���� �Է¹޴� �Լ��̴�)
		 	 
		 	 �� �� �Է� �����ʹ� ���ڿ��� �Է¹ް� �ȴ�.
		 	 
		 	 ���� ������ ������ ���� 
		 	 ���� ����� Ÿ������ ��ȯ������� �Ѵ�.
		*/
		
		//2. �Է¸޽��� ����ϰ�
			// showInputDialog() �Լ��� �Ű������� �ԷµǴ� ���ڿ���
			// �Է¸޼����� ��µǱ� ������ ���⼭�� �ʿ����.
		
		//3. �Է¹޾� ������ ����ϰ�
		String garo = JOptionPane.showInputDialog("���θ� �Է��ϼ���");
		String sero = JOptionPane.showInputDialog("���θ� �Է��ϼ���");
		
		//������ ��ȯ
		int width = Integer.parseInt(garo);
		int height = Integer.parseInt(sero);
		
		//4. ���� ���
		int result = width * height;
		
		//5. ���
		System.out.printf("%3s : %5d \n%3s : %5d\n%3s : %5d",
				 "����",width,"����",height,"����",result);	
		
		// ��¿� ���ڿ� ���� ������ ���
		String msg = "���� : " + width + "\n���� : " + height + "\n���� : "+result;
		// ����ϰ�
		JOptionPane.showInputDialog(null,msg);
		
	}

}
