package ojdbc.day01.ex;

/*
scott 계정에 접속해서 
emp 테이블에 저장된 사원중
급여가 제일 높은 사원의 
	사원번호, 사원이름, 직급, 급여, 입사일, 부서번호
를 조회하세요.
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
			
			System.out.println("드라이버 로딩 성공");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
					
			String id = "SCOTT";
			String pw = "TIGER";
			
			Connection con = DriverManager.getConnection(url,id,pw);
			System.out.println("계정 접속 성공");
			
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
			
			SimpleDateFormat form1 = new SimpleDateFormat("yyyy년 MM월 dd일 ");
			SimpleDateFormat form2 = new SimpleDateFormat("HH : mm : ss ");
			
			String sdate = form1.format(hdate) + form2.format(htime);
			
			// 출력
			System.out.println("사원번호 : " + eno);
			System.out.println("사원이름 : " + name);
			System.out.println("사원직급 : " + job);
			System.out.println("상사번호 : " + mgr);
			System.out.println("사원급여 : " + sal);
			System.out.println("커 미 션 : " + comm);
			System.out.println("부서번호 : " + dno);
			System.out.println("입 사 일 : " + sdate);
			
		} catch (Exception e) {
			
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
