package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double valor1, valor2, valor3, maior; 
		Scanner ler =new Scanner(System.in);
		System.out.printf("Digite um valor : ");
		valor1 = ler.nextDouble();
		System.out.printf("Digite o segundo valor : ");
		valor2= ler.nextDouble();
		if (valor1 > valor2)
		{
			maior = valor1;
		}
		else
		{
			maior = valor2;
		}
		System.out.printf("Digite o terceiro valor : ");
		valor3 = ler.nextDouble();
		if ( valor3 > maior)
		{   maior = valor3;
			System.out.printf("O maior valor é : %.1f",maior);
		}
		else
		{
			System.out.printf("O maior valor é : %.1f",maior);	
		}
		
		
	}

}
