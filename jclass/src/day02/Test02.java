package day02;
/*
 	ģ���� �̸��� �Է¹޾Ƽ�(showInputDialog()
 	�޽��� â�� ����� ���(showMessageDialog())���ִ� ���α׷� �ۼ�
 */
import javax.swing.*;
public class Test02 {

	public static void main(String[] args) {
		// �Է�â�� ����� �Էµ����͸� ������ ����Ų��.
		String name = JOptionPane.showInputDialog("ģ���� �̸��� �Է��ϼ���");
		
		System.out.println("�Է¹��� ģ���� �̸�  :"+name);
		// ���â�� ����� �����͸� ����Ѵ�.
		JOptionPane.showMessageDialog(null, "ģ���̸� : "+ name);
	}

}
