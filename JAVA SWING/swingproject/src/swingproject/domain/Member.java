package swingproject.domain;

public class Member {
	
	private int customer_no;
	private String customer_id;
	private String customer_pw;
	private String customer_name;
	private String customer_phone;
	private String customer_birth;
	private String customer_address;
	
	
	
	public int getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(int customer_no) {
		this.customer_no = customer_no;
	}
	
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_pw() {
		return customer_pw;
	}
	public void setCustomer_pw(String customer_pw) {
		this.customer_pw = customer_pw;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_phone() {
		return customer_phone;
	}
	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}
	public String getCustomer_birth() {
		return customer_birth;
	}
	public void setCustomer_birth(String customer_birth) {
		this.customer_birth = customer_birth;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public Member(int customer_no, String customer_id, String customer_pw, String customer_name, String customer_phone, String customer_birth, String customer_address) {
		this.customer_no = customer_no;
		this.customer_id = customer_id;
		this.customer_pw = customer_pw;
		this.customer_name = customer_name;
		this.customer_phone = customer_phone;
		this.customer_birth = customer_birth;
		this.customer_address = customer_address;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Member [customer_id=" + customer_id + ", customer_pw=" + customer_pw + ", customer_name=" + customer_name + ", customer_phone=" + customer_phone + ", customer_birth= " +customer_birth+", customer_address="
				+ customer_address + "]";
	}
	
	public Member() { }

	
}
