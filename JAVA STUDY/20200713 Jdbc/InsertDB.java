package firstJDBC;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String DB_URL = "jdbc:oracle:thin:@localhost:1522:xe";
		String DB_USER = "c##ora_user";
		String DB_PASSWORD = "park";


		String query = "INSERT INTO STUDENT(STU_NO, STU_NAME) " + 
		"VALUES (2021, 'PARK2')";


		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (
				Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement stmt = conn.prepareStatement(query);
				ResultSet rs = stmt.executeQuery(query)
		) {
			
			stmt.executeUpdate(query);
			System.out.println("완료");


				

			
		} catch (Exception e) {

		}

	}

}
