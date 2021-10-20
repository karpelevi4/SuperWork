package task13;

import java.util.ArrayList;

public class MyCollection {
	
	int size = 10;
	
	class Student {
		
		int id;
		String name;
		double gpa;
		
		public Student (int id, String name, double gpa) {
			
			this.id = id;
			this.name = name;
			this.gpa = gpa;
		}
	}
	
	public void addElements(int[] id, String[] name, double[] gpa) {
		
		ArrayList<Student> arrayList = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			
			arrayList.add(new Student(id[i], name[i], gpa[i]));
		}
	}
	
	public void displayElements() {
		
		System.out.printf("Student's ID\tStudent's name\tStudent's gpa\n");
		for (int i = 0; i < size; i++) {
		
//			Student student = arrayList.get(i);
		}
	}
}
