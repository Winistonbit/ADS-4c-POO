package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner ler= new Scanner(System.in);
       int a,b,c,soma;

       System.out.printf("Digite o Primeiro Valor : ");
       a=ler.nextInt();
       System.out.printf("Digite o Segundo Valor : ");
       b=ler.nextInt();
       System.out.printf("Digite o Terceiro Valor : ");
	   c=ler.nextInt();
	   soma=a+b;
	   if (soma < c)
	   {
		   System.out.printf("A Soma de A-%d + B-%d =  %d é MENOR que C - %d ", a, b, soma, c);
	   } 
	   else
	   {
		   System.out.printf("A Soma de A-%d + B-%d =  %d, é MAIOR que C - %d ", a, b, soma, c);  
	   }
	}
}
