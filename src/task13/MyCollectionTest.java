package task13;

public class MyCollectionTest {
	
	public static void main(String[] args) {
		
		//информация, которую мы хотим добавить
		int[] id = {202, 321, 323, 429, 344, 904, 210, 483, 438, 480};
		String[] name = {"Ann", "Max", "Alex", "Dan", "Tom",
				"Fred", "Stacy", "Nick", "Nancy", "Ken"};
		double[] gpa = {4.2, 3.98, 4.4, 5.0, 4.0, 3.8, 4.46, 4.88, 5.0, 4.2};
		
		//создаём объект нашей коллекции
		MyCollection object = new MyCollection();
		
		object.addElements(id, name, gpa);
		object.displayElements();
	}
}
