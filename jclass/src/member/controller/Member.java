package member.controller;

/*
	가입된 회원의 아이디들을 조회해서 출력하고
	아이디를 입력해서 해당 아이디 회원의 정보를 출력해보자.
	
	이 클래스는 만든 부품을 이용해서 프로그램을 조립하는 클래스이다.
	
	-------------------------------------------------------------------------
	
	1. "l"을 입력하면 회원들의 회원이름, 아이디, 가입일 조회해서 보여주는 기능
	2. "id" 을 입력하면 회원들의 아이디 리스트를 보여주고 아이디를 입력받아서
		해당 회원의 정보를 보여주는 기능
	3. "add"를 입력하면 회원의 정보를 입력받아서 회원가입을 처리해주는 기능
	4. "mail"을 입력하면 아이디와 새로운 메일을 입력받아서 
	회원의 메일을 수정해주는 기능
	5. "ano"를 입력하면 아바타 번호, 아이디를 입력받아 아바타 번호 수정

 */

// ***** 여기까지 완성해주세요 *****
// 다음 내용은 여기까지 모두 완성된 다음에 진행하겠습니다.

import java.util.*;

import member.dao.*;
import member.vo.*;
public class Member {
	// 이 클래스에서는 데이터베이스 작업을 하는 기능의 함수를 조립해서 쓸 예정이다.
	// 따라서 데이터베이스 작업 전담 클래스를 가져와서 사용해야 한다.
	
	private MemberDao mDao;
	
	public Member() {
		mDao = new MemberDao();
		Scanner sc = new Scanner(System.in);
		
		//getInfo(sc);
		exec(sc);
	}
	
	// 전체명령 처리함수
	public void exec(Scanner sc) {
		// 프로그램을 언제 종료할지 모르므로 무한반복해서 처리한다.
		StringBuffer buff = new StringBuffer();
		buff.append("작업을 선택하세요!");
		buff.append("\n\t전체회원 출력 : l");
		buff.append("\n\tid로 정보조회 : id");
		buff.append("\n\t회원가입 처리 : add");
		buff.append("\n\t회원메일 수정 : mail");
		buff.append("\n\t회원아바타 수정 : ano");
		buff.append("\n\t프로그램 종료 : q");
		buff.append("");
		buff.append("\n코드 선택 : ");
		loop:
		for(;;) {
			
			// 메세지 출력하고
			
			System.out.println(buff);
			
			String code = sc.nextLine();
			switch(code) {
			case "q":
				System.out.println("### 프로그램 종료 ###");
				break loop;
			case "l":
				showMemberList();
				break;
			case "id":
				getInfo(sc);
				break;
			case "add":
				addMember(sc);
				break;
			case "mail":
				editMail(sc);
				break;
			case "ano":
				editAno(sc);
				break;
				
			}
		}
	}
	
	
	// 회원의 아바타번호를 입력받아서 수정해주는 함수
	public void editAno(Scanner sc) {
		System.out.println("아이디 입력 : ");
		String id = sc.nextLine();
		
		System.out.println("아바타 번호 입력 :");
		int ano = sc.nextInt();
		
		mDao.editAno(id, ano);
	}
	
	// 회원의 아이디와, 메일을 입력받아서 수정해주는 함수
	public void editMail(Scanner sc) {
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		System.out.print("새로운 메일 입력 : ");
		String mail = sc.nextLine();
		
		mDao.editMail(id, mail);
	}
	
	// 회원가입 처리함수
	public void addMember(Scanner sc) {
		mDao.addMember();
	}
	
	// 모든 회원 리스트(이름,아이디,가입일) 보여주는 함수
	public void showMemberList() {
		ArrayList<MemberVO> list = mDao.showMemberList();
		
		for(MemberVO v : list)
			System.out.println("이름 : " + v.getName() + ", 아이디 : " + v.getId() + ", 가입일 : " + v.getJdate());
		System.out.println();
	}
	
	// 아이디 리스트 가져와서 출력해주는 함수
	public void getIdList() {
		ArrayList<String> idList = mDao.getIdList();
		// MemberDao에 있는 getIdList() 함수는 아이디리스트를 내보내줄텐데
		// 이 클래스에서는 그 내보내주는 데이터를 기억해서 사용하면 된다.
		
		System.out.print("| ");
		for(int i = 0 ; i < idList.size(); i++ ) {
			System.out.print(idList.get(i) + " | ");
		}
		System.out.println();
		
	}
	
	// 아이디를 입력받아서 해당아이디의 정보를 출력해주는 함수
	public void getInfo(Scanner s) {
		while(true) {
			getIdList();
			System.out.println();
			// 먼저 메세지 출력하고
			System.out.print("조회할 아이디 : ");
			String sid = s.nextLine();
			if(sid.equals("q")) {
				break;
			}
			
			MemberVO mVO = mDao.getMemberInfo(sid);
			System.out.println(mVO);
		}
	}
	
	public static void main(String[] args) {
		new Member();
	}

}