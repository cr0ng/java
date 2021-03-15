package day16;

public class Test07 {

	public Test07() {
		// 1 ~ 10 사이의 정수를 랜덤하게 발생시켜서
		// 5가 발생하면 강제로 예외를 발생시켜보자.
		
		int no = 0;
		
		try {
			while(true) {
			
				no = (int)(Math.random()* 10 + 1);
				
				if(no == 5) {
					throw new Exception();
				}
			}
		}catch(Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
		}
	}
	
		//System.out.println("no : " + no);
		


	public static void main(String[] args) {
		new Test07();
	}

}
