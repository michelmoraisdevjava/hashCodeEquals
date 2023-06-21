package aula.seis.main.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import aula.seis.model.entites.Order;

public class MainOrder {

	public static void main(String[] args) {
				
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Order order1 = new Order(1001, LocalDateTime.now(), 150.00);
		Order order2 = new Order(1001, LocalDateTime.now(), 170.00);
		Order order3 = new Order(1002, LocalDateTime.now(), 250.00);
		
		System.out.print("Data do pedido: " + LocalDateTime.now().format(fmt));
		System.out.println("\nComparando os objetos Alunos com equals:");
		System.out.println("order1.equals(order2) " + order1.equals(order2));
		System.out.println("order1.equals(order3) " + order1.equals(order3));
	}

}
