package swingproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import swingproject.domain.Board;

public class BoardDao {

	public static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@192.168.0.24:1521:xe";
	
	public static final String USER_ID = "c##ora_user";
	public static final String USER_PW = "123";
	
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement psmt = null;
	Statement stmt = null;
	
	public BoardDao() {
		try {
			Class.forName(DRIVER_NAME);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("fail...");
		}
		
	}
	private static BoardDao instance = new BoardDao();
	public static BoardDao getInstance() {
		return instance;
	}
//	public ArrayList<Board> selectBoardList() {
//		ArrayList<Board> list = new ArrayList<Board>();
//		System.out.println(list);
//		
//		try {
//			stmt = conn.createStatement();
//			
//			String sql = "SELECT * FROM BOARD";
//			rs = stmt.executeQuery(sql);
//			
//			
//			
//			while(rs.next()) {
//				list.add(new Board(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getInt(5), rs.getString(6)));
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
	public List<Board> readAll() {
		String sql = "SELECT * FROM BOARD";
		
		conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<Board> lists = new ArrayList<Board>();
		
		try { 
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Board board = new Board();
				
				board = new Board();
				board.setBoard_no(rs.getInt(1));
				
				board.setBoard_name(rs.getString(2));
				board.setBoard_content(rs.getString(3));
				board.setBoard_date(rs.getDate(4));
				board.setBoard_count(rs.getInt(5));
				board.setBoard_photo(rs.getString(6));
				lists.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lists;
	}
	
	public int create(Board board) {
		conn = DBConnection.getConnection();
	
		try {
			psmt = conn.prepareStatement("INSERT INTO BOARD (board_no, board_name, board_content, board_date)"
					+ "VALUES(board_seq.nextval, ?, ?, sysdate)");
			
			psmt.setString(1, board.getBoard_name());
			psmt.setString(2, board.getBoard_content());
//			psmt.setDate(3, board.getBoard_date());
			
			psmt.executeUpdate();
			return 1;
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("보드 create 예외");
		}
		return -1;
	}
	
	public void deleteBoard(int board_no) {
		conn =  DBConnection.getConnection();
		
		try {
			psmt = conn.prepareStatement("DELETE FROM BOARD WHERE board_no = ?");
			psmt.setInt(1, board_no);
			psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int updateBoard(Board board) {
		conn = DBConnection.getConnection();
		
		try {
			psmt = conn.prepareStatement("UPDATE BOARD SET board_name = ?, board_content = ? where board_no = ?");
			psmt.setString(1, board.getBoard_name());
			psmt.setString(2, board.getBoard_content());
			
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
