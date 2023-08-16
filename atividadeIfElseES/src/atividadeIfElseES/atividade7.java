package atividadeIfElseES;

import java.util.Locale;
import java.util.Scanner;

public class atividade7 {

	public static void main(String[] args) {
Scanner leia=new Scanner(System.in);
final Locale ponto=new Locale("en", "us");

double nota1;
double nota2;
double nota3;
double nota4;

System.out.println("Digite a primeira nota:");
nota1=leia.useLocale(ponto).nextDouble();
System.out.println("Digite a segunda nota:");
nota2=leia.useLocale(ponto).nextDouble();
System.out.println("Digite a terceira nota:");
nota3=leia.useLocale(ponto).nextDouble();
System.out.println("Digite a quarta nota:");
nota4=leia.useLocale(ponto).nextDouble();

double media=(nota1+nota2+nota3+nota4)/4;

if(media<6) {
	System.out.println("O aluno esta reprovado");
}
else if(media>=6 && media<7) {
	System.out.println("O aluno esta de recuperação");

}
else if(media>=7 && media<10) {
	System.out.println("O aluno esta aprovado");
		
		
	}
else if(media==10) {
	System.out.println("O aluno esta aprovado com honras");

}
}}