package atividadeIfElseES;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);

int numero;

System.out.println("Digite o numero:");
numero=leia.nextInt();

if(numero%2==0) {
	System.out.println("O numero é par");
}
else {
	System.out.println("O numero é impar");
}

	}

}
