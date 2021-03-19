package day21;

/*
 *  파일에 친구의 정보를 저장하자.
 *  저장할 정보는
 *  	이름 :	String
 *  	나이 : int
 *  	신장 : double
 *  	성별 : boolean
 *  	전화 : String
 *  	메일 : String
 */
import java.io.*;

public class DataOutputTest01 {

	public DataOutputTest01() {
		// 1. 타겟스트림 준비
		FileOutputStream fout = null;
		DataOutputStream dout = null;
		
		try {
			fout = new FileOutputStream("src/day21/data/friend.txt");
			dout = new DataOutputStream(fout);
			
			// 데이터 준비
			String name = "제니";
			int age = 26;
			double height = 170.0;
			boolean gen = true;
			String tel = "010-1111-1111";
			String mail = "jenny@increpas.com";
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			}catch(Exception e) {}
		
		}
	}

	public static void main(String[] args) {
		new DataOutputTest01();
	}

}
