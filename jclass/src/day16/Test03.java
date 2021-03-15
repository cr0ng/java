package day16;

import java.io.*;

public class Test03 {

	public Test03() {
		File file = new File("C:\\Users\\yujin\\git\\java\\jclass\\src\\day15");
		//
		String[] list = file.list(new MyFilter());
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("----------------------");
		System.out.println("------« ≈Õ∏µ X--------");
		String[] list1= file.list();
		for(String s : list1) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}

class MyFilter implements FilenameFilter{
	
	@Override
	public boolean accept(File dir, String name) {
		if(name.startsWith("T")) {
			return true;
		}
		return false;
		
	}
}