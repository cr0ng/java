package day05.ex;
/*
다음 처럼 출력되도록 프로그램을 작성하세요.

11111
22222
33333
44444
55555
------------------------------------------------------
1
22
333
4444
55555
------------------------------------------------------
	1
   22
  333
 4444
55555
--------------------------------------------------------
1
2  3
4  5  6
7  8  9  10  
11 12 13 14  15
---------------------------------------------------------
        		1
     		2  	3
  		4  	5  	6
	7  	8  	9  	10
11	12	13 	14 	15
---------------------------------------------------------
15
14  13
12  11  10
9   8   7   6
5   4   3   2   1
*/
public class Extra02 {

	public static void main(String[] args) {
		
		// 1번
		/*
		for(int i =0 ; i<5;i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}	
		*/
		
		//2번
		/*
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < i+1 ; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		*/
		
		//3번
		/*
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				
				if(j < (4-i)) {
					char ch = ' ';
					System.out.print(ch);
				}else {
					
				System.out.print(i+1);
				
				}
			}
			System.out.println();
		}
		*/
		
		//4번
		/*
		int num1 = 1;
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0 ; j < i+1 ; j++) {
				System.out.print(num1++ + "	");
			}
			System.out.println();
		}
		*/
		
		//5번
		/*
		int num = 1;
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				
				if(j < (4-i)) {
					char ch = ' ';
					System.out.print(ch);
				}else {
					
				System.out.print(num);
				num++;
				}
			}
			System.out.println();
		}
		*/
		
		//6번
		/*
		int num1 = 15;
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0; j < i+1;j++) {
				System.out.print(num1--+" ");
			}
			System.out.println();
		}
		*/
	}

}
