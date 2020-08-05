package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	private static DBConnect db = new DBConnect();
	private Connection conn = null;
	
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:this:@localhost:1522:xe";
	
	private DBConnect() {
		
	}
	
	public static DBConnect getInstance() {
		return db;
	}
	
	public Connection getConnection() {
		try {
			Class.forName(jdbc_driver);
			
			conn = DriverManager.getConnection(jdbc_url, "c##oracle_user", "park");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
