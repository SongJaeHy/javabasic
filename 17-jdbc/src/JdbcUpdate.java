import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcUpdate {

	public static void main(String[] args) {
		Connection con = null;
		// 쿼리문을 날리기 위해 먼저 구문 객체를 생성합니다.
		Statement stmt = null;
		// SELECT문은 결과물이 존재하기 때문에
		// 결과데이터를 받아줄 ResultSet도 필요합니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("num에 들어갈 번호를 입력해주세요.");
		int strnum = scan.nextInt();
		System.out.println("새로 입력할 str 컬럼값을 입력해주세요.");
		String st = scan.next();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			con = DriverManager.getConnection(url,"root","mysql");
			
			stmt = con.createStatement();
			
			String sql = "UPDATE JDBCInsert SET str='" + st + "'" + "WHERE num=" + strnum;
			System.out.println(sql);
			
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
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}


