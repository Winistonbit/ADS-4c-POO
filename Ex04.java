package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] valor= new int[4];
		
		Scanner ler = new Scanner(System.in);  
		int ret, valor, cont;
		valor = 0;
		cont = 0;
		do{
		cont ++;	
		System.out.printf("Digite o %d ° valor para calculo da media :", cont);
		ret = ler.nextInt();
		valor = valor+ret;
		
		
		}while(cont < 4);
		valor=valor/cont;
		System.out.printf("\nA média Aritimética dos Valores é : %d", valor);
		
		
		
		
		
	}

}
