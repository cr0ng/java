package day18;

/*
 *  ���� ��ǻ���� ��¥�� �ð��� ����غ���.
 *  
 */

import java.util.*;

public class Test06 {

	public Test06() {
		Date date = new Date();
		//toPrint(date);
		//System.out.println();
		for(int i = 0 ; i < 10 ; i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
			date = new Date();
			toPrint(date);
		}
	}
	
	public void toPrint(Date date) {
		
		int year = date.getYear() + 1900;
		// �⵵�� ������ 1900���� �������� �ϱ� ������
		// ������ �����Ϳ� 1900�� ������� ��Ȯ�� �⵵�� ����
		System.out.print(year + "�� ");
		int month = date.getMonth() + 1;	
		System.out.print(month + "�� ");
		// ���� ������ 0���� ����ϱ� ������ ��Ȯ�� ���� +1 ����� ��
		int day = date.getDate();
		System.out.print(day + "�� ");
		// ������ 0 ~ 6������ ���ڷ� ��ȯ (�� ~ ��)
		int week = date.getDay();
		String sweek = getSweek(week); 
		//System.out.println(sweek);
		System.out.print(sweek + " ");
		
		int hour = date.getHours();
		System.out.print(hour + "�� ");
		int minute = date.getMinutes();
		System.out.print(minute + "�� ");
		int sec = date.getSeconds();
		System.out.print(sec + "�� ");
		
		System.out.println();
		
	}
	
	public String getSweek(int week) {
		
		String sweek = "";
		
		switch(week) {
		case 0: 
			sweek = "�Ͽ���";
			break;
		case 1: 
			sweek = "������";
			break;
		case 2: 
			sweek = "ȭ����";
			break;
		case 3: 
			sweek = "������";
			break;
		case 4: 
			sweek = "�����";
			break;
		case 5: 
			sweek = "�ݿ���";
			break;
		case 6: 
			sweek = "�����";
			break;
		}
		return sweek;
	}

	public static void main(String[] args) {
		new Test06();

	}

}
