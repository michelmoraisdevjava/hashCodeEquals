package aula.seis.main.application;

import aula.seis.model.entites.Aluno;

public class MainAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("1001B", "João", 17);
		Aluno aluno2 = new Aluno("1001B", "Renato", 16);
		Aluno aluno3 = new Aluno("1002A", "Maria", 18);
		
		System.out.println("Comparando os objetos Alunos com equals:");
		System.out.println("aluno1.equals(aluno2) " + aluno1.equals(aluno2));
		System.out.println("aluno1.equals(aluno3) " + aluno1.equals(aluno3));
	}

}
