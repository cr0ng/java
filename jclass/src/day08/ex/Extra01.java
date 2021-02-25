package day08.ex;
/*
5명의 친구의 정보를 기억할 배열을 만들고
친구의 이름을 입력하면 
해당 친구의 정보를 출력해주는 프로그램을 작성하세요.
정보는 이름, 아이디, 이메일, 전화번호, 성별
을 저장하세요.
 */
import java.util.*;

public class Extra01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("친구의 이름을 입력하세요 : ");
		String name = in.nextLine();
		
		/*
		String[][] info = new String[][]
						  {{"김유진", "yujin","yj@increapas.com","010-1111-1111","여자"},
						   {"곽채원", "chaewon","cw@increapas.com","010-2222-2222","여자"},
						   {"전은석", "euns","es@increapas.com","010-3333-3333","남자"},
						   {"윤건우", "gunnwoo","gw@increapas.com","010-4444-4444","남자"},
						   {"최태현", "taehyun","th@increapas.com","010-5555-5555","남자"}
						  };
		
		for(int i = 0 ; i < info.length - 1; i++) {
			
			if(info[i][0].equals(name)) {
				for(int j = 0 ; j < info[i].length; j++) {
					System.out.print(info[i][j] + " ");
				}
			}else 
				continue;
		}
		*/
		
		//선생님 코드
		//한 사람당 다섯개의 정보를 기억하는 배열을 다섯명을 관리할 배열을 만든다.
		String[][] friend = {
				{"홍길동","hong","hong@increpas.com","010-1111-1111","M"},
				{"고길동","Gho","ghoincrepas.com","010-2222-2222","M"},
				{"둘리","dooly","dooly@increpas.com","010-3333-3333","M"},
				{"희동이","hee","hee@increpas.com","010-4444-4444","M"},
				{"마이콜","mikol","kol@increpas.com","010-5555-5555","M"}
				};
		
		
		
		for(int i = 0 ; i < friend.length ; i++) {
			// 한명씩 이름을 꺼내본다.
			String tmp = friend[i][0];
			
			if(tmp.equals(name)) {
				System.out.printf("%-8s : %3s\n","친구이름",friend[i][0]);
				System.out.printf("%-8s : %3s\n","아 이 디",friend[i][1]);
				System.out.printf("%-8s : %3s\n","이 메 일",friend[i][2]);
				System.out.printf("%-8s : %3s\n","전화번호",friend[i][3]);
				System.out.printf("%-8s : %3s\n","친구성별",friend[i][4]);
			}
		}
	System.out.println();
	
	}

}
