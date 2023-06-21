package aula.seis.model.entites;

import java.time.LocalDateTime;
import java.util.Objects;

public class PassagemAerea {
	
	private int numeroDeVoo;
	private LocalDateTime partida;
	private String origem;
	private String destino;
	private int numeroDeAssento;
	
	public PassagemAerea(int numeroDeVoo, LocalDateTime partida, 
			String origem, String destino, int numeroDeAssento) {
		this.numeroDeVoo = numeroDeVoo;
		this.partida = partida;
		this.origem = origem;
		this.destino = destino;
		this.numeroDeAssento = numeroDeAssento;
	}

	public int getNumeroDeVoo() {
		return numeroDeVoo;
	}

	public void setNumeroDeVoo(int numeroDeVoo) {
		this.numeroDeVoo = numeroDeVoo;
	}

	public LocalDateTime getPartida() {
		return partida;
	}

	public void setPartida(LocalDateTime partida) {
		this.partida = partida;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getNumeroDeAssento() {
		return numeroDeAssento;
	}

	public void setNumeroDeAssento(int numeroDeAssento) {
		this.numeroDeAssento = numeroDeAssento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroDeAssento, numeroDeVoo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PassagemAerea other = (PassagemAerea) obj;
		return numeroDeAssento == other.numeroDeAssento && numeroDeVoo == other.numeroDeVoo;
	}
}
