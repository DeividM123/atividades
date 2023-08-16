package principal;

import java.util.Scanner;

public class atividadeD {

	public static void main(String[] args) {
    Scanner leia=new Scanner(System.in);
		
		double fahrenheit;
		
		System.out.println("Digite a atemperatura em graus Fahrenheit:");
		fahrenheit=leia.nextDouble();
		
		double celsius=5*((fahrenheit-32)/9);
		
		System.out.println("A temperatura convertida para Celsius é: "+celsius);
	}

}
