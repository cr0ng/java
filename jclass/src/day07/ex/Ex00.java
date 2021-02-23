package day07.ex;
/*
 
3	6	9	12	15
18	21	24	27	30
33	36	39	42	45
48	51	54	57	60
63	66	69	72	75

 */
public class Ex00 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ;j++) {
				int num = 15 * i + 3 * j + 3;
				System.out.print(num + "	");
			}
			System.out.println();
		}
		System.out.println();
		
		int sam = 1;
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ;j++) {
				System.out.print(3*(sam++) + "	");
			}
			System.out.println();
		}
	}

}
