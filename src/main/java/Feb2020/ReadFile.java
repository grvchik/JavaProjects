package Feb2020;

import java.io.InputStream;
import java.net.URL;



public class ReadFile {

	public void readFile() {
		ClassLoader classLoader = ReadFile.class.getClassLoader();
		InputStream is = classLoader.getResourceAsStream("\\File.txt");
		//System.out.println(url);
		
		System.out.println(is);
		
	}
	
	
	public static void main(String g[]) {
		ReadFile sdp = new ReadFile();
		sdp.readFile();
			
	
	
	}

}
