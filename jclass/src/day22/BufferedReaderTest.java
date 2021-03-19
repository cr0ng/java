package day22;
/*
 *  day22.data.desert.poem을 읽어보자
 *  BufferedReader 스트림을 사용해서 읽어보자.
 */
import java.io.*;

public class BufferedReaderTest {

	public BufferedReaderTest() {
		// 스트림 준비
		// 타겟스트림 준비
		FileReader fr = null;
		// 필터스트림 준비
		BufferedReader br = null;
		
		try {
			// 타겟스트림을 장치(파일)에 연결한다.
			fr = new FileReader("src/day22/data/desert.poem");
			// 타겟스트림에 연결하는 필터스트림을 만든다.
			br = new BufferedReader(fr);
			
			// 몇 번 읽어야할지 모르므로 반복해서 처리
			for(;;) {
				String line = br.readLine();
				// readLine() 데이터의 한 행을 읽는 함수인데
				// 줄바꿈기호 "\r\n"을 만나면 그 이전까지만 읽어온다.
				if(line == null) {
					// 읽어온 데이터가 없는 경우
					break;
				}
				System.out.println(line);
				// println() 함수는 출력후 줄바꿈을 해주는 함수
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				br.close();
			}catch (Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new BufferedReaderTest();
	}

}
