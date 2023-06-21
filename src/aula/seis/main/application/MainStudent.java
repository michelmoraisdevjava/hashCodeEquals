package aula.seis.main.application;

import aula.seis.model.entites.Student;

public class MainStudent {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "John", 10.0);
		Student student2 = new Student(1, "John", 10.0);
		Student student3 = new Student(2, "Mary", 9.0);
		
		System.out.println("Comparando com operador '==':");
		System.out.println("student1 == student2 " + (student1 == student2));
		System.out.println("student1 == student3 " + (student1 == student3));
		
		System.out.println("\nComparando com método 'equals()':");
		System.out.println("student1.equals(student2) " + student1.equals(student2));
		System.out.println("student1.equals(student3) " + student1.equals(student3));

	}

}
