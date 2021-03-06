package day22;
/*
 *  char 단위로 파일에 데이터를 저장하는 프로그램을 작성하세요.
 */
import java.io.*;

public class FileWriterTest01 {

	public FileWriterTest01() {
		// 파일에 연결할 스트림 준비
		FileWriter fw = null;
		try {
			// 스트림 만들고
			fw = new FileWriter("src/day22/data/fwTest.txt");
			/*
			// 1. 한글자(2 byte)만 저장해보자.
			char ch = '한';
			fw.write(ch);
			*/
			
			
			// 2. 여러글자를 저장해보자.
			// 저장할 문자열 만들고
			String str = "char 단위로 파일에 데이터를 저장하는 프로그램을 작성해보자";
			
			/*
			//2-1. 문자배열로 처리하는 방법
			char[] buff = str.toCharArray(); // 문자열을 문자배열로 반환해주는 함수
			fw.write(buff);
			*/
			
			/*
			// 2-2. 문자열을 바로 처리하는 방법
			str = str + " : 문자열로 처리하는 방법";
			fw.write(str);
			*/
			
			/*
			 *  참고 ]
			 *  	char 단위로 텍스트 데이터만 처리하도록 되어있기 때문에
			 *  	기본함수 + 문자 처리 기능이 추가되어있다.
			 */
			
			// 여러행의 문자를 저장해보자.
			StringBuffer buff = new StringBuffer();
			buff.append("- Hortense Vlou -\n");
			buff.append("\n");
			buff.append("Desert\n");
			buff.append("\n");
			buff.append("He felt so lonely\n");
			buff.append("In this desert\n");
			buff.append("That sometimes\n");
			buff.append("He would walk backwards\n");
			buff.append("Just to see tracks in front of him.");
			
			// 파일에 기록한다.
			// 기록할 때는 문자열 데이터를 입력해야하므로 문자열로 변환해서 입력한다.
			
			fw.write(buff.toString());
			System.out.println("*** 파일 저장 완료***");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new FileWriterTest01();
	}

}
