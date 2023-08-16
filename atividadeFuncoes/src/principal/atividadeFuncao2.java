package principal;

import java.util.Scanner;

public class atividadeFuncao2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);

		System.out.println("entre com o valor em dolar"+" para se convertido em real");
		double real=sc.nextDouble();

				System.out.printf("valor em real:  %.2f", converterRealParaReal(real));
			}
		static double converterRealParaReal(double dolar) {
			return dolar*4.99;
		}
	}


