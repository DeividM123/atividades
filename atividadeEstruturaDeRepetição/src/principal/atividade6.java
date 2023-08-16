package principal;

import java.util.Locale;
import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
Locale a=new Locale("en","us");		;
Scanner leia=new Scanner(System.in);

double altura=0;
double media=0;


for(int cont=0;cont<11;cont++) {
	System.out.println("digite sua altura");
	altura=leia.useLocale(a).nextDouble();
	media=media+altura;
}
System.out.println("a media das alturas é: "+(media/10));
	}

}
