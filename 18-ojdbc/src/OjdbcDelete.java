import java.sql.*;
//import java.util.Scanner;

public class OjdbcDelete {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력해주세요.");
//		int Vnum = scan.nextInt();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			con = DriverManager.getConnection(url, "mytest", "mytest");
			
			String sql = "DELETE FROM ojdbctest";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.executeUpdate();
			
			System.out.println(sql);
		
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
				
			}
		
		}
	}

}
