package rep;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoImpl implements Dao {
	private Connection conn;
	private PreparedStatement pstmt = null;

	public DaoImpl() {
		DBConnect dbconn = DBConnect.getInstance();
		conn = dbconn.getConnection();
	}

	private int makeNum() {
		ResultSet rs = null;
		String sql = "select seq_rep_ajax.nextval from dual";
		int num = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				num = rs.getInt(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	public int insert(Article a) {
		// TODO Auto-generated method stub
		int num = makeNum();
		String sql = "insert into rep_ajax values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, a.getName());
			pstmt.setString(3, a.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	public Article select(int num) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "select * from rep_ajax where num=?";
		Article a = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				a = new Article(rs.getInt(1), rs.getString(2), 
						rs.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	public ArrayList<Article> selectAll() {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		String sql = "select * from rep_ajax order by num";
		ArrayList<Article> a = new ArrayList<Article>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				a.add(new Article(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	public int update(Article a) {
		// TODO Auto-generated method stub
		String sql = "update rep_ajax set name=?, content=? "
				+ "where num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(3, a.getNum());
			pstmt.setString(1, a.getName());
			pstmt.setString(2, a.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a.getNum();
	}

	public int delete(int num) {
		// TODO Auto-generated method stub
		String sql = "delete rep_ajax where num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

}
