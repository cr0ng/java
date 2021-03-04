package day12.ex;
/*
 	�뷡 �Ѱ��� �����͸� ����� Ŭ���� Song�� �����ϰ�
 	10���� �����͸� �Է��ؼ�
 	����� �Է��ϸ� �ش� ���� ������ ������ִ� ���α׷��� �ۼ��ϼ���.
 	
 	�� ������ 
 		���(title), �۰(composer), ����(singer), �帣(genre)
 	�� ����ϵ��� �ϼ���.
 	
 	extra]
 		�����̸��� �Է��ϸ� �ش� ����� ��µǰ� �ϼ���.
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
			System.out.print("\n��� 1, �۰ 2, ���� 3, �帣 4, ���� 0 �Է� : " );
		 	int no = in.nextInt();
		 	
		 	in.nextLine();
		 	
		 	if(no == 0) {
		 		System.out.println("���α׷� ����");
		 		break;	 	
		 	}
		 	
		 	if(!(no == 1 || no == 2 || no == 3 || no == 4)) {
		 		System.out.println("���� �߸� �Է�");
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
		System.out.print("�˻��� ����� �Է� : ");
		String tt = in.nextLine();
		
		for(int i = 0 ; i < s.length ; i++) {
			if(s[i].getTitle().equals(tt)) {
				toPrint(s,i);
				continue;
			}
		}
	}
	
	public void composerToInfo(Song[] s) {
		System.out.print("�˻��� �۰ �Է� : ");
		String cps = in.nextLine();
		
		for(int i = 0 ; i < s.length ; i++) {
			if(s[i].getComposer().equals(cps)) {
				toPrint(s,i);
				continue;
			}
		}
	}
	
	public void singerToInfo(Song[] s) {
		System.out.print("�˻��� ���� �Է� : ");
		String sg = in.nextLine();
		
		for(int i = 0 ; i < s.length ; i++) {
			if(s[i].getSinger().equals(sg)) {
				toPrint(s,i);
				continue;
			}
		}
	}
	
	public void genreToInfo(Song[] s) {
		System.out.print("�˻��� �帣 �Է� : ");
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
		String[] composer = {"��","��","��","��","��","��","��","��","��","��"};
		String[] singer = {"a","b","j","d","b","d","g","b","i","j"};
		String[] genre = {"��","��","��","��","��","��","��","��","��","��"};
		
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
