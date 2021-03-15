package day19;

import java.util.*;

import static java.lang.Math.*;
public class Test08 {
/*
	삼각형 10개를 랜덤하게 만들어서
	벡터에 기억시켜보자.
	그리고 내용을 출력하자.
 */
	public Test08() {
		Vector vec = new Vector(10, 1);
		// 이 벡터는 데이터를 기억할 공간은 10개 이고 증가하는 공간은 1개씩 증가시킨다.
		
		// Semo 10개를 채운다.
		for(int i = 0 ; i < 10 ; i++ ) {
			// 세모 객체 만들고
			Semo semo = new Semo(getInt(), getInt());
			// 벡터에 세모객체 넣어주고
			vec.add(semo);
		}
		
		// 꺼내서 출력해보자.
		for(Object o : vec) {
			// 각 방에는 세모객체를 기억시켰고 사용할려면 꺼내서 세모타입으로 강제 형변환 시켜야 한다.
			
			/*
				각 방에 채워진 데이터는
					Object o = new Semo(getInt(), getInt());
			 */
			
//			System.out.println(o); // ==> 맨 마지막 오버라이드한  toString() 함수가 호출
			
			// toPrint() 함수 호출
			((Figure) o).toPrint();
		}
		
		System.out.println("Capacity : " + vec.capacity());
		
		vec.add(new Semo(getInt(), getInt()));

		System.out.println("추가후 용량 : " + vec.capacity());
	}
	
	// 랜덤한 정수 반환해주는 함수
	public int getInt() {
		return (int)(random()*10 + 1);
	}

	public static void main(String[] args) {
		new Test08();
	}

}