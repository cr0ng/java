package day15;

public class Test06 {

	public Test06() {
		int no = (int)abc(2);
		/*
		 * �ڡڡڡڡ�
		 *  Object Ÿ���� ������ ����� �� �ݵ�� ��������ȯ�� ������Ѵ�.
		 */
		System.out.println(no + 200);
//		System.out.println(abc(2)+200); // ��ȯ���� Object�̱� ������ �ȵȴ�.
		
		int num = (int)(Math.random()*5);
		
		// abc() �Լ��� ȣ���ؼ� ��ȯ���� ���� Ÿ������ ��ȯ���ּ���.
		
		Object o = abc(num);
		if(o instanceof Boolean) {
			System.out.println("boolean : " + (boolean)o);
		}else if(o instanceof Character) {
			System.out.println("char : " + (char) o);
		}else if(o instanceof Integer) {
			System.out.println("int : " + (int) o);
		}else if(o instanceof Double) {
			System.out.println("double : " + (double) o);
		}else if(o instanceof String) {
			System.out.println("string : " + (String) o);
		}
	
	}
	
	public Object abc(int a) {
		switch(a) {
		case 0 :
			return true;
		case 1 :
			return 'A';
		case 2 :
			return 100;
		case 3 :
			return 3.14;
		case 4 :
			return "abcd";
		case 5 :
			return new int[] {1,2,3};
			
		}
		return "abcd";		
	}
	public static void main(String[] args) {
		new Test06();
	}

}
