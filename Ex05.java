package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temp, f;
      Scanner ler = new Scanner(System.in);
      System.out.printf("Digite a temperatura atual em graus C° : ", args);
      temp = ler.nextDouble();
      f = (temp*9/5)+32; 
      System.out.printf("A temperatura atual em graus F° e : %.1f graus!", f);
		
		
	}

}
