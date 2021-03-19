package day22;

/*
 * PrintWriter 스트림을 이용해서 저장해보자.
 * 
 * A Drinking Song

William Butler Yeats

Wine comes in at the mouth
And love comes in at the eye;
That’s all we shall know for truth
Before we grow old and die.
I lift the glass to my mouth,
I look at you, and sigh.

 */

import java.io.*;

public class PrintWriterTest {

	public PrintWriterTest() {
		// 스트림 준비
		// PrintWriter도 파일에 직접 연결할 수 있는 필터스트림
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("src/day22/data/darkingSong.poem");

			// 파일에 내용을 기록
			pw.println("A Drinking Song");
			pw.println("");
			pw.println("William Butler Yeats");
			pw.println("");
			pw.println("Wine comes in at the mouth");
			pw.println("And love comes in at the eye;");
			pw.println("That’s all we shall know for truth");
			pw.println("Before we grow old and die.");
			pw.println("I lift the glass to my mouth,");
			pw.println("I look at you, and sigh.");

			System.out.println("*** 작업 종료 ***");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pw.close();
				//
				//			
			}catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new PrintWriterTest();
	}

}
