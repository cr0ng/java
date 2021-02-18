package day04.ex;

/*
 	0 ~ 25 까지의 수를 랜덤하게 하나를 발생시켜서
 	
 		0	-	0입니다
 		2의 배수	-	2의 배수입니다.
 		3의 배수 	-	3의 배수입니다.
 		2와 3의 배수인경우	-	2와 3의 배수입니다.
 		그 이외의 경우	-	나머지 수입니다.
 	로 출력해주는 프로그램을 작성하세요.
 	
 */
public class Ex02 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*26);
		System.out.println("랜덤 발생 수 : " + num);
		
		//if ~ else if문
		/*
		if(num == 0) {
			System.out.println("0입니다");
		}else if(num % 2 == 0) {
			if(num % 3 != 0) {
				System.out.println("2의 배수입니다.");
			}else {
				System.out.println("2와 3의 배수입니다.");
			}
		}else if(num % 3 == 0 ) {
			System.out.println("3의 배수입니다.");
		}else
			System.out.println("나머지 수 입니다.");
		*/
		
		//switch문
		if(num ==0 ) {
			System.out.println("0입니다.");
		}
		switch(num%6) {
		case 0:
			System.out.println("2와 3의 배수입니다.");
			break;
		case 1: 
			System.out.println("나머지 수 입니다.");
			break;
		case 2: 
			System.out.println("2의 배수입니다.");
			break;
		case 3: 
			System.out.println("3의 배수입니다.");
			break;
		case 4: 
			System.out.println("2의 배수입니다.");
			break;
		case 5: 
			System.out.println("나머지 수 입니다.");
			break;
		default :
			
		}
	}

}
