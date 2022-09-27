package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso, altura, imc;
         Scanner ler= new Scanner(System.in);
		System.out.printf("Digite o seu Peso : ");
		peso=ler.nextDouble();
		System.out.printf("Digite sua altura : ");
		altura=ler.nextDouble();
		imc = peso/(altura*2);
		System.out.printf(" Seu  IMC é : %.1f \n", imc);
		if (imc >= 40)
		{
		System.out.printf("Você esta com obesidade grau 4");	
		}else
		{
		if(imc >= 35)
		{
			System.out.printf("Você esta com obesidade grau 3");
		}else
		{
		if (imc >= 30)
		{
			System.out.printf("Você esta com obesidade grau 2");
		}else
		{
		if (imc >= 25)
		{
			System.out.printf("Você esta com sobrepeso");
		}else
		{
		if (imc >= 18.5)
		{
			System.out.printf("Você esta com o peso normal");		
    	}
		else
		{
		   System.out.printf("Você está abaixo do peso");	
		}
		}	
		}
		}
		}
	}
		}


