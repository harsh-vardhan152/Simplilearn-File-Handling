package handling;

import java.io.FileReader;
import java.io.IOException;

public class Readafile {
	public static void main(String[] args) {
		char[] read = new char[100];
		
		try {
			FileReader input = new FileReader("java.txt");
			input.read(read);
			System.out.println("Data received from the file that you are created");
			System.out.println(read);
			input.close();
		} catch (IOException e) {
			System.out.println("File Read error");
		}
	}

}
