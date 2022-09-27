package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler= new Scanner(System.in);
        int a,soma;
        System.out.printf("Digite um valor : ");
        a=ler.nextInt();
        if (a%2 == 0 ) // numero é par
        {
        	soma=a+5;
        	System.out.printf(" O numero é par, e seu total somado a 5 é de : %d", soma);
        }
        else // numero nao e par
        {
        	soma=a+8;
        	System.out.printf(" O numero é impar, e seu total somado a 8 é de : %d", soma);
        }
        
	}

}
