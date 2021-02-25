package day07.ex;

import java.util.Arrays;

/*
 	랜덤하게 소문자를 6개를 발생시켜서
 	배열에 담고
 	배열에 담긴 내용을 역순으로 바꿔서 
 	출력해주는 프로그램을 작성하세요.
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
