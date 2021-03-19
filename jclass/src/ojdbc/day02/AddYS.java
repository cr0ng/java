package ojdbc.day02;
/*
 * hello ������ member ���̺� �ڿ�� ȸ���� �߰��ϼ���.
 * 		�̸� : �ڿ��
 * 		���̵� : ys
 * 		��й�ȣ : 12345
 *  	���� : ys@increpas.com
 *  	tel : 010-0000-0000
 *  	gen : 'M'
 *  	avt : 12
 */

import java.sql.*;

public class AddYS {
	Connection con;
	PreparedStatement pstmt;
	
	public AddYS() {
		MemberVO ys = new MemberVO();
		ys.setName("�����");
		ys.setId("kieun");
		ys.setPw("12345");
		ys.setMail("kieun@increpas.com");
		ys.setTel("010-1111-1111");
		ys.setGen("M");
		ys.setAno(13);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hello";
			String pw = "increpas";
			
			con = DriverManager.getConnection(url,id,pw);
			
			StringBuffer buff = new StringBuffer();
			buff.append("INSERT INTO");
			buff.append("	member(mno,name,id,pw,mail,tel,gen,avt)");
			buff.append("VALUES(");
			buff.append("	(SELECT NVL(MAX(mno) + 1,1001) FROM member),");
			buff.append("	?, ?, ?, ?, ?, ?, ? ");
			buff.append(")");
			
			String sql = buff.toString();
			
			pstmt = con.prepareStatement(sql);
			/*
			 *  pstmt�� �����Ϸ��� ���Ǹ���� ������ ������ �ֵ�.
			 *  ���� ���Ǹ���� ������ ����
			 *  �����͵��� ä������ ���Ǹ���� �ϼ��� �� ���̴�.
			 *  �ᱹ ���Ǹ���� ������ ������ �����͸� ä����
			 *  ���Ǹ���� �ϼ�������� �Ѵ�.
			 */
			
			// ���Ǹ�� �ϼ��ϱ�(������ ä���)
			/*
			 *  �����͸� ä�� �� ��ġ���� ? �� ������ ���� �ȴ�.
			 */
			pstmt.setString(1, ys.getName());
			pstmt.setString(2, ys.getId());
			pstmt.setString(3, ys.getPw());
			pstmt.setString(4, ys.getMail());
			pstmt.setString(5, ys.getTel());
			pstmt.setString(6, ys.getGen());
			pstmt.setInt(7, ys.getAno());
			
			// ���� ���Ǹ���� �ϼ��� �����Ƿ� �����ϸ� �ȴ�.
			int cnt = pstmt.executeUpdate();
			// �� �� pstmt���� �̹� �ϼ��� ���Ǹ���� ��������Ƿ�
			// �Լ� ȣ��� ���Ǹ���� �Է����� �ʾƵ� �ȴ�.
			
			if(cnt == 1) {
				System.out.println("������ ���Լ���");
			}else {
				System.out.println("���������� ��⸦...");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				
			} catch (Exception e2) {}
		}
		
	}

	public static void main(String[] args) {
		new AddYS();
	}

}
