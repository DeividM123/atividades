package principal;

import java.util.Scanner;

public class atividade7 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);;

char operacao;
int numero=0;

System.out.println("qual tipo da operação(+,-,*,/):");
operacao=leia.next().charAt(0);

System.out.println("qual numero deseja fazer a a tabuada");
numero=leia.nextInt();

switch (operacao) {
case '+':
	for(int cont=1;cont<11;cont++) {
		System.out.println(numero+"+"+cont+"="+(cont+numero));
	}
	break;
	
case '-':
	int aux=numero;;
	for(int cont=1;cont<11;cont++) {
		System.out.println(
				(aux+cont)+"-"+numero+"="+((aux+cont)-numero));
	}
	break;
case '*':
	for(int cont=1;cont<11;cont++) {
		System.out.println(numero+"*"+cont+"="+(cont*numero));
	}
	break;
case '/':
	for(int cont=1;cont<11;cont++) {
		System.out.println((numero*cont)+"/"+numero+"="+(numero*cont/numero));
	}

default:
	break;
}

	}

}
