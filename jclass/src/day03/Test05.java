package day03;

public class Test05 {

	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 20;
		String str = no1 > no2 ?
				"no1이 no2보다 큽니다." :
				"no1이 no2보다 작습니다.";
		
		System.out.println("no1 > no2 : " + str);
		
		System.out.println("no1 > no2 : " + 
				(no1 > no2 ? "no1이 no2보다 큽니다." : "no1이 no2보다 작습니다."));
	}

}
