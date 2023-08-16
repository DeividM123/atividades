package atividadearrays;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

double[]notas=new double[4];

System.out.println("entre com o nome");
String nome= sc.nextLine();

for(int cont=0;cont<notas.length;cont++) {
	System.out.println("entre com as notas");
	notas[cont]=sc.nextDouble();
}
double media=(notas[0]+notas[1]+notas[2]+notas[3])/4;

System.out.printf("a media dos %s é: %.2f",nome,media);
	}

}
