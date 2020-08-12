package img.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.DBConnect;
import model.Img;

public class DaoImpl implements Dao{
	
	private DBConnect db;
	
	public DaoImpl() {
		db = DBConnect.getInstance();
	}

	@Override
	public void insert(Img img) {
		Connection conn = db.getConnection();
		
		String sql = "INSERT INTO img values (seq_img.nextval, ?, ?, ?, sysdate)";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, img.getTitle());
			pstmt.setString(2, img.getWriter());
			pstmt.setString(3, img.getPath());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public ArrayList<Img> selectAll() {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Img> data = new ArrayList<Img>();
		String sql = "select * from img order by num";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				data.add(new Img(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), null));
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return data;
		
	}
	
	
	
}
