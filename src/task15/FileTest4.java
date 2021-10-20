package task15;

import java.io.*;
import java.util.Scanner;

public class FileTest4 {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Users/nastya/Desktop/Java/myFile.txt");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите текст, который хотите добавить в файл:");
		String string = scanner.nextLine();
		
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write(string);
		
		br.close();
		fr.close();
	}
}
