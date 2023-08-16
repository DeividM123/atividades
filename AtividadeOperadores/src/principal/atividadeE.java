package principal;

import java.util.Scanner;

public class atividadeE {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
		
		double celsius;
		
		
		System.out.println("Digite a atemperatura em graus Celsius:");
		celsius=leia.nextDouble();
		
		double fahrenheit=(celsius*1.8)+32;
		
		
		System.out.println("A temperatura convertida para Fahrenheit é: "+fahrenheit);

	}

}
