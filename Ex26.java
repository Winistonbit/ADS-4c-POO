package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, soma;
      Scanner ler = new Scanner(System.in);
      System.out.printf("Digite um valor : ");
      a = ler.nextInt();
      if (a > 0)
      { 
    	soma = a*2;
    	System.out.printf("O valor e Positivo, o dobro do valor e : %d", soma);
      }
      else
      {
    	  soma = a*3;
      	System.out.printf("O valor e negativo, o triplo do valor e : %d", soma);
      }
		
		
	}

}
