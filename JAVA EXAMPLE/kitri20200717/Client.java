package kitri20200717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private Socket socket;
	private Scanner scan;
	private BufferedReader reader;
	private PrintWriter writer;
	
	
	public Client() {
		init();
	}
	
	public void init() {
		try {
			socket = new Socket("localhost", 5099);
			
			System.out.println("connected");
		
			scan = new Scanner(System.in);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());
			
			readerExecute();
			
			String input = "";
			
			while(true) {
				System.out.println("to others> ");
				input = scan.nextLine();
				
				if(input.contains("disconnect"))
					socket.close();
				
				writer.println(input);
				writer.flush();
				
			}
		}catch(Exception e) {
			System.out.println("can`t connect to server, will be exit.");
			System.exit(-1);
		}
	}
	
	
	public void readerExecute() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				String temp;
				while(true) {
					try {
						temp = reader.readLine();
						if(!temp.isEmpty()) {
							System.out.println("from others > " + temp);
						}
					} catch(Exception e) {
						
					}
				}
			}
		}).start();
	}
	public static void main(String[] args) {
		new Client();
	}
}
