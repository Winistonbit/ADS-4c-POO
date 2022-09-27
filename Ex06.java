package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Scanner ler= new Scanner(System.in);
               double valor,qt, valorReal;
               System.out.printf("Digite a cotação atual do $ Dolar : ");
               valor = ler.nextDouble();
               System.out.printf("\nDigite a quantidade de dólares que possui : ", args);
               qt = ler.nextDouble();
               valorReal = qt*valor;
               System.out.printf("O valor da conversao em reais é de R$ : %.2f",valorReal);

		
		
	}

}
