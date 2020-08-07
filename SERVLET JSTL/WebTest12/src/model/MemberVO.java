package model;

public class MemberVO {
	private String id;
	private String passwrod;
	private String name;
	private String address;
	public MemberVO(String id, String passwrod, String name, String address) {
		super();
		this.id = id;
		this.passwrod = passwrod;
		this.name = name;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswrod() {
		return passwrod;
	}
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", passwrod=" + passwrod + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
}
