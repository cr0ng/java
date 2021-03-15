package day18;

import java.text.DecimalFormat;
import java.util.*;

public class Test08 {

	public Test08() {
		float no = 32456.45678f;
		/*
		 *  �� ���ڸ� 3�ڸ����� , �� ���̰�
		 *  �Ҽ��� ���ϴ� 3�ڸ������� ����ϵ���
		 */
		
		// ���� ���� ���ϰ�
		DecimalFormat form1 = new DecimalFormat("00,000,000.000");
		DecimalFormat form2 = new DecimalFormat("##,###,###.###");
		// ���Ŀ� �´� ���ڿ��� ����� �ش�
		String str1 = form1.format(no);
		String str2 = form2.format(no);
		// format(double number) ==> ���ڸ� ������ �ִ� ���ڿ��� ��ȯ�����ִ� �Լ�
		System.out.println(str1);
		System.out.println(str2);
	}

	public static void main(String[] args) {
		new Test08();

	}

}
