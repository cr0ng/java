package day05;

public class Test11 {

	public static void main(String[] args) {
		// 5�� �������� ����ϴµ� ���� 5�� ���� �ǳʶٰ� ����ϼ���.
		
		int dan = 5;
		for(int i = 0 ; i < 9 ; i++) {
			int gop = i + 1;
			
			if(gop == 5) {
				//break;
				continue;
			}
			System.out.println(dan + " X " + gop + " = " + (dan * gop));
		}

	}

}
