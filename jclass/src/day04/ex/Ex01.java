package day04.ex;

/*
  	String Ŭ������ equals() �Լ��� ����ؼ� ó���ϼ���.
  	
  	���ڿ��� �Է¹޾Ƽ�
  		"M"		-	�����Դϴ�.
  		"��"		-	�����Դϴ�.
  		"����"	-	�����Դϴ�.
  		"����"	-	�����Դϴ�.
  		"F"		-	�����Դϴ�.
  		"��"		-	�����Դϴ�.
  		"����"	-	�����Դϴ�.
  		"����"	-	�����Դϴ�.
  		�̿��� ���� -	�߸��Է��߽��ϴ�.
  	�� ��µǴ� ���α׷��� �ۼ��ϼ���.
  	
  	if ~ else if ����
  	switch ~ case �������� ó���ϼ���.
 */
import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		String gen = in.nextLine();
		
		//if ~ else if
		/*
		if(gen.equals("M")) {
			System.out.println("�����Դϴ�.");
		}else if(gen.equals("��")) {
			System.out.println("�����Դϴ�.");
		}else if(gen.equals("����")) {
			System.out.println("�����Դϴ�.");
		}else if(gen.equals("����")) {
			System.out.println("�����Դϴ�.");
		}else if(gen.equals("F")) {
			System.out.println("�����Դϴ�.");
		}else if(gen.equals("��")) {
			System.out.println("�����Դϴ�.");
		}else if(gen.equals("����")) {
			System.out.println("�����Դϴ�.");
		}else if(gen.equals("����")) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�߸��Է��߽��ϴ�.");
		}
		*/
		
		/*
		if((gen.equals("M"))||(gen.equals("��"))||(gen.equals("����"))||(gen.equals("����"))) {
			System.out.println("�����Դϴ�.");
		}else if((gen.equals("F"))||(gen.equals("��"))||(gen.equals("����"))||(gen.equals("����"))) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�߸��Է��߽��ϴ�.");
		}
		*/
		
		//switch��
		switch(gen) {
			case "M" :
				System.out.println("�����Դϴ�.");
				break;
			case "��" :
				System.out.println("�����Դϴ�.");
				break;
			case "����" :
				System.out.println("�����Դϴ�.");
				break;
			case "����" :
				System.out.println("�����Դϴ�.");
				break;
			case "F" :
				System.out.println("�����Դϴ�.");
				break;
			case "��" :
				System.out.println("�����Դϴ�.");
				break;
			case "����" :
				System.out.println("�����Դϴ�.");
				break;
			case "����" :
				System.out.println("�����Դϴ�.");
				break;
			default :
				System.out.println("�߸��Է��߽��ϴ�.");				
		}
		
	}

}
