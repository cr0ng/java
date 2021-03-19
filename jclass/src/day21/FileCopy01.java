package day21;

import java.io.*;
public class FileCopy01 {

	public FileCopy01() {
		// 할 일
		// 스트림은 단방향
		// 복사는 한곳에서 읽어서 다른곳에 그대로 쓰면 됨
		// 따라서 스트림으 두 개 준비되어야 함
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			// 스트림을 만들고
			fin = new FileInputStream("C:\\class\\java\\example\\day21\\images.jpg");
			fout = new FileOutputStream("src/day21/images.jpg");
			
			// 한 곳에서 읽어서 그대로 다른곳에 쓴다
			// 몇 번 읽어야할지 모른다.
			
			while(true) {
				//byte 배열 준비하고
				byte[] buff = new byte[1024];
				// 읽어서 배열에 기억하고
				int len = fin.read();
				if(len == -1) {
					break;
				}
				fout.write(buff,0,len);
			}
			System.out.println("*** 복사 완료 ***");
		}catch(Exception e) {
			
		}finally {
			try {
				fout.close();
				fin.close();
			}catch(Exception e) {}
		}
		
		
	}

	public static void main(String[] args) {
		new FileCopy01();
	}

}
