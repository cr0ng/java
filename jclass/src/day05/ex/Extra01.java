package day05.ex;
/*
extra 01 ]

*
**
***
****
*****

----------------------------------------------

*****
****
***
**
*

-------------------------------------------------
    *
   **
  ***
 ****
*****
---------------------------------------------------
*****
 ****
  ***
   **
    *
---------------------------------------------------
    *
   ***
  *****
 *******
  *****
   ***
    *
    
    a * i + b * j + c
*/

public class Extra01 {

	public static void main(String[] args) {
		
		
		 //1��
		 /* 
		for(int i = 0 ; i < 5;i++) {
			for(int j = 0 ; j < (i+1) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		 //2��
		/*
		for(int i = 0 ; i < 5;i++) {
			for(int j = 0  ; j < 5-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//3��
		
		for(int i = 0 ; i < 5;i++) {
			for(int j = 0  ; j < 5 ; j++) {
				char ch = ' ';
				if(j >= (4-i)) {
					ch = '*';
				}
				System.out.print(ch);
			}
			System.out.println();
		}
		
		
		//4��
		/*
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5; j++ ) {
				char ch = '*';
				if(j < i) {
					ch = ' ';
				}
				System.out.print(ch);
			}
			System.out.println();
		}
		*/
		
		//5��
		/*
		for(int i = 0 ; i < 7 ; i++) {
			for(int j = 0 ; j < (i*2)+1; j++) {
				char ch = ' ';
				if(j < (3-i) || j >) {
					ch = '*';
				}
				System.out.print(ch);
			
		}
			System.out.println();
		}
		*/
	}
}

