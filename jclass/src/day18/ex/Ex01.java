package day18.ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 	���� 1]
 		���̵� ���Խ� �˻縦 �ϴ� ���α׷��� �ۼ��ؼ� �����ϼ���.
 		
 		���̵� ������
 			ù���ڴ� �ҹ��ڷ� �����ϰ�
 			������ ���ڴ� ���ڷ� ������.
 			8�� ������ ���̵� ����ؾ� �Ѵ�.
 			�����ڿ� ���ڸ� ����ϴ� ������ �Ѵ�.
 			
 */
public class Ex01 {

	public Ex01() {
		
		String id = "abcdery7";
		String pat = "[a-z][a-zA-Z0-9]{6}[0-9]";
		Pattern p = Pattern.compile(pat);
		
		Matcher mat = p.matcher(id);
		
		
		if(mat.matches()) {
			System.out.println("�ùٸ� ���̵�");
		}else {
			System.out.println("�� �ùٸ� ���̵�");
		}
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
