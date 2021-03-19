package ojdbc.day01.ex;

/*
scott ������ �����ؼ� 
emp ���̺� ����� �����
�޿��� ���� ���� ����� 
	�����ȣ, ����̸�, ����, �޿�, �Ի���, �μ���ȣ
�� ��ȸ�ϼ���.
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Ex01 {

	public Ex01() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("����̹� �ε� ����");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
					
			String id = "SCOTT";
			String pw = "TIGER";
			
			Connection con = DriverManager.getConnection(url,id,pw);
			System.out.println("���� ���� ����");
			
			Statement stmt = con.createStatement();
			
			String sql = "SELECT * FROM emp WHERE sal = (SELECT MAX(sal) FROM emp) ";
		
			ResultSet rs = stmt.executeQuery(sql);
			
			rs.next();
			
			String name = rs.getString("ename");
			int eno = rs.getInt("empno");
			String job = rs.getString("job");
			int mgr = rs.getInt("mgr");
			int sal = rs.getInt("sal");
			int comm = rs.getInt("comm");
			int dno = rs.getInt("deptno");
		
			Date hdate = rs.getDate("hiredate");
			Time htime =rs.getTime("hiredate");
			
			SimpleDateFormat form1 = new SimpleDateFormat("yyyy�� MM�� dd�� ");
			SimpleDateFormat form2 = new SimpleDateFormat("HH : mm : ss ");
			
			String sdate = form1.format(hdate) + form2.format(htime);
			
			// ���
			System.out.println("�����ȣ : " + eno);
			System.out.println("����̸� : " + name);
			System.out.println("������� : " + job);
			System.out.println("����ȣ : " + mgr);
			System.out.println("����޿� : " + sal);
			System.out.println("Ŀ �� �� : " + comm);
			System.out.println("�μ���ȣ : " + dno);
			System.out.println("�� �� �� : " + sdate);
			
		} catch (Exception e) {
			
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
