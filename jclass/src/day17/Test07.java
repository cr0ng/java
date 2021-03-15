package day17;

import java.util.*;
public class Test07 {

	public Test07() {
		Random rdn = new Random();
		for(int i = 0 ; i < 100 ; i++ ) {
			System.out.print(rdn.nextInt(10) + ", ");
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}