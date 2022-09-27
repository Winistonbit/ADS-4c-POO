package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1, valor2, ret;
		do {
		
       Scanner ler = new Scanner(System.in);
       System.out.printf("\nDigite um valor : ");
       valor1 = ler.nextDouble();
       System.out.printf("Digite o Segundo valor : ");
       valor2 = ler.nextDouble();
       if (valor1 == valor2)
       {System.out.printf("\n   ++  Os 2 valores informados são iguais!   ++");
       System.out.printf("  \n          Informe Novos Valores ");
       }
		}
       while(valor1 == valor2);
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
