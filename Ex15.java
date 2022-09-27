package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex15 {

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
      
    	if (a != b && a != c && c != b)  
    	{
    		System.out.printf("\nEste triangulo possui todos os lados diferentes, portanto ESCALENO: ");
    		System.out.printf("\n Lado 1: %d / lado 2:  %d / lado 3: %d  ", a, b, c);
    	}
    	else
    	{ 
    		if (a == b && b == c && c == a)
    		{
    			System.out.printf("\nEste triangulo possui todos os lados iguais, portanto ISÓSCELES: ");
        		System.out.printf("\n Lado 1: %d / lado 2:  %d / lado 3: %d  ", a, b, c);
    		}
    		else
    		{
    			if (a == b || b == c || c == a)
    			{
    				System.out.printf("\nEste triangulo possui 2 lados iguais, portanto EQUILATERO: ");
            		System.out.printf("\n Lado 1: %d / lado 2:  %d / lado 3: %d  ", a, b, c);
    			}
    				
    		}
    		
    	}
    	  
    	  
		
		
	}

}
