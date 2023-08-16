package atividadeIfElseES;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);

int ano;

System.out.println("digite o ano:");
ano=leia.nextInt();

if(ano%4==0) {
System.out.println("O ano digitado é bissexto");
	}
else {
	System.out.println("O ano não é bissexto");
	}
}

}
