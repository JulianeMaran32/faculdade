package prova;

import java.util.ArrayList;
import java.util.Scanner;

import prova.*;

public class Competicao {
	// atributo da classe � uma cole��o de objetos em um ArrayList
	
	// defini��o dos ArrayList atletas e provas:
	private ArrayList<Prova> provas;
	private ArrayList<Atleta> atletas;
	
	private String nome;
	private static Double idadeMedia;
	private static Double idadeMenor;
	
	// metodo construtor
	public Competicao(String nome) {
		
		// this = chama uma variavel local
		this.nome = nome;		
		
		// inicializa��o dos ArrayList
		this.provas = new ArrayList<Prova> ();
		this.atletas = new ArrayList<Atleta> ();
		
	}
	
	// idadeMedia() double
	public void idadeMedia(double idadeMedia) {
		//Atleta idadeMedia;
		
	}
	
	/*
	 * // idadeMedia() double
	public void setIdade(double idadeMedia) {
		this.idadeMedia = idadeMedia;
	}
	
	// idadeMenor() double
	public void setIdadeMenor(double idadeMenor) {
		this.idadeMedia = idadeMenor;
	}
	 */
	
	
	public static void main(String[] args) {
	//variaveis objetos locais dentro do metodo main
		
		System.out.println("*** Competi��o: campeonato entre clubes ***");
		
		Competicao comp1 = new Competicao("Azul");
		Competicao comp2 = new Competicao("Verde");
		
		// objeto do tipo competi��o e acessando o atributo Competi��o
		comp1.nome = "Competi��o A";	
		comp2.nome = "Competi��o B";
		
		System.out.println("\n--- Grupo de Atletas ---");
		System.out.println("-------------=-----------");
		System.out.println("");
		System.out.println(" Idade m�dia do grupo = ");
		System.out.println(" Menor idade do grupo = ");

		Atleta sanches   = new Atleta ("Antonio Sanches", "Corredor", 845, 23);
		Atleta antunes   = new Atleta ("Rodrigo Antues", "Corredor", 726, 20);
		Atleta carlos    = new Atleta ("Roberto Carlos", "Corredor", 153, 22);	
		
		// invocando os metodos da Classe Atleta
		sanches.imprimirAtleta();
		antunes.imprimirAtleta();
		carlos.imprimirAtleta();
				
		System.out.println("\n--- Cronograma de Provas ---");
		System.out.println("------------------------------");
		
		Prova metros = new Prova("Corrida 100 metros", "Estadio Man� Garrincha", 12, 10, 2020, "14:30");
		
		Prova obstaculo = new Prova("Corrida com obstaculos", "Estadio Man� Garrincha", 12, 10, 2020, "09:00");
		
		metros.imprimirProva();
		obstaculo.imprimirProva();

		
		
		
	}

}
