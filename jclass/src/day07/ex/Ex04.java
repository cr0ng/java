package day07.ex;

import java.util.Arrays;

/*
 	�����ϰ� �ҹ��ڸ� 6���� �߻����Ѽ�
 	�迭�� ���
 	�迭�� ��� ������ �������� �ٲ㼭 
 	������ִ� ���α׷��� �ۼ��ϼ���.
 */

public class Ex04 {

	public static void main(String[] args) {
		
		char[] word = new char[6];
		char[] word1 = new char[6];
		
		for(int i = 0 ; i < word.length ; i++) {
			char ch = (char)(Math.random()*('z'-'a'+1)+'a');
			word[i] = ch;
		}
		System.out.println(Arrays.toString(word));
			
		for(int i = 0 ; i < word.length ; i++) {
			word1[i] = word[word.length-1-i];	
		}
		System.out.println();

		for(char ch : word1) {
		System.out.print(ch+" ");
		}
	}

}
