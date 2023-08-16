package principal;

import java.util.Scanner;

public class atividadeA {

	public static void main(String[] args) {
       Scanner leia= new Scanner(System.in);
       
       int numero1;
       int numero2;
      
       
       System.out.println("Digite o primeiro numero");
       numero1=leia.nextInt();
       System.out.println("Digite o segundo numero");
       numero2=leia.nextInt();
       
        int resultado=numero1+numero2;
       
       System.out.println("o resultado é: "+resultado);
       
       leia.close();
       
	}

}
