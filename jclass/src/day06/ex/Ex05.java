package day06.ex;
/*
 	문제 5]
 		어느 농장에 닭과 양을 사육한다
 		총 마리수는 52마리인데
 		다리수를 세어보니 144개이다.
 		
 		과연 이 농장의 닭과 양은 몇마리씩 있는지 계산해서 출력해주는 프로그램을 작성하세요.
 		
 	원리 ]
 		닭이 0 마리라고 가정하고 다리수 계산하고
 		닭이 1 마리라고 가정하고 다리수 계산하고
 		...
 		닭이 52마리라고 가정하고 다리수 계산하고
 */
public class Ex05 {

	public static void main(String[] args) {
		
		/*
		for(int i = 0 ; i <= 52 ; i++) {
			int leg = i*2 + 4*(52-i);
			if(leg == 144) {
				System.out.println("닭은 "+i+"마리 양은 "+ (52-i)+"마리이다.");
			}
		}
		*/
		int c = 0;
		
		while(c<=52) {
			int legs = c*2 + 4*(52-c);
			if(legs == 144) {
				System.out.println("닭은 "+c+"마리 양은 "+ (52-c)+"마리이다.");
			}
			c++;
		}
	}

}
