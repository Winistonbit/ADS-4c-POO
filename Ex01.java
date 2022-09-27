package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		int altura, ret, base;
		// TODO Auto-generated method stub
		do {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe a base do retangulo : ", args);
		base = ler.nextInt();
		
		System.out.printf("informe a altura do retangulo : ", args);
		altura = ler.nextInt();
		if (base == altura)
		{
			System.out.printf("A base e altura digitados correspondem a area de um quadrado [] \n");
			System.out.printf(" --=   Reinicie o Programa e digite os valores corretos =-- \n\n");
			
			
		}
		else {
		ret= altura*base;
		System.out.printf("\n\n  +++++++++ A Area do retangulo mede : %d +++++++++",ret);
		break;}
		
		}while( altura == base);
	
			
	}

}
