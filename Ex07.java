package Entrada_Saida_Processamento;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler= new Scanner(System.in);
        int cont;
        double valor;
        valor=0;
        cont=0;
		do {
			cont++;
			System.out.printf("Digite o valor do %d Produto: ",cont);
			valor = valor + ler.nextDouble();
		   } while( cont < 5);
		
		System.out.printf("\nprocessando suas compras ..");

		System.out.printf("\n\nprocessando suas compras ....");
		
		System.out.printf("\nO total dos produtos é de R$ : %.2f",valor);
		}
		}
