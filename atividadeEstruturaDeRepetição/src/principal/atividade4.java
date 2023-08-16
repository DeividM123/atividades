package principal;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);

int num1=0;
int num2=0;

System.out.println("digite o primeiro numero:");
num1=leia.nextInt();

System.out.println("digite o primeiro numero:");
num2=leia.nextInt();

for(int cont=++num1;cont<num2;cont++) {
	System.out.println(cont);
}
	}

}
