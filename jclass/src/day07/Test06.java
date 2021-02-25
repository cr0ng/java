package day07;

// 얕은 복사
public class Test06 {

	public static void main(String[] args) {
		int[] no1 = new int[5];
		System.out.println("no의 첫번째 데이터 : " + no1[0]);
		
		// no1을 복사해서 배열을 만든다.
		int[] no2 = no1;
		System.out.println("no2의 첫번째 데이터 : "+ no2[0]);
		
		// no1의 첫번째 데이터를 수정
		no1[0] = 110;
		
		// 출력
		System.out.println("no1의 첫번째 데이터 : " + no1[0]);
		System.out.println("no1의 첫번째 데이터 : " + no2[0]);
		
		/*
		 	결론적으로 주소만 복사하게 되면
		 	데이터는 공유하게 된다.
		 */
	}

}
