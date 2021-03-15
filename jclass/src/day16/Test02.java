package day16;

public class Test02 {

	public Test02() {
		MyInterface01 i01 = new Test02_01();
		MyInterface01 i02 = new Test02_02();
		
		System.out.println("i01.num : " + i01.num);
		System.out.println("i02.num : " + i02.num);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
