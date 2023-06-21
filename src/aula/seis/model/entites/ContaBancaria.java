package aula.seis.model.entites;

import java.util.Objects;

public class ContaBancaria {
	
	private int numeroDaConta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numeroDaConta, String titular, double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroDaConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		return numeroDaConta == other.numeroDaConta;
	}
}
