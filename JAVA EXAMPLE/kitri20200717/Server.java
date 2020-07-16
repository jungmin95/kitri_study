package kitri20200717;

import java.net.ServerSocket;
import java.util.ArrayList;

public class Server {
	private static final ArrayList<User> userList = new ArrayList<User>();
	
	public static ArrayList<User> getUserList() {
		return userList;
	}
	
	private ServerSocket s_socket;
	
	public Server() {
		init();
	}
	
	public void init() {
		try {
			s_socket = new ServerSocket(5099);
			System.out.println("server running successfull");
			
			while(true) {
				userList.add(new User(s_socket.accept()));
			}
			
		} catch(Exception e) {
			System.exit(-1);
		}
		

	}
	public static void main(String[] args) {
		new Server();
	}
	
}
