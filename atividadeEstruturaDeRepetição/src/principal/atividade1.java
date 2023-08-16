package principal;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);

double nota=0;
System.out.println("entre com uma nota de 0 a 10");
nota=leia.nextDouble();

while(nota<=0||nota>=10) {
	System.out.println("nota invalida");
	System.out.println("entre com ma nota entre 0 e 10");
	nota=leia.nextDouble();
	
}
System.out.println("nota valida! valor informado: "+nota);

	}

}
