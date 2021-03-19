package day22;

/*
 * 이전 예제에서 만든 fwTest.txt 파일을 복사해서
 * desert.poem 파일을 만들어보자.
 */

import java.io.*;

public class TextFileCopy {

	public TextFileCopy() {
		// 스트림을 준비한다.
		// 복사를 해야하므로 읽는 스트림과 쓰는 스트림 두개가 준비되어야한다.
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("src/day22/data/fwTest.txt");
			fw = new FileWriter("src/day22/data/desert.poem");
			
			// 몇번 실행되어야할지 모르므로 반복해서 처리
			while(true) {
				// 복사는 한쪽에서 읽어서 한 쪽에서 읽은 결과를 저장하면 된다.
				// 읽은 결과를 바로 저장하는 형탵로 작성해보자.
				char[] buff = new char[1024];
				
				// 데이터 읽고
				int len = fr.read(buff);
				if(len == -1) {
					break;
				}
				
				// 데이터 쓰고
				fw.write(buff,0,len);
			
			}
			System.out.println("*** 파일 복사 성공 ***");
			
		}catch (Exception e) {
			System.out.println("### 파일 복사 실패 ###");
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				fr.close();
			}catch (Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new TextFileCopy();
	}

}
