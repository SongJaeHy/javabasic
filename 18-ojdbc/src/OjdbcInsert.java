import java.sql.*;
public class OjdbcInsert {

	public static void main(String[] args) {
		Connection con = null;
		
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			
			con = DriverManager.getConnection(url, "hr", "hr");
			
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch(SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if(con != null && !con.isClosed()) {
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
