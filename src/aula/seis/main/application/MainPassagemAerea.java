package aula.seis.main.application;

import java.time.LocalDateTime;

import aula.seis.model.entites.PassagemAerea;

public class MainPassagemAerea {

	public static void main(String[] args) {
		
		PassagemAerea passagem1 = new PassagemAerea(501, LocalDateTime.now(), "Recife", "Canadá", 17);
		PassagemAerea passagem2 = new PassagemAerea(501, LocalDateTime.now(), "Recife", "Canadá", 17);
		PassagemAerea passagem3 = new PassagemAerea(502, LocalDateTime.now(), "Recife", "Canadá", 15);
		
		System.out.println("Comparando numero de voo e numero de assentos usando equals:");
		System.out.println("passagem1.equals(passagem2) " + passagem1.equals(passagem2));
		System.out.println("passagem1.equals(passagem3) " + passagem1.equals(passagem3));

	}

}
