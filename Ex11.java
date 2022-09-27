package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base, altura, total;
		
		do {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite a Base do Terreno Retangular :");
        base=ler.nextDouble();
        System.out.printf("Digite a Altura do Terreno Retangular :");
        altura=ler.nextDouble();
        if (base==altura)
        {
        	System.out.printf("Os Valores Digitados correspondem a uma area quadrada[]");
        	System.out.printf("\nDigite novamente os valores\n");
        }
		}while(base == altura);
		total = base*altura;
		if ( total >= 100)
		{
        System.out.printf("TERRENO GRANDE %.2f metros quadrados", total);
		}
		else
		{
	        System.out.printf("A area do terreno é de %.2f metros Quadrados!", total);
		}	
		
		
		
	}

}
