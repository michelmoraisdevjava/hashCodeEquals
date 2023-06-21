package aula.seis.main.application;

import aula.seis.model.entites.Book;

public class MainBook {

	public static void main(String[] args) {
		
		Book book1 = new Book("Harry Potter", "J.K. Rowling", "9780545010221");
		Book book2 = new Book("Harry Potter", "J.K. Rowling", "9780545010221");
		Book book3 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "9780618640157");
		
		System.out.println("Comparando com operador '==':");
        System.out.println("book1 == book2: " + (book1 == book2)); // false
        System.out.println("book1 == book3: " + (book1 == book3)); // false
        
        System.out.println("\nComparando com método 'equals()':");
        System.out.println("book1.equals(book2): " + book1.equals(book2)); // true
        System.out.println("book1.equals(book3): " + book1.equals(book3)); // false
        System.out.println("\nbook1.hashCode(): " + book1.hashCode());
        System.out.println("book2.hashCode(): " + book2.hashCode());
        System.out.println("book3.hashCode(): " + book3.hashCode());

	}

}
