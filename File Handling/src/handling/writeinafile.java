package handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeinafile {

	public static void main(String[] args) {
		String Data;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text that you want to add in the text file");
		Data = sc.next();

		try {
			FileWriter Text = new FileWriter("java.txt");
			Text.write(Data);
			System.out.println("Data is enter in the file successfully ");
			Text.close();
			
		} catch (IOException e) {
			System.out.println("File write error");
		}
	}
}
