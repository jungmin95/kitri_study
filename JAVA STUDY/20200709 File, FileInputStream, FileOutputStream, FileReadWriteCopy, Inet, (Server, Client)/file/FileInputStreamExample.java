package file;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			String filePath = "C:/test/test.txt";
			FileInputStream fis = new FileInputStream(filePath);
			
			int data;
			while((data = fis.read()) != -1) {
//				System.out.println(data);
				System.out.write(data);
				
			}
		} catch (Exception e) { }
		
		System.out.println("프로그램 종료");

	}

}
