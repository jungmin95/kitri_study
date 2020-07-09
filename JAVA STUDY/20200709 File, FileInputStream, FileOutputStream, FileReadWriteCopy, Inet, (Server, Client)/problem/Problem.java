package problem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Problem {

	public static void main(String[] args) {

		
		File sourceFile = new File("C:/test/text.txt"); 
		File resultFile = new File("C:/test/textcopy.txt");
		String str = "Hello World";
		//sourceFile 에쓰기
		try {
			FileOutputStream fos = new FileOutputStream(sourceFile);
			fos.write(str.getBytes());
			fos.close();
		}catch (Exception e) {
			
		}
		
		
		try {
		if (!resultFile.exists()) {
			resultFile.createNewFile();
		}
		} catch (Exception e) {
			
		}
		//sourceFile읽고 resultFile쓰기
		try (FileInputStream fis = new FileInputStream(sourceFile);
			FileOutputStream fos = new FileOutputStream(resultFile)) 
		{
			byte[] buffer = new byte[8];
			
			int dataCount;
			while ((dataCount = fis.read(buffer)) != -1) {
				fos.write(buffer,0,dataCount);
			}
			
		} catch (Exception e) {
			
		} 
	}
}

//		
//		String filePath = "C:/test/test.txt";
//		String text = "Hello World";
//		byte[] textByte = text.getBytes();
//		
//		try {
//			FileOutputStream fos = new FileOutputStream(filePath);
//			
//			fos.write(textByte, 0, textByte.length);
//			fos.close();
//		
//		} catch (Exception e) {
//			
//		}
//		System.out.println("프로그램 종료");
//		
//	}
