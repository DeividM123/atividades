package principal;

import java.util.Scanner;

public class atividadeC {

	public static void main(String[] args) {
          Scanner leia=new Scanner(System.in);
          
          double salarioHora;
          int horasTrabalhadas;
          
          System.out.println("Digite quanto voce ganha por hora:");
          salarioHora=leia.nextDouble();
          
          System.out.println("Digite quantas horas trabalha por mês:");
          horasTrabalhadas=leia.nextInt();
          
          double salario=horasTrabalhadas*salarioHora;
          
          System.out.println("o seu salário mensal é: "+salario);
	}

}
