package day03;
/*
 ���� ]
 	charAt(index)
 	==> ���ڿ��� Ư����ġ�� ���ڸ� ��ȯ���ִ� �Լ�
 	
 	�� ]
 	 String str = "abcd";
 	 
 	 char ch = str.charAt(2);  ==> c 
 */
import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���ĺ� �� ���ڸ� �Է��ϼ��� : ");
		char al = in.next().charAt(0);
		
		if(al >= 'A' && al < 'Z') {
			char lo = (char)(al + ('a'-'A'));
			System.out.println("�빮�ڸ� �ҹ��ڷ� : " + lo);
		}else if(al >= 'a' && al <= 'z'){
			char hi = (char)(al - ('a'-'A'));
			System.out.println("�ҹ��ڸ� �빮�ڷ� : " + hi);
		}else
			System.out.println("���ĺ��� �ƴ�");

	}
}
