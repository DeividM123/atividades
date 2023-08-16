package principal;

import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
		int numero;
		String mensagem;
		
		System.out.println("digite uma mensagem ");
		mensagem= leia.nextLine();
		leia.nextLine();
		
		System.out.println("Digite um numero: ");
		numero= leia.nextInt();
		 
		
		
		
		
		System.out.println("o numero informado foi: " +numero);
		System.out.println("a mensagem informada foi: " +mensagem);
		

		
		
		
		
		
		
		
		
		leia.close();

	}

}
