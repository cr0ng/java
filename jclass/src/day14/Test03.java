package day14;
/*
 	JFrame�� ��ӹ��� Ŭ������ ������.
 */
import javax.swing.*;
public class Test03 extends JFrame{

	public Test03() {
		//super();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ��ư ��� ����
		setSize(450,500);	// â ������
		// JFrame�� ��ӹ޾ұ� ������
		// �ڵ������� JFrame�� ����� �� Ŭ������ ������ �ִ� ���°� �Ǿ���.
		// ���� ������� Ŭ������ ����� ��� ����� �� �ְ� �Ǿ���.
		setVisible(true);	// ������� â�� ���̰�
	}

	public static void main(String[] args) {
		new Test03();
	}

}
