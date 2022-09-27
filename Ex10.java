package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1, valor2, ret;
		
       Scanner ler = new Scanner(System.in);
       System.out.printf("\nDigite um valor : ");
       valor1 = ler.nextDouble();
       System.out.printf("Digite o Segundo valor : ");
       valor2 = ler.nextDouble();
    
		
	  if (valor1 == valor2)
	  {
		  System.out.printf("Os Valores digitados são iguais : %.1f  / %.1f ", valor1,valor2);
	  }
	  else
	  {
       if (valor1 > valor2)
       {
    	   System.out.printf("O Valor que foi digitado primeiro é o maior : %.1f", valor1);
       }
       else
       {
    	 System.out.printf("O valor que foi digitado por último é o maior : %.1f", valor2); 
       }
		
	  }
	}

}

