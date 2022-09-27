package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		int altura, ret, base;
		// TODO Auto-generated method stub
		do {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe a base do Quadrado : ", args);
		base = ler.nextInt();
		
		System.out.printf("informe a altura do Quadrado : ", args);
		altura = ler.nextInt();
		if (base != altura)
		{
			System.out.printf("A base e altura digitados correspondem a area de um Retangulo [ ] \n");
			System.out.printf(" --=    Digite os valores corretos =-- \n\n");
			
			
		}
		else {
		ret= altura*base;
		System.out.printf("\n\n  +++++++++ A Area do Quadrado mede : %d +++++++++",ret);
		break;}
		
		}while( altura != base);
	
			
	}

}