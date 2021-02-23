package day07;
/*
 	1 ~ 10 까지 숫자를 순서대로 기억할 배열을 만들고
 	이 숫자들을 랜덤하게 섞어서 출력되도록 해보자.
 	
 	원리 ]
 		배열의 특정 위치 2개를 랜덤하게 만들어서 데이터를 바꾼다.
 		이 횟수를 많이 하면 할수록 데이터가 섞일 가능성이 많아진다.
 */
public class Test02 {

	public static void main(String[] args) {
		// 1 ~ 10 까지 기억하는 배열을 만든다.
		// int[] num = {1,2,3,4,5,6,7,8,9,10};
		// int[] num = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		int[] num = new int[10];
		for(int i = 0 ; i < 10 ; i++) {
			num[i]=i+1;
		}
		
		// 랜덤한 두 위치값을 만들어서 
		// 데이터를 바꾼다. 100번...
		
		for(int i = 0 ; i < 100 ; i ++) {
			int pos1 =(int)(Math.random()*10);
			int pos2 =(int)(Math.random()*10);
			
			// 두 위치의 데이터를 바꾼다.
			// 먼저 변수에 하나의 위치값을 기억시킨다.
			int tmp = num[pos1];
			
			num[pos1]=num[pos2];	// num[pos1] == num[pos2]
			
			num[pos2]=tmp;
			
			System.out.print(pos1 + ", ");
			
		}
		System.out.println();
		
		// 출력
		System.out.print("| " );
		for(int no : num) {
			System.out.print(no + " | ");
		}
		
		

	}

}
