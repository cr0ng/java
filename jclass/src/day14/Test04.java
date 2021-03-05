package day14;
/*
 	Grand 클래스를 만들고
 	Grand 클래스를 상속받은 Father 클래스를 만들고
 	Father 클래스를 상속받은 Son 클래스를 만든다.
 */
public class Test04 {

	public Test04() {
//		Grand g = new Grand();
//		Father f = new Father();
//		Son s = new Son();
		
//		Grand g = new Father();
//		Father 클래스의 인스턴스는 Grand의 멤버를 가지고 있으므로 가능하다.
		
//		Father f = (Father) new Grand();
		// Grand 인스턴스에는 Father의 멤버가 없기 때문에 에러...
		
//		Grand s = new Son(); // 잘된다..
		
		Son s 		=		 new Son();
		//레퍼런스	  +		인스턴스 	==> 오브젝트(객체, Object)
		
		/*
		Father f = s;
		Grand g = s;
		g.abc();
		*/
		
		Father f = new Father();
		Grand g = f;
		g.abc();
		System.out.println("g.no : "+ g.no);
	}

	public static void main(String[] args) {
		new Test04();
	}

}

/*
class Grand{
	
}
*/