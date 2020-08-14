package order.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.DBConnect;
import model.Order;

public class DaoImpl implements Dao {
	private DBConnect db;

	public DaoImpl() {
		db = DBConnect.getInstance();
	}

	@Override
	public void insert(Order o) {
		Connection conn = db.getConnection();
		String sql = "INSERT INTO shop_order VALUES (seq.shop_order.nextval, ?, ?, ?, ?, sysdate, ?, 0)";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, o.getPro_num());
			pstmt.setInt(2, o.getOrder_num());
			pstmt.setInt(3, o.getTotal_price());
			pstmt.setString(4, o.getO_id());
			pstmt.setInt(5, o.getO_state());
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public Order select(int num) {
		Order o = null;
		ResultSet rs = null;
		Connection conn = db.getConnection();
		String sql = "select * from shop_order where num =?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return new Order(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getDate(6), rs.getInt(7), rs.getInt(8));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				rs.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}

	@Override
	public ArrayList<Order> selectAll(String o_id, int o_state) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Order> list = new ArrayList<Order>();
		String sql = "select * from shop_order where o_id = ? and o_state";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, o_id);
			pstmt.setInt(2, o_state);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Order(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getDate(6), rs.getInt(7), rs.getInt(8)));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				rs.close();
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		return list;
	}

	@Override
	public void delete(int num) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		String sql = "delete shop_order where num = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeQuery();
		}
		
	}

	@Override
	public void update(String type, int num) {
		// TODO Auto-generated method stub
		
	}
}
