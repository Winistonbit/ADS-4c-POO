package Entrada_Saida_Processamento;
import java.util.Scanner;

import javax.accessibility.AccessibleRelation;
public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner ler = new Scanner(System.in);
     double p1, p2, media, nota, resultado;
     media = 0;
     nota = 0;
     resultado = 0;
     System.out.printf("Digite a nota da P1 : ");
     p1 = ler.nextDouble();
     
    // resultado = p1-5;
     media = (p1+2*nota)/3;
     nota = ((5-media)/2)*3;     
     System.out.printf("sua média é : %.2f  , voce precisa tirar  %.2f  para ser aprovado!", media, nota);
    resultado = (p1+2*nota)/3;
    System.out.printf("\nMedia a alcançar segundo a formula (p1+2*nota)/3 :%.2f   ", resultado);
     
	}

}
