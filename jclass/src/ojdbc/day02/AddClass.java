package ojdbc.day02;

import java.sql.*;
import java.util.*;
import db.*;
import sql.*;

public class AddClass {
	MyJDBC db;
	Connection con;
	PreparedStatement pstmt;
	
	MemberSQL mSQL;
	
	public AddClass() {
		// �����ͺ��̽� ����غ�
				db = new MyJDBC();
				// �� ����� ���������� ������ �Ǹ� ����̹� �ε��� �̹� ���� �����̴�.
				// + url, id, pw �� �����ѳ��� �����̴�.
				// ���� �ʿ��� Connection, Statement, PreparedStatement �� ������
				// �׶����� �Լ��� ȣ���ؼ� �������� �ǰڴ�.
				
				// Ŀ�ؼ� ��������
				con = db.getCon();
				
				mSQL = new MemberSQL(); // ����� ���Ǹ���� ���� �غ� ���.
				String sql = mSQL.getSQL(mSQL.ADD_MEMB);
				
				// PreparedStatement ��������
				pstmt = db.getPSTMT(con, sql);
				
				// ȸ�� ������ ��������
				ArrayList<MemberVO> list = getList();
				
				int cnt = 0;
				try {
					// ���Ǹ���� ? ��� �����͸� ä���� �ϼ��ϰ�
					// �ټ����� �����͸� �Է��� �����̹Ƿ� �ݺ��ؼ� ó���Ѵ�.
					for(int i = 0 ; i < list.size(); i++ ) {
						// ����Ʈ���� ������ ������
						MemberVO mVO = list.get(i);
						pstmt.setString(1, mVO.getName());
						pstmt.setString(2, mVO.getId());
						pstmt.setString(3, mVO.getPw());
						pstmt.setString(4, mVO.getMail());
						pstmt.setString(5, mVO.getTel());
						pstmt.setString(6, mVO.getGen());
						pstmt.setInt(7, mVO.getAno());
						// ���� ���Ǹ���� �ϼ��� �����Ƿ� JDBC���� �����ϸ� �ȴ�.
						
						cnt += pstmt.executeUpdate();
					}
				} catch(Exception e) {
					e.printStackTrace();
				} finally {
					db.close(pstmt);
					db.close(con);
				}
				
				if(cnt == list.size()) {
					System.out.println("***** " + list.size() + " ���� ȸ�� ��� �Ϸ� *****");
				} else {
					System.out.println("#### ȸ�� ��Ͽ� ������ �ֽ��ϴ�. #####");
				}
	}

	// �ټ����� ������ ��ȯ���ִ� �Լ�
	public ArrayList<MemberVO> getList(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		MemberVO m1 = new MemberVO();
		m1.setName("������");
		m1.setId("yujin");
		m1.setPw("12345");
		m1.setMail("yujin@increpas.com");
		m1.setTel("010-2222-2222");
		m1.setGen("F");
		m1.setAno(14);
		
		list.add(m1);
		
		MemberVO m2 = new MemberVO();
		m2.setName("��ä��");
		m2.setId("chae");
		m2.setPw("12345");
		m2.setMail("chae@increpas.com");
		m2.setTel("010-3333-2222");
		m2.setGen("F");
		m2.setAno(15);
		
		list.add(m2);
		
		MemberVO m3 = new MemberVO();
		m3.setName("�����");
		m3.setId("su");
		m3.setPw("12345");
		m3.setMail("su@increpas.com");
		m3.setTel("010-4444-2222");
		m3.setGen("F");
		m3.setAno(16);
		
		list.add(m3);
		
		MemberVO m4 = new MemberVO();
		m4.setName("������");
		m4.setId("choi");
		m4.setPw("12345");
		m4.setMail("choi@increpas.com");
		m4.setTel("010-5555-2222");
		m4.setGen("M");
		m4.setAno(12);
		
		list.add(m4);
		
		MemberVO m5 = new MemberVO();
		m5.setName("����");
		m5.setId("sub");
		m5.setPw("12345");
		m5.setMail("sub@increpas.com");
		m5.setTel("010-6666-2222");
		m5.setGen("M");
		m5.setAno(11);
		
		list.add(m5);

		
		return list;
	}
	
	public static void main(String[] args) {
		new AddClass();
	}

}
