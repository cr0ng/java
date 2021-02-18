package day02;

public class Test07 {

	public static void main(String[] args) {
		int no = 20;
		System.out.println("1. no : " + no++); //20
		System.out.println("2. no : " + ++no); //22
		System.out.println("3. no : " + no); //22
		
		int num = 30;
		System.out.println("4. num : " + num--);
		System.out.println("5. num : " + ++num);
	}

}
