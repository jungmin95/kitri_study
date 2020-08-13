package product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import conn.DBConnect;
import model.Product;

public class DaoImpl implements Dao {
	
	private DBConnect db;
	
	public DaoImpl() {
		db = DBConnect.getInstance();
	}

	

	public void insert(Product p) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO shop_product "
				+ "VALUES (seq_shop_product.nextval, ?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
//			pstmt.setInt(1, p.getNum());
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getQuantity());
			pstmt.setInt(3, p.getPrice());
			pstmt.setString(4, p.getImg());
			pstmt.setString(5, p.getContent());
			pstmt.setString(6, p.getS_id());
			
			pstmt.executeUpdate();
		}  catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

	
	public Product select(int num) {
		ResultSet rs = null;
		Connection conn = db.getConnection();
		Product product = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM shop_product WHERE num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		return product;
	}
	
	public ArrayList<Product> selectAllById(String s_id) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Product> products = new ArrayList<Product>();
		String sql = "SELECT * FROM shop_product where s_id=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s_id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				products.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7)));
			}
			rs.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			pstmt.close();
			conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return products;
	}

	

	public void update(Product p) {
		Connection conn = null;
		
		String sql = "UPDATE shop_product set name =?, quantity = ?, price = ?, content = ?, WHERE num = ? ";
		
		PreparedStatement pstmt = null;
		
		try { 
			conn = db.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getQuantity());
			pstmt.setInt(3, p.getPrice());
			pstmt.setString(4, p.getContent());
			pstmt.setInt(5, p.getNum());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		

		
	}

	public void delete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int selectNum() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

	
	public ArrayList<Product> selectAll() {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Product> products = new ArrayList<Product>();
		String sql = "SELECT * FROM shop_product order by num";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				products.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7)));
			}
			rs.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			pstmt.close();
			conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return products;
	}

	
	
	public void updateQuantity(int q, int num) {
		// TODO Auto-generated method stub
		

		
	}



	

}
