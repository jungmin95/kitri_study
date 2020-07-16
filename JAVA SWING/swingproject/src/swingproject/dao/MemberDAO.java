package swingproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import swingproject.domain.Member;

public class MemberDAO {
	
	private MemberDAO() {}
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	public int findByUserNameAndPassword(String customer_id, String customer_pw) {
		conn = DBConnection.getConnection();
		try {
			psmt = conn.prepareStatement("SELECT * FROM customer WHERE customer_id = ? AND customer_pw = ?");
			
			System.out.println("로그인 돌까");
			psmt.setString(1,  customer_id);
			psmt.setString(2,  customer_pw);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				
				return 1;
				
			
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
			
		}
		return -1;
		
	}
	
	public int save(Member member) {
		conn = DBConnection.getConnection();
		
		try {
			psmt = conn.prepareStatement("INSERT INTO CUSTOMER"
					+ "(customer_no, customer_id, customer_pw, customer_name, customer_phone, customer_birth, customer_address, admin_no) "
					+ "VALUES(member_seq.nextval ,?, ?, ?, ?, ?, ?, null) ");
			System.out.println("==============================");
			psmt.setString(1,  member.getCustomer_id());
			psmt.setString(2, member.getCustomer_pw());
			psmt.setString(3, member.getCustomer_name());
			psmt.setString(4,  member.getCustomer_phone());
			psmt.setString(5, member.getCustomer_birth());
			psmt.setString(6,  member.getCustomer_address());
			psmt.executeUpdate();
			return 1;
		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("-------------------");
		}
		return -1;
	}
	
	
	//회원목록
	public Vector<Member> findByAll() {
		conn = DBConnection.getConnection();
		Vector<Member> members = new Vector<>();
		try {
			psmt = conn.prepareStatement("SELECT * FROM CUSTOMER");
			rs = psmt.executeQuery();
			while(rs.next()) {
				Member member = new Member();
				member.setCustomer_no(rs.getInt("customer_no"));
				member.setCustomer_id(rs.getString("customer_id"));
				member.setCustomer_pw(rs.getString("customer_pw"));
				member.setCustomer_name(rs.getString("customer_name"));
				member.setCustomer_phone(rs.getString("customer_phone"));
				member.setCustomer_birth(rs.getString("customer_birth"));
				member.setCustomer_address(rs.getString("customer_address"));
				
			}
			return members;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
