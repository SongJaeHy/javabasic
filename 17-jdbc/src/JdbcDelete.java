import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDelete {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		// ResultSet은 SELECT구문에 대한 결과만 처리함. 이외 구문에는 불필요.
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 번호를 입력해주세요.");
		int numValue = scan.nextInt();

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			con = DriverManager.getConnection(url, "root", "mysql");
			
			stmt = con.createStatement();
			// 쿼리문이 길다면 아래와 같이 + 로 여러줄로 나눠 연결합니다. 
			String sql = "DELETE FROM JDBCInsert WHERE num=" + numValue;
			System.out.println(sql);
			// SELECT 문은 executeQuery(sql구문); 형식으로 호출하지만
			// 이외구문은 executeUpdate(sql구문); 으로 호출합니다.
			stmt.executeUpdate(sql);
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
