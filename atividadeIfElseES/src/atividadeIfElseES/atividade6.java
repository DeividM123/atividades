package atividadeIfElseES;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);

char sexo;
;

System.out.println("digite o seu sexo(m/f):");
sexo=leia.nextLine().charAt(0);

if(sexo=='f') {
	System.out.println("O sexo digitado é feminino");
}
else if(sexo=='m') {
	System.out.println("O sexo digitado é masculino");
}
else {
	System.out.println("Sexo não identificado");

}




	}

}
