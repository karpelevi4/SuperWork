package task15;

import java.io.*;
import java.util.Scanner;

public class FileTest1 {
	
	public static void main(String[] args) throws IOException {
		
		//создание файла
		File file = new File("C:/Users/nastya/Desktop/Java/myFile.txt");
		
		//получение текста с клавиатуры
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите текст, который хотите записать в файл:");
		String string = scanner.nextLine();
		
		//запись текста в файл
		PrintWriter writer = new PrintWriter(file);
		writer.write(string);
		writer.close();
	}
}
