package day22;
/*
 * ObjectTest02에서 저장한 map.txt
 * 파일을 읽어서 출력해보자.
 */

import java.io.*;
import java.util.*;

public class MapReadTest {

	public MapReadTest() {

		FileInputStream fin = null;
		ObjectInputStream oi = null;
		
		try {
			fin = new FileInputStream("src/day22/data/map.txt");
			oi = new ObjectInputStream(fin);
			
			HashMap map = (HashMap) oi.readObject();
			
			System.out.println(map);
			
			System.out.println();
			System.out.println("이름 : " + map.get("name"));
			System.out.println("성별 : " + map.get("gen"));
			System.out.println("나이 : " + map.get("age"));
			System.out.println("주소 : " + map.get("addr"));
			System.out.println("메일 : " + map.get("mail"));
			System.out.println("전화 : " + map.get("tel"));
			System.out.println("키 : " + map.get("height"));
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
				oi.close();
			}catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new MapReadTest();
	}

}
