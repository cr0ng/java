package day03;
/*
 문제 9 ]
	게시물을 게시판에 출력하는데
	하나의 게시판 페이지에는 게시물을 15개를 출력할 수 있다.
	게시물의 갯수를 랜덤하게 발생시킨후 
	몇 개의 페이지가 필요한지 계산해서 출력해주는
	프로그램을 작성하세요.
 */
public class Ex09 {

	public static void main(String[] args) {
		int no = (int)(Math.random()*101);
		int page = 0;
		
		System.out.println("게시글 갯수 : " + no);
		
		if(no == 0) {
			page = 1;
		}else {
			if(no % 15 != 0) {
				page = (no /15) +1;
				System.out.println("게시판 페이지 수 : " + page);
			}else {
				page = no/15;
				System.out.println("게시판 페이지 수 : " + page);
			}
		}
	}

}
