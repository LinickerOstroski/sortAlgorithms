package model;

import java.time.LocalDate;
import java.util.Date;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private LocalDate nascimento;
	
	public Pessoa(String nome, LocalDate nascimento) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	@Override
	public int compareTo(Pessoa outraPessoa) {
		int comparaNome = this.nome.compareTo(outraPessoa.getNome());
		return comparaNome;
	}
	@Override
	public String toString() {
		return "Pessoa: " + nome;
	}
	
	
	

}
