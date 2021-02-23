package day06.ex;
/*
 	문제 2]
 		달팽이가 전봇대(100m)에 올라간다.
 		낮에는 0.87m를 올라가고
 		밤에는 0.35m 미끄러져 내려온다.
 		
 		몇일만에 이 달팽이는 정사엥 올라갈 것인가?
 		단, 꼭대기에 올라가면 미끄럼은 없다.
 */
public class Ex02 {

	public static void main(String[] args) {
		
		double result = 0;
		int day = 0;
		
		for(int i = 1; ;i++) {
			day = i;
			
			result += (0.87 );
			System.out.print("오름 : " +result+"	");
			if(result > 100.0) {
				break;
			}else {
				result -= (0.35);
			}
			System.out.print("내림 : " +result);
			System.out.println();
		}
		System.out.println("\n달팽이가 꼭대기에 오르는데 "+day+"일 걸림");
	}

}
