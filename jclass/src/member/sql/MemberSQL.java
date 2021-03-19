package member.sql;
/**
 *  이 클래스는 회원정보에 관련된 질의명령을 관리하는 클래스
 * @author 김유진
 * @since 2021.03.19
 * @version v.1.0
 */
public class MemberSQL {
	// 사용자가 필요한 질의명령을 요청할 때 사용할 코드 변수
	
	public final int SEL_ID_LIST 	=	1001;
	public final int SEL_ID_INFO 	=	1002;
	public final int SEL_ALL_INFO 	=	1003;
	public final int SEL_ALL_LIST 	= 	1004;
	
	// 수정질의명령
	public final int EDIT_MAIL		=	2001;
	public final int EDIT_AVT		=	2002;
	
	// 회원 추가 질의명령 요청 코드
	public final int ADD_MEMB		=	3001;
	
	// 회원 탈퇴 질의명령 요청 코드
	public final int DEL_MEMB_MNO	=	4001;
	public final int DEL_MEMB_ID	=	4002;
	
	// 위의 코드를 입력하면서 호출하면 코드에 맞는 질의명령을 반환해주는 함수
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case SEL_ID_LIST:
			buff.append("SELECT ");
			buff.append("	id ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y'");
			break;
			
		case SEL_ID_INFO:
			buff.append("SELECT ");
			buff.append("	mno, id, name, mail, tel, gen, avt ano, joindate jdate ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y'");
			buff.append("	AND id = ? ");
			break;
			
		case SEL_ALL_LIST:
			buff.append("SELECT ");
			buff.append("	name, id, joindate ");
			buff.append("FROM ");
			buff.append("	member ");
			break;
			
		case ADD_MEMB:
			buff.append("INSERT INTO ");
			buff.append("	member(mno, name, id, pw, mail, tel, gen, avt) ");
			buff.append("VALUES( ");
			buff.append("	(SELECT NVL(MAX(mno) + 1,1001) FROM member), ");
			buff.append("	?, ?, ?, ?, ?, ?, ? ");
			buff.append(") ");
			break;
			
		case EDIT_MAIL:
			buff.append("UPDATE ");
			buff.append("	member ");
			buff.append("SET ");
			buff.append("	mail = ? ");
			buff.append("WHERE ");
			buff.append("	id = ? ");
			
		case EDIT_AVT:
			buff.append("UPDATE ");
			buff.append("	member ");
			buff.append("SET ");
			buff.append("	avt = ? ");
			buff.append("WHERE ");
			buff.append("	id = ? ");
		}
		return buff.toString();
	}
	
}
