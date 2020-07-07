package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<>();
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 31));
	
		System.out.println(set.size());
	
		Iterator<Member> it = set.iterator();
		while(it.hasNext()) {
			Member tempMember = it.next();
			System.out.print(tempMember.name + ", ");
			System.out.println(tempMember.age);
		
		}
		
	}

}
