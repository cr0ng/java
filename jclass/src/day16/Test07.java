package day16;

public class Test07 {

	public Test07() {
		// 1 ~ 10 ������ ������ �����ϰ� �߻����Ѽ�
		// 5�� �߻��ϸ� ������ ���ܸ� �߻����Ѻ���.
		
		int no = 0;
		
		try {
			while(true) {
			
				no = (int)(Math.random()* 10 + 1);
				
				if(no == 5) {
					throw new Exception();
				}
			}
		}catch(Exception e) {
			System.out.println("���ܹ߻�");
			e.printStackTrace();
		}
	}
	
		//System.out.println("no : " + no);
		


	public static void main(String[] args) {
		new Test07();
	}

}
