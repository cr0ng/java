package day05;

public class Test13 {

	public static void main(String[] args) {
		// �������� ����ϴµ� 5���� ���� 5������ ����ϰ� ���� ���� ����ϼ���.
		
		for(int dan = 2 ; dan < 10; dan++) {
			System.out.println("*** "+dan+" ��***");
				for(int gop = 1 ; gop < 10 ; gop++) {
					System.out.println(dan + " X " + gop + " = " + (dan * gop));
					
				}
				System.out.println();
		}
	}

}