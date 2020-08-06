package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDao {

	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public Statement stmt = null;

	public String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	public String jdbc_url = "jdbc:oracle:this:@local:host:1522:xe";
	public String user_id = "c##ora_user";
	public String user_pw = "park";
	ResultSet rs = null;

	private static ProductDao sd = new ProductDao();

	private ProductDao() {

	}

	public static ProductDao getDao() {
		return sd;
	}

	public boolean con() {
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, user_id, user_pw);
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	public void discon() {
		try {
			if (stmt != null)
				stmt.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				pstmt.close();
			if (rs != null)
				rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(ProductVO p) {
		con();
		String sql = "insert into p_product values(s_pno.nextval, ?, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getPname());
			pstmt.setString(2, p.getPmaker());
			pstmt.setString(3, p.getPprice());
			pstmt.setString(4, p.getPdetail());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}
	}

	public ArrayList<ProductVO> getAll() {
		con();
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		String sql = "select * from p_product order by pno";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int num = rs.getInt(1);
				String pname = rs.getString(2);
				String pmaker = rs.getString(3);
				String pprice = rs.getString(4);
				String pdetail = rs.getString(5);

				ProductVO m = new ProductVO(num, pname, pmaker, pprice, pdetail);
				list.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			discon();
		}
		return list;
	}
	
	public ProductVO getMember(int num) {
		con();
		String sql = "SELECT * FROM p_product WHERE pno=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int pno = rs.getInt(1);
				String pname = rs.getString(2);
				String pmaker = rs.getString(3);
				String pprice = rs.getString(4);
				String pdetail = rs.getString(5);
				ProductVO m = new ProductVO(num,pname, pmaker, pprice, pdetail);
				return m;
			}
		} catch ( Exception e ) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return null;
	}
	
	public void edit(ProductVO p) {
		con();
		System.out.println(p);
		String sql = "UPDATE p_product SET pname=?, pmaker=?, pprice=?, pdetail=? where pno=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getPname());
			pstmt.setString(2, p.getPmaker());
			pstmt.setString(3, p.getPprice());
			pstmt.setString(4, p.getPdetail());
			pstmt.setInt(5, p.getPno());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			discon();
		}
	}
	
	public void delete(int num) {
		con();
		String sql = "DELETE p_product WHERE pno=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			discon();
		}
	}
}
