package day07;

import java.util.Arrays;

//깊은 복사
public class Test07 {

	public static void main(String[] args) {
		// 배열 하나를 만들고
		int[] no1 = {1,2,3,4,5};
		// 내용 출력
		System.out.println(Arrays.toString(no1));

		// 복사받을 배열을 만든다.
		int[] no2 = new int[3];
		
		//깊은 복사로 배열의 일부분만 복사한다.
		System.arraycopy(no1, 1, no2, 0, 3);
		System.out.println(Arrays.toString(no2));
		
		//no1의 세번째 방의 데이터를 8로 변경한다.
		no1[2] = 8;
		System.out.println("---------------");
		
		// 두 배열의 내용을 출력
		System.out.println(Arrays.toString(no1));
		System.out.println(Arrays.toString(no2));
	}

}
