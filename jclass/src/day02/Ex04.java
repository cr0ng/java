package day02;
/*
 	���� 4 ]
 		ģ���� �̸�, ����  , ����, ��ȭ��ȣ�� �Է¹޾Ƽ�
 		������ִ� ���α׷��� �ۼ��ϼ���.
 */
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name, tel;
		
		int age;
		double height;
		
		System.out.print("�̸� : ");
		name = in.nextLine();
		
		System.out.print("���� : ");
		age = in.nextInt();
		
		System.out.print("���� : ");
		height = in.nextDouble();
		
		in.nextLine();
		
		System.out.print("��ȭ��ȣ : ");
		tel = in.nextLine();
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + height);
		System.out.println("��ȭ��ȣ : " + tel);
	}

}
