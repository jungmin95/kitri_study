package firstJDBC;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetDBToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String DB_URL = "jdbc:oracle:thin:@localhost:1522:xe";
		String DB_USER = "c##ora_user";
		String DB_PASSWORD = "park";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileOutputStream fos = null;
		
		String query = "SELECT * FROM STUDENT";
		
		String filePath = "C:/test/";
		String fileName = "Student.txt";
		
		File dir = new File(filePath);
		if(dir.exists() == false) {
			dir.mkdir();
		}
		
		File file = new File(filePath + "/" + fileName);
		
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
					
					fos = new FileOutputStream(file);
					
					while (rs.next()) {
						String stu_no = rs.getString(1);
						String stu_name = rs.getString(2);
						String text = stu_no + " " + stu_name + "\r\n"; 
						System.out.println(text);
						byte[] bytes = text.getBytes();
						
						fos.write(bytes);
						
					}
				} catch(Exception e) {
					
				} finally {
					try {
						try {
							fos.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
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
