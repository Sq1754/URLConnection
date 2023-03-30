import java.net.*;
import java.io.*;

public class URL_Connection {
	public static void main(String[]args) {
		try {
			URL url = new URL("https://github.com/Sq1754") ;
			
			URLConnection urlConnect = url.openConnection();
			InputStream  input = urlConnect.getInputStream();
			
			int i;
			while((i=input.read()) != -1) {
				System.out.println((char)i);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
