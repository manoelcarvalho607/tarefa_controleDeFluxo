package br.com.rsilva;

import java.util.Scanner;

/**
 * 
 * @author manoel.carvalho
 *
 */

public class AppEstudante {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("***CONSULTE: MÉDIA/APROVAÇÃO CALENDÁRIO ESCOLAR**** ");
		System.out.println("");
		System.out.println("----------------------------------------------------");
		
		//nomeEstudante();
		
		NotaBimestral nb = new NotaBimestral();
		nb.notasBimestres();
	
	}
	
	public static String nomeEstudante() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o nome do aluno(a) abaixo:");
		String name = s.next();
	
		
		return name;
	}
	
	

}
