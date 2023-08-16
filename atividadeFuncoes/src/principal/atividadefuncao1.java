package principal;

import java.util.Scanner;

public class atividadefuncao1 {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);

System.out.println("entre com o valor em real"+" para se convertido em dolar");
double real=sc.nextDouble();

		System.out.printf("valor em dolar:  %.2f", converterRealParaDolar(real));
	}
static double converterRealParaDolar(double real) {
	return real/4.99;
}
}
