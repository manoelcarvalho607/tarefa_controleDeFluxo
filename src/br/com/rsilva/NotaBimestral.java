package br.com.rsilva;

import java.util.Scanner;
/**
 * 
 * @author manoel.carvalho
 *
 */



public class NotaBimestral {
	
	public String  notasBimestres() {
		Scanner s = new Scanner(System.in);
		AppEstudante appEstudante = new AppEstudante();
		String name  = appEstudante.nomeEstudante();
		 
		
		
		System.out.println("Informe abaixo a nota do primeiro bimestre do(a) aluno(a) " + name + ":");
		System.out.println("Atenção: Se a nota possuir casas decimais ultize virgula ex: (8,10)");
		double notab1 = s.nextDouble();
		System.out.printf("Nota do primeiro bimestre: %.2f %n", notab1);
		System.out.println("Informe abaixo a nota do segundo bimestre do(a) aluno(a) " + name + ":");
		System.out.println("Atenção: Se a nota possuir casas decimais ultize virgula ex: (8,10)");
		double notab2 = s.nextDouble();
		System.out.printf("Nota do segundo bimestre: %.2f %n", notab2);
		System.out.println("Informe abaixo a nota do terceiro bimestre do(a) aluno(a) " + name + ":");
		System.out.println("Atenção: Se a nota possuir casas decimais ultize virgula ex: (8,10)");
		double notab3 = s.nextDouble();
		System.out.printf("Nota do terceiro bimestre: %.2f %n", notab3);
		System.out.println("Informe abaixo a nota do quarto bimestre do aluno(a) " + name + ":");
		System.out.println("Atenção: Se a nota possuir casas decimais ultize virgula ex: (8,10)");
		double notab4 = s.nextDouble();
		System.out.printf("Nota do quarto bimestre: %.2f %n", notab4);
		
		double media = (notab1+notab2+notab3+notab4) / 4;
		System.out.println("----------------------------------------------------");
		System.out.printf("Somando as notas dos 4 bimestres, o(a) aluno(a) " + name + ", ficou com a média de = %.2f %n", media);
		
		
		String result;
		
		if(media >= 7) {
			 result =  "aprovado(a)";
		}else if(media  >= 5 && media <7) {
			result = "está em Recuperação";
		}else {
			result = "Reprovado(a)";
		}
		
		
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("O(a) aluno(a) " + name + " está: " + result );
		
		
		return result;
		
	}
	

	
	
}
