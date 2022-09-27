package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int valor1 = 0, valor2 = 0, resultado = 0, opcao = 0;
		do {
	    	  do {
	              System.out.printf("\n -== MENU DE OPCOES ==-");
	              System.out.printf("\n   ( 1 ) - TRIANGULO");
	              System.out.printf("\n   ( 2 ) - QUADRADO");
	              System.out.printf("\n   ( 3 ) - RETANGULO");
	              System.out.printf("\n   ( 4 ) - CIRCULO");
	              System.out.printf("\n   ( 5 ) - Sair - Fim do Processo");
	              System.out.printf("\n Digite uma das opcoes : ");
	              opcao = ler.nextInt();
	              
	             if (opcao < 1 || opcao > 5)
	                   {
	             	  System.out.printf("OPCAO INVALIDA, DIGITE NOVAMENTE");
	             	  }
	           	  
	               }while (opcao < 1 || opcao > 5);
	    	
	     switch (opcao) {
	     case 1:
	    	 System.out.printf(" -= AREA DO TRIANGULO =- ");
	    	 System.out.printf("\nPara o calculo, digite o valor da altura :  ");
	    	 valor1 = ler.nextInt();
	    	 System.out.printf("\nDigite o Valor de sua Base : ");
	    	 valor2 = ler.nextInt();
	         resultado = (valor1*valor2)/2;
	         System.out.printf("\nSua área é de : %d", resultado);
	         break;
	         
	     case 2:
	    	 System.out.printf(" -= AREA DO QUADRADO =- ");
	    	 System.out.printf("\nPara o calculo, digite o valor de um dos lados :  ");
	    	 valor1 = ler.nextInt();
	    	 resultado = valor1*2;
	         System.out.printf("\nSua área é de : %d", resultado);
	         break;
	         
	     case 3:do {
	    	 System.out.printf("\n -= AREA DO RETANGULO =- ");
	    	 System.out.printf("\nPara o calculo, digite o valor da altura :  ");
	    	 valor1 = ler.nextInt();
	    	 System.out.printf("\nDigite o Valor de sua Base : ");
	    	 valor2 = ler.nextInt();
	    	 if(valor1 == valor2)
	    	 {
	    		 System.out.printf("\n Valores Invalidos - Digite os valores Diferentes ");
	    		 System.out.printf("\n Valores iguais correspondem a um QUADRADO []");
	    	 }
	     }while( valor1 == valor2);
	         resultado = (valor1*valor2);
	         System.out.printf("\nA área do Retangulo é de : %d", resultado);
	         break;
	         
	         
	     case 4:
	         resultado = valor1 - valor2;
	         System.out.printf("O resultado final é: %d", resultado);
	         break;
	        
	         
	     case 5:
	         System.out.printf(" Finalizando Processo ....\n\n");
	         System.out.printf(" Finalizando Processo ........\n\n");
	         System.out.printf(" Finalizando Processo .............\n\n");
	         System.out.printf(" Finalizando Processo ..................\n\n");
	         System.out.printf(" Finalizando Processo .................... \n\n");
	         System.out.printf(" ...............  FINALIZADO  ................ \n\n");
	         break; 
	        
	 }
	   }while( opcao != 5);
		}
		
	}


