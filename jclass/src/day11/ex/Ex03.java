package day11.ex;
/*
 	삼각형을 5개 기억할 배열을 만들고
 	각 삼각형의 정보를 출력하세요.
 	단, 삼각형의 가로 세로 세팅은 함수로 각각 처리하세요.
 	(==> 생성자에서 처리하지 않도록 하세요.)
 	출력 함수도 삼각형 클래스에서 출력함수를 정의해 놓고
 	함수를 호출해서 처리하도록 하세요.
 */
public class Ex03 {

	public Ex03() {
		Samgak[] sam = new Samgak[5];
		
		// 인스턴스 셋팅
		for(int i = 0 ; i < sam.length ; i++) {
			sam[i] = new Samgak();
		}
		
		// 변수셋팅
		for(int i = 0 ; i < sam.length ; i++) {
			sam[i].width();
			sam[i].height();
			sam[i].area();
		}
		
		// 출력
		for(Samgak s : sam) {
			s.toPrint();
		}
	}
	public static void main(String[] args) {
		new Ex03();
		
	}

}
