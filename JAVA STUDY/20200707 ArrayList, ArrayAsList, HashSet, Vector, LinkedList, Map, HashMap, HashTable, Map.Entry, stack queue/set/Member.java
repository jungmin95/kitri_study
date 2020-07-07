package set;

public class Member {
	public String name;
	public int age;
	
	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob instanceof Member) {
			Member member = (Member) ob;
			return member.name.equals(name);
		} else {
		return false;
		}
	}
	
	@Override
	public int hashCode() {
		
//		return name.hashCode() + age;
		return name.hashCode();
	}
	
}
