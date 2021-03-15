package day20;

/*
 *  Properties로 Map 데이터를 사용하다가 
 *  파일로 저장해보자.
 */
import java.io.*;
import java.util.*;

public class Test11 {

	
	public Test11() {
		Properties prop = new Properties();
		// Properties 도 Map의 일종이므로 데이터를 추가할 수도 있다.
		prop.put("name","보아핸콕");
		prop.put("age","31");
		prop.put("tel","010-2222-2222");
		prop.put("addr","여인섬");
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day20/data/boa.txt");
			// 위 명령은 데이터를 전달할 통로만 준비한 것이므로
			// 실제 데이터가 전달된 것은 아님
			prop.store(fout, "보아핸콕 기밀 정보 : 주석문에 삽입될 내용...");
			// 위 명령이 정상적으로 실행되면 파일에 내용이 저장이 된 상태가 된다.
			System.out.println("***저장완료***");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Test11();
	}

}
