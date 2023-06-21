package aula.seis.main.application;

import aula.seis.model.entites.ContaBancaria;

public class MainContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria(5784, "Paulo", 500.00);
		ContaBancaria conta2 = new ContaBancaria(5784, "Paulo", 600.00);
		ContaBancaria conta3 = new ContaBancaria(5789, "Carlos", 700.00);
		
		System.out.println("Comparando usando o método equals:");
		System.out.println("conta1.equals(conta2) " + conta1.equals(conta2));
		System.out.println("conta1.equals(conta3) " + conta1.equals(conta3));
	}

}
