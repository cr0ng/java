package day21;

import java.util.*;

public class Test01 {
/*
 * 	제너릭스 선언의 와일드 카드
 * 	==> 어떤 함수가 제너릭 선언된 컬렉션을 매개변수로 받을 때
 * 		자기자신 이외의 다른 클래스로 제너릭 선언된 것도 받을 수 있도록 한다.
 */
	public Test01() {
		ArrayList<Object> list0 = new ArrayList<Object>();
		ArrayList<Son> list1 = new ArrayList<Son>();
		ArrayList<Father> list2 = new ArrayList<Father>();
		ArrayList<Grand> list3 = new ArrayList<Grand>();
		
//		abc(list1);	// 리스트 제너릭스 선언이 다름
		abc(list2);
//		abc(list3);	// 리스트 제너릭스 선언이 다름
		
		// xyz() 호출
//		xyz(list1);	// ArrayList에 담겨진 데이터가 다르다.
		xyz(list2);
		xyz(list3);
		xyz(list0);
		
		//lmn() 호출
//		lmn(list0);	// <Object> 이기 때문에 안됨
		lmn(list1);	// list1은 ArrayList<Son>으로 제너릭스가 선언되어있기 때문에 가능
		lmn(list2);
//		lmn(list3); // 
		
		//qwe() 호출
		qwe(list0);
		qwe(list1);
		qwe(list2);
		qwe(list3);
	}

	public void abc(ArrayList<Father> l) {
		/*
		 * 이 함수가 ArrayList를 매개변수로 받아서 사용
		 * 이 함수는 반드시 Father로 제너릭 선언된 ArrayList만 매개변수로 받을 수 있음
		 */
	}
	
	public void xyz(ArrayList< ? super Father> l ) {
		/*
		 * 
		 */
	}
	
	public void lmn(ArrayList<? extends Father> l) {
		/*
		 *  Father 클래스와 그 하위 클래스로 제너릭 선언됨
		 *  ArrayList를 받을 수 있다.
		 */
	}
	
	public void qwe(ArrayList<?> l) {
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}

class Grand{

}

class Father extends Grand{
	
}

class Son extends Father{
	
}