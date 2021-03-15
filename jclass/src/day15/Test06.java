package day15;

public class Test06 {

	public Test06() {
		int no = (int)abc(2);
		/*
		 * ★★★★★
		 *  Object 타입은 꺼내서 사용할 때 반드시 강제형변환을 해줘야한다.
		 */
		System.out.println(no + 200);
//		System.out.println(abc(2)+200); // 반환값이 Object이기 때문에 안된다.
		
		int num = (int)(Math.random()*5);
		
		// abc() 함수를 호출해서 반환값의 원래 타입으로 변환해주세요.
		
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
