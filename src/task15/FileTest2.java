package task15;

import java.io.*;

public class FileTest2 {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Users/nastya/Desktop/Java/myFile.txt");
		
		//чтение файла и вывод содержимого на экран
		BufferedReader br = new BufferedReader(new FileReader(file));
		String fileText;
		while ((fileText = br.readLine()) != null)
			System.out.println(fileText);
		br.close();
	}
}
