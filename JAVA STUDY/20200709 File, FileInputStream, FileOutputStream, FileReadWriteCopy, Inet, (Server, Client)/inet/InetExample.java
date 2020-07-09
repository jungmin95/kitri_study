package inet;

import java.net.InetAddress;

public class InetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local.getHostName());
			System.out.println(local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress inet : iaArr) {
				System.out.println(inet.getAddress());
			}
			
		}catch (Exception e) {
			
		}
	}

}
