package swingproject.domain;

import java.sql.Date;

public class Board {
	private int board_no;
	private String board_name;
	private String board_content;
	private Date board_date;
	private int board_count;
	private String board_photo;
	
	public Board(int board_no, String board_name, String board_content, Date baord_date, int board_count, String board_photo, Date board_date) {
		this.board_no = board_no;
		this.board_name = board_name;
		this.board_content = board_content;
		this.board_date = board_date;
		this.board_count = board_count;
		this.board_photo = board_photo;
		
	}

	public Board() {
		// TODO Auto-generated constructor stub
	}

	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public Date getBoard_date() {
		return board_date;
	}
	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}
	public int getBoard_count() {
		return board_count;
	}
	public void setBoard_count(int board_count) {
		this.board_count = board_count;
	}
	public String getBoard_photo() {
		return board_photo;
	}
	public void setBoard_photo(String board_photo) {
		this.board_photo = board_photo;
	}
	@Override
	public String toString() {
		return "Board [board_no=" + board_no + ", board_name=" + board_name + ", board_content=" + board_content
				+ ", board_date=" + board_date + ", board_count=" + board_count + ", board_photo=" + board_photo + "]";
	}
	
	
	
	
	
}
