package serverClient;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("요청");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("연결 성공");
			
			OutputStream os = socket.getOutputStream();
			String message = "Hi Server";
			byte[] bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			
			InputStream is = socket.getInputStream();
			byte[] buf = new byte[100]; 
			int readCount = is.read(buf);
			String inputMessage = new String(buf,0 , readCount, "UTF-8");
			System.out.println("데이터 받기 : " + inputMessage);
			
			os.close();
			is.close();
			
		}catch(Exception e) {
			
		} finally {
			try {
				socket.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
