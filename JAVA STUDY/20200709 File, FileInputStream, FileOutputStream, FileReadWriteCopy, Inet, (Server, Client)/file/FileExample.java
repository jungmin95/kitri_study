package file;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) {
		File dir = new File("C:/test");
		File file = new File("C:/test/test.txt");
		try {
			File file2 = new File(new URI("c:/test/test2.text"));
			if(file2.exists() == false) {
				file2.createNewFile();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(dir.exists() == false) {
			dir.mkdir();
		}
		if(file.exists() == false) {
			try {
				dir.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		File path = new File("C:/test");
		File[] contents = path.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		for(File tempfile : contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			
			if (tempfile.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + tempfile.getName());
			} else {
				System.out.print("\t\t" + tempfile.length() + "\t" + tempfile.getName());
			}
			System.out.println();
		}

		
		
		
	}

}
