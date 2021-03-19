package day22;
/*
 * ObjectTest02���� ������ map.txt
 * ������ �о ����غ���.
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
			System.out.println("�̸� : " + map.get("name"));
			System.out.println("���� : " + map.get("gen"));
			System.out.println("���� : " + map.get("age"));
			System.out.println("�ּ� : " + map.get("addr"));
			System.out.println("���� : " + map.get("mail"));
			System.out.println("��ȭ : " + map.get("tel"));
			System.out.println("Ű : " + map.get("height"));
			
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
