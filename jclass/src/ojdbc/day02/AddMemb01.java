package ojdbc.day02;
/*
 * member ���̺� ȸ�� �Ѹ��� �߰��غ���
 */
import java.sql.*;
public class AddMemb01 {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public AddMemb01() {
		try {
			// ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Ŀ�ؼ� ������
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hello";
			String pw = "increpas";
			
			con = DriverManager.getConnection(url,id,pw);
			// �� �۾��� �Ϸ�Ǹ� ������ �ϳ� ���� ���°� ��
			// ���Ǹ�� �غ��ϰ�
			StringBuffer buff = new StringBuffer();
			buff.append("INSERT INTO");
			buff.append("	member(mno,name,id,pw,mail,tel,gen,avt)");
			buff.append("VALUES(");
			buff.append("	(SELECT NVL(MAX(mno) + 1,1001) FROM member),");
			buff.append("	'������','euns','12345', ");
			buff.append(" 'euns@increpas.com','010-3175-9042','M',11 ");
			buff.append(")");
			
			String sql = buff.toString();
			// Statement�� ��������
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			// ���Ǹ�� ������
			//boolean bool = stmt.execute(sql);
			// execute() �Լ��� ��ȯ���� boolean Ÿ���ε� �ǹ̴�
			// ���Ǹ���� ���࿩�θ� �˷��ִ� ���� �ƴϰ�
			// JDBC���� DBMS���� ���Ǹ���� ���މ���� ���θ� �˷��ش�.
			
			int cnt = stmt.executeUpdate(sql);
			// executeUpdate()�� ������ ��ȯ���ִµ�
			// ��ȯ���� �ǹ̴� ����� �� ���� ��ȯ
			// update ����� ��� �������� ����� �� �� ��ȯ
			// insert ���Ǹ���� ��� �߰��� �� ��(1)�� ��ȯ
			
			// ����޾Ƽ� ó��
			if(cnt == 1) {
				System.out.println("������ ȸ���� ������ ���������� ó���Ǿ����ϴ�.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			}catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new AddMemb01();
	}

}
