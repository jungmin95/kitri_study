package serverClient;

import java.net.*;
import java.io.*;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			
			while(true) {
				System.out.println("Waiting");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = 
						(InetSocketAddress)socket.getRemoteSocketAddress();
				
				System.out.println("-- client information --");
				System.out.println(isa.getHostName());
				System.out.println(isa.getPort());
				System.out.println(isa.toString());
				
				InputStream is = socket.getInputStream();
				byte[] bytes = new byte[100];
				int readCount = is.read(bytes);
				String message = new String(bytes, 0, readCount, "UTF-8");
				System.out.println("데이터 받기(from Client) : " + message);
				
				OutputStream os = socket.getOutputStream();
				String inputString = "hello Client";
				byte[] buf = inputString.getBytes();
				os.write(buf);
				os.flush();
				System.out.println("Server Data 전송함!!");
				
				is.close();
				os.close();
				socket.close();
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
