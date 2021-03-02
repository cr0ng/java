package day11.ex;
/*
 	삼각형의 정보를 기억할 클래스(Semo)를 정의하고
 	그 클래스의 타입의 데이터를 기억할
 	배열을 만들어서
 	밑변 : xx - 높이 : xx - 면적 : xxx
 	의 형식으로 출력하세요 .
 	밑변과 높이는 인스턴스가 만들어질때 5 ~ 15 사이의 정수로 랜덤하게 
 	입력이 되도록 처리하세요.
 	면적은 함수로 처리하세요.
 */
public class Ex01 {
	public Ex01() {
		Semo[] s = new Semo[5];
		
		for(int i = 0 ; i < s.length ; i++) {
			s[i] = new Semo();
		}
		
		for(int i = 0 ; i < s.length ; i++) {
			int under = s[i].under;
			int height = s[i].height;
			double area = s[i].area();
			System.out.printf("밑변 : %2d - 높이 : %2d - 면적 : %5.2f \n",under,height,area);			
		}	
	}
	
	
	public static void main(String[] args) {
		new Ex01();
	}

}
