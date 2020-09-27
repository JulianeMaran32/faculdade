package prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Atleta {
	
	private String nome;
	private String equipe;
	private int numero;
	private int idade;
	private int idadeMedia;
	private int idadeMenor;
		
	public Atleta(String nome, String equipe, int numero, int idade) {
		this.nome = nome;
		this.numero = numero;
		this.equipe = equipe;
		this.idade = idade;
	}
		
	public void imprimirAtleta() {		
		System.out.println("\nNome do Atleta: " + this.nome);
		System.out.println(" - Equipe: " + this.equipe);
		System.out.println(" - Número: " + this.numero);
		System.out.println(" - Idade: " + this.idade);
	}
	
	//getIdade() int	
	public int getIdade() {		// getter: retorna o valor do atributo
		return idadeMedia;
	}
	
	public int getIdadeMenor() {
		return idadeMenor;
	}
	
}
