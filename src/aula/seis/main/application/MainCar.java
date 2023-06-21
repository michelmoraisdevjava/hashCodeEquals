package aula.seis.main.application;

import aula.seis.model.entites.Car;

public class MainCar {

	public static void main(String[] args) {
		
		Car car1 = new Car("Toyota", "Corolla", 2022);
		Car car2 = new Car("Toyota", "Corolla", 2022);
		Car car3 = new Car("Honda", "Civic", 2021);
		
		System.out.println("Comparando com operador '==':");
		System.out.println("car1 == car2 "  + (car1 == car2));
		System.out.println("car1 == car3 "  + (car1 == car3));
		
		System.out.println("\nComparando com método 'equals()':");
		System.out.println("car1.equals(car2): " + car1.equals(car2));
		System.out.println("car1.equals(car3): " + car1.equals(car3));
	}

}
