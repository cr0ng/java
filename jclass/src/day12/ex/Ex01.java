package day12.ex;
/*
 	노래 한곡의 데이터를 기억할 클래스 Song을 정의하고
 	10곡의 데이터를 입력해서
 	곡명을 입력하면 해당 곡의 정보를 출력해주는 프로그램을 작성하세요.
 	
 	곡 정보는 
 		곡명(title), 작곡가(composer), 가수(singer), 장르(genre)
 	를 기억하도록 하세요.
 	
 	extra]
 		가수이름을 입력하면 해당 곡들이 출력되게 하세요.
 */

import java.util.*;

public class Ex01 {
	
	Scanner in = new Scanner(System.in);
	
	public Ex01() {
		Song[] song = getDataArr();
		toPrint(song);
		exec(song);
		in.close();
	}
	
	public void exec(Song[] s) {
		
		while(true) {
			System.out.print("\n곡명 1, 작곡가 2, 가수 3, 장르 4, 종료 0 입력 : " );
		 	int no = in.nextInt();
		 	
		 	in.nextLine();
		 	
		 	if(no == 0) {
		 		System.out.println("프로그램 종료");
		 		break;	 	
		 	}
		 	
		 	if(!(no == 1 || no == 2 || no == 3 || no == 4)) {
		 		System.out.println("숫자 잘못 입력");
		 		continue;
		 	}
		 	
		 	switch(no) {
		 	case 1:
		 		titleToInfo(s);
		 		break;
		 	case 2:
		 		composerToInfo(s);
		 		break;
		 	case 3:
		 		singerToInfo(s);
		 		break;
		 	case 4:
		 		genreToInfo(s);
		 		break;
		 	}
		 	
		}
	}
	
	public void titleToInfo(Song[] s) {
		System.out.print("검색할 곡명을 입력 : ");
		String tt = in.nextLine();
		
		for(int i = 0 ; i < s.length ; i++) {
			if(s[i].getTitle().equals(tt)) {
				toPrint(s,i);
				continue;
			}
		}
	}
	
	public void composerToInfo(Song[] s) {
		System.out.print("검색할 작곡가 입력 : ");
		String cps = in.nextLine();
		
		for(int i = 0 ; i < s.length ; i++) {
			if(s[i].getComposer().equals(cps)) {
				toPrint(s,i);
				continue;
			}
		}
	}
	
	public void singerToInfo(Song[] s) {
		System.out.print("검색할 가수 입력 : ");
		String sg = in.nextLine();
		
		for(int i = 0 ; i < s.length ; i++) {
			if(s[i].getSinger().equals(sg)) {
				toPrint(s,i);
				continue;
			}
		}
	}
	
	public void genreToInfo(Song[] s) {
		System.out.print("검색할 장르 입력 : ");
		String gr = in.nextLine();
		
		for(int i = 0 ; i < s.length ; i++) {
			if(s[i].getGenre().equals(gr)) {
				toPrint(s,i);
				continue;
			}
		}
	}
	
	public Song[] getDataArr() {
		
		Song[] s = new Song[10];
		
		for(int i = 0 ; i < s.length; i++) {
			s[i] = new Song();
		}
		
		String[] title = {"1","2","3","4","5","6","7","8","9","10"};
		String[] composer = {"가","나","다","라","라","다","나","아","가","차"};
		String[] singer = {"a","b","j","d","b","d","g","b","i","j"};
		String[] genre = {"ㄱ","ㄴ","ㄷ","ㄹ","ㄱ","ㄴ","ㄷ","ㄹ","ㅈ","ㅊ"};
		
		for(int i = 0 ; i < s.length ; i++){
			String tit = title[i];
			String com = composer[i];
			String sin = singer[i];
			String gen = genre[i];
			
			s[i].setTitle(tit);
			s[i].setComposer(com);
			s[i].setSinger(sin);
			s[i].setGenre(gen);
		}
		
		return s;
	}
	
	public void toPrint(Song[] s) {
		for(int i = 0 ; i < s.length ; i++) {
			System.out.println(s[i].toString());
		}
	}
	
	public void toPrint(Song[] s, int idx) {
			System.out.println(s[idx].toString());
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
