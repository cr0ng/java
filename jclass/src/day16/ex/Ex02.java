package day16.ex;
/*
 *  String[] str = {"123","456", "789" ....};
 *  �� �ִ� ���
 *  �� ���ڿ��� ������ ��ȯ�� ���� �հ� ����� ���ϴ� ���η��� �ۼ��ϼ���.
 *  
 *  ��, �߻��� �� �ִ� ���ܸ� �����Ͽ� ��� ó���ϼ���.
 *  
 *  	1. �迭�� �ε����� ��� ���
 *  
 *  	2. ���ڷ� ��ȯ�� �Ұ����� ���
 *  
 *  	3. ����� ����ϴµ� 0���� �������� ���...
 *  
 */
public class Ex02 {

	public Ex02() {
		
		System.out.println(plus());
	}
	
	
	public int plus() throws Exception  {
		int result = 0;
		int no = 0; 
		
		String[] str = {"123","456", "789"};
		
		try {
			for(int i = 0 ; i < str.length; i++) {
				no = Integer.parseInt(str[i]);
				
				result += no;
			}
		}catch() {
			
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		new Ex02();

	}

}
