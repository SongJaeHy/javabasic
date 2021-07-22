import java.sql.*;

public class OjdbcConnection {

	public static void main(String[] args) {
		// MySQL과 마찬가지로 Oracle SQL 역시 .jar 파일을 제공합니다.
		// 먼저, jar파일을 import 해야 연결이 되기 때문에
		// 연결부터하겠습니다.
		// jar 파일의 위치
		// sqldeveloper -> jdbc폴더 -> lib폴더 -> ojdbc8.jar
		
		// 1. 프로젝트 우클릭 -> properties
		// 2. 상단 탭의 libraries 선택 후 우측의 Add library 선택
		// 3. user library 선택후 우측 user libraries 선택
		// 4. 우측 new 버튼 누르고 이름 임의로 입력(현재 jdbc connection)
		// 5. Add External Jar 선택 후 connector j 폴더 이동
		// 6. jar 파일 선택 후 apply and close 
		
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			
			con = DriverManager.getConnection(url, "mytest", "mytest");
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch(SQLException e) {
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
