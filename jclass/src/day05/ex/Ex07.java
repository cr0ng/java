package day05.ex;
/*
 	문제 7 ]
 		두 사람이 등산을 하는데
 		한 사람은 아래에서 정상으로 올라가기 시작했고
 		나머지 사람은 산 정상에서 아래로 하산하기 시작했다.
 		
 		산의 높이가 7564m라 하고
 		오르는 사람의 속도는 0.54 m/s
 		하산하는 사람의 속도는 1.07 m/s
 		라고 한다면 
 		두 사람이 만나는 시점은 몇초 후에 만나게 되는지
 		출력해주는 프로그램을 작성하세요.
		
		반복문으로 처리하세요.
 */
public class Ex07 {

	public static void main(String[] args) {
		int i = 1;
		
		while( (0.54 + 1.07) * i < 7564) {
			//System.out.println(i);
			i++;
		}
		//System.out.println("정확하게 걸리는 시간(초) : " + 7564/(0.54+1.07));
		System.out.println("두 사람은 "+i+"초 후에 만납니다.");
	}

}
