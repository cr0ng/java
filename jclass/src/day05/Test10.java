package day05;

/*
 	구구단을 외자...
*/
public class Test10 {

	public static void main(String[] args) {
		for(int dan = 2; dan <=9; dan++) {
			
			System.out.println("***** " + dan + "단 *****");
			for(int i = 0 ; i < 9; i ++) {
				System.out.println(dan + " X "+ (i+1) + " = " +(dan*(i+1)));
			}
			System.out.println();
		}
	}

}
