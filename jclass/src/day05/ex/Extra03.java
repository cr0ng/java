package day05.ex;
/*
 	구구단을 출력하는데
 	
 	2 * 1 = 2	3 * 1 = 3	4 * 1 = 4	5 * 1 = 5
 	2 * 2 = 4	3 * 2 = 6
 	...
 	2 * 9 = 18	...
 	
 	6 * 1 = 6	7 * 1 = 7	8 * 1 = 8	9 * 1 = 9
 	... 
 */
public class Extra03 {

	public static void main(String[] args) {
		for(int k = 2 ; k <= 6 ;k++) {
			for(int i = 1 ; i <= 9; i++ ) {
				for(int j = k ; j < k + 4 ; j++) {
					System.out.print(j + " X " + i + " = " + (i * j)+"	");
					
				}	
				System.out.println();
			}
			System.out.println("------------------------------------------------------------");
			k+=3;
		}
		
		
	}

}
