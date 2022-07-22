package handling;

import java.io.File;
import java.io.IOException;

public class Createafile {
	public static void main(String[] args) {
		File newFile = new File("java.txt");
		try {
			if (newFile.createNewFile()) {
				System.out.println("File created successfully");
			} else {
				System.out.println("File creation error.");
			}
		} catch (IOException e) {
			System.out.println("File creation error");
		}

	}
}
