package member.dao;

/**
 * 이 클래스는 회원에 관련된 데이터베이스 작업을 전담해서 처리하는 클래스
 * @author class02
 *
 */

import java.sql.*;
import java.util.*;

import db.*;
import member.sql.*;
import member.vo.*;

public class MemberDao {
	// 이클래스는 데이터베이스 작업 전용 클래스이기 때문에
	// 이 클래스가 객체가 되는 순간 데이터베이스 작업을 할 준비가 되어야 겠다.
	private MyJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	// 질의명령 클래스
	private MemberSQL mSQL;
	
	public MemberDao() {
		db = new MyJDBC();
		// 이렇게 MyJDBC의 생성자를 호출하는 순간 
		// 오라클 드라이버는 로딩이 끝난상태가 된다.
		
		// 이제 질의명령을 사용할 수 있도록 질의명령 클래스를 메모리에 올리자.
		mSQL = new MemberSQL();
	}

	/**
	 *  회원들의 아이디 리스트 조회 전담 처리함수
	 */
	public ArrayList<String> getIdList(){
		// 반환값 변수
		ArrayList<String> list = new ArrayList<String>();
		/*
			이 함수는 오라클에 접속해서 
			회원의 아이디만 조회해서 
			그 결과를 반환해주는 함수
			따라서 데이터베이스작업을 해야 하는데
			1. 먼저 접속을 하고
			2. 질의명령을 가져와서
			3. Statement에 실어서 
			4. jdbc에게 전달하면
			5. 결과를 반환해줄텐데 그 결과를 받아서 반환해주면 된다.
		 */
		// 1. 접속
		con = db.getCon(); // 오라클에 접속을 하나 얻어온 상태
		// 2. 질의명령
		String sql = mSQL.getSQL(mSQL.SEL_ID_LIST);
		/*
			질의명령은 MembeSQL 클래스에 모두 만들어 뒀고
			필요한 질의명령은 요청을 하면 반환을 해줄 것이다.
			이때 필요한 질의명령 코드 역시 MemberSQL 안에 만들어 뒀으니
			꺼내서 사용하기만 하면 된다.
		 */
		
		// 질의명령에 ? (채워야 할 데이터)가 없으므로 Statement로 처리한다.
		stmt = db.getSTMT(con);
		
		try {
			// 지금 필요한 질의명령은 이미 완성된 상태의 질의명령이기 때문에
			// 질의명령을 데이터를 채워서 완성하는 작업이 필요하지 않다.
			// 질의명령을 보내고 결과받고...
			// 준비된 변수에 결과 받는다.
			rs = stmt.executeQuery(sql);
			/*
				Statement는 내부에 질의명령을 기억하지않고 있기 때문에
				질의명령을 실어서 jdbc에게 보내야 하고
				PreparedStatement 의 경우는 만들때 질의명령의 구조를 가져와서 
				만들어지므로 이미 내부에 질의명령이 들어있다.
				따라서 실어서 보내지 않아도 된다.
			 */
			
			/*
				ResultSet은 인라인테이블을 가져올 때 레코드포인터가  BOF에 있고
				따라서 데이터를 꺼낼수 없는 상태이다.
				그래서 우리는 레코드포인터를 한행 내려서 그 행의 필드의 데이터를 꺼냈었다.
				
				이때
				 rs.next() 함수를 호출해서 레코드 포인터를 한행 밑으로 내렸었는데
				 next()함수는 반환값이 boolean 타입이다.
				 의미는 한행 밑으로 내리는데 성공하면 true 를 반환해주고
				 							 실패하면 false를 반환한다.
				 							 
				 따라서 질의명령의 결과가 다중행으로(여러행으로) 발생하는 경우는
				 반복문으로 처리해야 할텐데 이때 반복문의 조건식에 next() 함수를 사용하면 될 것이다.
			 */
			while(rs.next()) {
				// EOF 로 이동하는 순간 이 반복문은 종료가 된다.
				// 이 반복문은 질의명령의 결과 만들어진 회원들의 아이디를 
				// 리스트에 담는 작업을 하는 반복문이다.
				
				// 아이디 꺼내고
				String sid = rs.getString("id");
				// 아이디를 리스트에 담고
				list.add(sid);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		// 데이터 반환하고
		return list;
	}
	
	// 아이디를 입력받아서 회원정보 조회 전담 처리 함수
	public MemberVO getMemberInfo(String id) {
		// 반환값 변수
		MemberVO mVO = new MemberVO();
		
		// 1. 커넥션 얻어오고
		con = db.getCon();
		
		// 2. 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_ID_INFO);
		
		// 3. PreparedStatement 꺼내오고
		pstmt = db.getPSTMT(con, sql);
		
		// 지금 이 상태는 질의명령이 완성되지 않은 상태이므로
		// 질의명령을 완성해준다.
		try {
			// 데이터채워서 질의명령 완성
			pstmt.setString(1, id);
			// 이제 질의명령은 완성이 됬고 보내서 결과를 받자.
			rs = pstmt.executeQuery();
			// 레코드포인터를 BOF에서 한행 내리고
			rs.next();
			// 데이터 꺼내서 VO 에 담고
			mVO.setMno(rs.getInt("mno"));
			mVO.setName(rs.getString("name"));
			mVO.setId(rs.getString("id"));
			mVO.setMail(rs.getString("mail"));
			mVO.setTel(rs.getString("tel"));
			mVO.setGen(rs.getString("gen").equals("M") ? "남자" : "여자");
			mVO.setAno(rs.getInt("ano"));
			mVO.setJdate(rs.getDate("jdate"));
			mVO.setJtime(rs.getTime("jdate"));
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		// 데이터 반환
		return mVO;
	}
	
	// 회원의 이름,아이디,가입일 출력
	public ArrayList<MemberVO> showMemberList(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		con = db.getCon(); 
		String sql = mSQL.getSQL(mSQL.SEL_ALL_LIST);
		
		stmt = db.getSTMT(con);
		
		try {

			rs = stmt.executeQuery(sql);
		
			while(rs.next()) {
				MemberVO mVO = new MemberVO();
				mVO.setName(rs.getString("name"));
				mVO.setId(rs.getString("id"));
				mVO.setJdate(rs.getDate("joindate"));
				//mVO.setJtime(rs.getDate("jtime"));
				list.add(mVO);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		// 데이터 반환하고
		return list;
	}
	
	
	// 회원가입
	public void addMember() {
		
		try {
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.ADD_MEMB);
		
		pstmt =db.getPSTMT(con, sql);
		//MemberVO mVO = new MemberVO();
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println();

		  System.out.print("이름 입력 : ");
		  String name = sc.nextLine();
		  System.out.print("아이디 입력 : ");
		  String id = sc.nextLine();
		  System.out.print("비번 입력 : ");
		  String pw = sc.nextLine();
		  System.out.print("메일 입력 : ");
		  String mail = sc.nextLine();
		  System.out.print("전화번호 입력 : ");
		  String tel = sc.nextLine();
		  System.out.print("성별 입력 : ");
		  String gen = sc.nextLine();
		  System.out.print("아바타 번호 입력 : ");
		  int avt = sc.nextInt();

		  pstmt.setString(1, name);
		  pstmt.setString(2, id);
		  pstmt.setString(3, pw);
		  pstmt.setString(4, mail);
		  pstmt.setString(5, tel);
		  pstmt.setString(6, gen);
		  pstmt.setInt(7, avt);

		  int cnt = pstmt.executeUpdate();

		  if(cnt == 1) {
				System.out.println("\n*** "+ name + "님의 회원가입 완료 ***\n");
			}else {
				System.out.println("\n*** 회원가입 오류 ***\n");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
	         try{
	             pstmt.close();
	             con.close();
	         }catch(Exception e) {}
		}
	}

	//   회원의 메일을 수정해주는 기능
	public void editMail(String id, String mail) {
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.EDIT_MAIL);
		pstmt = db.getPSTMT(con, sql);

		try {
			pstmt.setString(1, mail);
			pstmt.setString(2, id);

			pstmt.executeQuery();
			System.out.println("/n메일을 수정하였습니다./n");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
	}
	
	// 회원의 아바타 번호 수정해주는 기능
	public void editAno(String id, int ano) {
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.EDIT_AVT);
		pstmt = db.getPSTMT(con, sql);

		try {
			pstmt.setInt(1, ano);
			pstmt.setString(2,  id);

			pstmt.executeQuery();

			System.out.println("\n 아바타 번호 수정 완료 \n");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			db.close(pstmt);
			db.close(con);
		}
	}
}