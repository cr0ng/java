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
		
		
		 //1번
		 /* 
		for(int i = 0 ; i < 5;i++) {
			for(int j = 0 ; j < (i+1) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		 //2번
		/*
		for(int i = 0 ; i < 5;i++) {
			for(int j = 0  ; j < 5-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//3번
		/*
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
		*/
		
		//4번
		for(int i = 0 ; i < 5 ; i ++) {
			//for(int j = 0 ; j ; j++) {
				
			//}
		}

	}

}
