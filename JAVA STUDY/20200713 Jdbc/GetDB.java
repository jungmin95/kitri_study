package firstJDBC;

import java.sql.*;

public class GetDB {
	public static void main(String[] args) {
		String DB_URL = "jdbc:oracle:thin:@localhost:1522:xe";
		String DB_USER = "c##ora_user";
		String DB_PASSWORD = "park";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM STUDENT";
		
		
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				String stu_no = rs.getString(1);
				String stu_name = rs.getString(2);
				
				System.out.println(stu_no + " " + stu_name);
				
			}
		} catch(Exception e) {
			
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
