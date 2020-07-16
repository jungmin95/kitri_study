package kitri20200717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class User {
	private ArrayList<User> userList;
	private Socket socket;
	
	private BufferedReader br;
	private PrintWriter pw;
	
	public User(Socket socket) {
		this.socket = socket;
		
		init();
	}
	
	public void init() {
		userList = Server.getUserList();
		
		try {
			String temp;
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				temp = br.readLine();
				
				if(!temp.isEmpty()) {
					BroadCast(temp);
				} else {
					br.close();
				}
			}
			
		} catch(Exception e) { }
	}
	
	public void BroadCast(String msg) {
		Iterator<User> iter = userList.iterator();
		
		while(iter.hasNext()) {
			User temp = iter.next();
			
			if(temp.equals(this))
				continue;
			
			try {
				pw = new PrintWriter(temp.getSocket().getOutputStream());
				
				pw.println(msg);
				
				pw.flush();
			} catch(Exception e) { }
		}
	}
	public Socket getSocket() {
		return socket;
	}
}
