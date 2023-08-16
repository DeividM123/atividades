package atividadearrays;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);

int quantidade=0;

System.out.println("nomes desejados: ");
quantidade=leia.nextInt();
leia.nextLine();

String[] nomes=new String[quantidade];


for(int cont=0;cont<nomes.length;cont++) {
	System.out.println("Digite o nome:");
	nomes[cont]=leia.nextLine();
	
}	
for(String nome : nomes) {
	System.out.println(nome);
}
	leia.close();
}

}
	


