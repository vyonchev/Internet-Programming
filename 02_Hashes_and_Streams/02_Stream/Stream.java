import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Stream {

	
	
	public static void main(String[] args) throws IOException {
		
		
		InputStream input = System.in;
		InputStreamReader str = new InputStreamReader(input);
		BufferedReader reader = new BufferedReader(str);
		System.out.println(reader.readLine().toUpperCase());
	}
}
