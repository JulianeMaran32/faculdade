package prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Prova {
	
	private String nomeProva;
	private String local;
	private int dia;
	private int mes;
	private int ano;
	private String horario;
	
	public Prova(String nomeProva, String local, int dia, int mes, int ano, String horario) {
		this.nomeProva = nomeProva;
		this.local = local;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.horario = horario;
	}
	
	// imprimirProva() void
	public void imprimirProva() {
		System.out.println("");
		System.out.println("Prova: " + this.nomeProva);
		System.out.println(" - Local: " + this.local);
		System.out.println(" - Data: " + this.dia + "/" + this.mes + "/" + this.ano);
		System.out.println(" - Horário: " + this.horario);
		System.out.println("");
	}	
}
