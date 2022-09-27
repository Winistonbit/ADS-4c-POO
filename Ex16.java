package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int a, b, c, soma;
	      Scanner ler = new Scanner(System.in);
	      System.out.printf("Digite um valor : ");
	      a= ler.nextInt();
	      System.out.printf("Digite o segundo valor");
	      b= ler.nextInt();
	      System.out.printf("Digite o terceiro valor");
	      c=ler.nextInt();
	      if (a*a == b*b+c*c || b*b == a*a+b*b || c*c == a*a+b*b )
	      {
	    	  System.out.printf("\nOs Valores digitados correspondem a um triangulo retangulo\n");
	    	  System.out.printf("Lado 1: %d  /  lado 2: %d  / Lado 3: %d ", a, b, c);
	      }else
	      {
	    	  System.out.printf("\nO Valores digitados não correspondem a um triangulo retangulo");
	      }
       
     
		
	}

}
