package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAlturasVetor {
	//Exercio de fixacao

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos pessoas vc vai digitar? ");
		int n = sc.nextInt();
		
		String [] Nomes   = new String [n]; //instancia um vetor Nomes de tamanho n
		int [] Idades     = new int [n];
		double [] Alturas = new double [n];
		double alturaMedia, somaAlturas = 0.0;
		int contMenores = 0;
		
		
		for (int i=0; i<n; i++) {          //Preenche e exibe os vetores
	    	System.out.println("Dados da " + (i+1) + "a pessoa:");	    			
	    	System.out.print("Nome: ");
	        Nomes [i] = sc.next();
	        System.out.print("Idade: ");
	        Idades [i] = sc.nextInt();
	        System.out.print("Altura: ");
	        Alturas [i] = sc.nextDouble();	    	    	
		}
		
		for (int i=0; i<n; i++) {          //Calcula Altura média
			somaAlturas += Alturas [i];
		}
		alturaMedia = somaAlturas/n;		
		System.out.printf("\nAltura Media:  %.2f\n", alturaMedia);
		
		for (int i=0; i<n; i++) {          //Conta menores de 16 anos
			if (Idades [i] < 16) {
			   contMenores = contMenores + 1;	
			};
	    }
		double percentMenores = contMenores * 100 / n;
		System.out.printf("\nPercentagem de menores de 16 anos:  %.1f%%\n", percentMenores);
		
		
		for (int i=0; i<n; i++) {          //Imprime nome dos menores de 16 anos
			if (Idades [i] < 16) {
				System.out.println(Nomes[i]);
			};
	    }
		
		sc.close();
	}

}
