package task15;

import java.io.*;
import java.util.Scanner;

public class FileTest3 {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Users/nastya/Desktop/Java/myFile.txt");
		
		//замена информации в файле на информацию, введённую с клавиатуры
		System.out.println("Введите текст, которым хотите заменить текст файла:");
		Scanner scanner = new Scanner(System.in);
		String newString = scanner.nextLine();

		String oldContent = "";
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = br.readLine();
		while (line != null) {
			oldContent += line + System.lineSeparator();
			line = br.readLine();
		}
		br.close();
		
		PrintWriter writer = new PrintWriter(file);
		String newContent = oldContent.replaceAll(oldContent, newString);
		writer.write(newContent);
		writer.close();
	}
}
