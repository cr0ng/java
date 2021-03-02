package day11.ex;
/*
 	사각형을 7개를 기억할 배열을 만들고
 	정보를 출력하는 프로그램을 만드세요.
 	
 	Ex03과 동일하게 멤버를 처리하세요.
 */
public class Ex04 {
	public Ex04() {
		Nemo[] nemo = new Nemo[7];
		
		for(int i = 0 ; i < nemo.length ; i++) {
			nemo[i] = new Nemo();
		}
		
		for(int i = 0 ; i < nemo.length ; i++) {
			nemo[i].garo();
			nemo[i].sero();
			nemo[i].area();
		}
		
		for(Nemo n : nemo) {
			n.toPrint();
		}
	}
	public static void main(String[] args) {
		new Ex04();
	}

}
