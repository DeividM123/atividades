package principal;

import java.util.Scanner;

public class atividadeB {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		System.out.println("Digite  a primeira nota");
	    nota1=leia.nextDouble();
	    System.out.println("Digite a segunda nota");
	    nota2=leia.nextDouble();
	    System.out.println("Digite a terceira nota");
	    nota3=leia.nextDouble();
	    System.out.println("Digite a quarta nota");
	    nota4=leia.nextDouble();
	    
	    double media= (nota1+nota2+nota3+nota4)/4;
	    
	    System.out.println("A media das notas �: "+media);
	}

}
