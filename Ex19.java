package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner(System.in);
     double p1, p2, media;
     System.out.printf("Digite a nota da P1 : ");
     p1 = ler.nextDouble();
     System.out.printf("Digite a nota da P2 : ");
     p2 = ler.nextDouble();
     media = (p1+2*p2)/3;
     if (media >= 5)
     {
    	System.out.printf("Sua média é : %.1f , você esta APROVADO!", media); 
     }
     else
     {
    	 System.out.printf(" Sua média é : %.1f , Voce está REPROVADO!", media);
     }
    
     
	}

}
