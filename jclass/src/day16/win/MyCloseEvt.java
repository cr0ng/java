package day16.win;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyCloseEvt extends WindowAdapter{
/*
 * �� ��]
 * 	1. �� Ŭ������ ��ü�� �� �� MyFrame ��ü�� �ּ� ����ؾ� ��
 * 		���� MyFrame�� �ּҸ� ���� �޾Ƽ� ����� ���´�.
 * 
 * 
 */
	@Override
	public void mouseClicked(MouseEvent e) {
		//�������� ���α׷��� �����ϴ� ���
		System.exit(0);
		
	}
}
