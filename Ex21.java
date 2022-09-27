package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner ler = new Scanner(System.in);
     int valor1, valor2, resultado, opcao=0 ;
     System.out.printf("Digite um valor : ");
     valor1 = ler.nextInt();
     System.out.printf("Digite o segundo valor : ");
     valor2 = ler.nextInt();

    
    do {
    	  do {
              System.out.printf("\n -== MENU DE OPCOES ==-");
              System.out.printf("\n   ( 1 ) - Multiplicacao");
              System.out.printf("\n   ( 2 ) - Adicao");
              System.out.printf("\n   ( 3 ) - Divisao");
              System.out.printf("\n   ( 4 ) - Subtracao");
              System.out.printf("\n   ( 5 ) - Sair");
              System.out.printf("\n Digite uma das opcoes : ");
              opcao = ler.nextInt();
              
             if (opcao < 1 || opcao > 5)
                   {
             	  System.out.printf("OPCAO INVALIDA, DIGITE NOVAMENTE");
             	  }
           	  
               }while (opcao < 1 || opcao > 5);
    	
     switch (opcao) {
     case 1:
         resultado = valor1 * valor2;
         System.out.printf("\nO resultado da multiplicacao é : %d", resultado);
         break;
         
     case 2:
         resultado = valor1 + valor2;
         System.out.printf("O resultado final é: %d ", resultado);
         break;
         
     case 3:
         if (valor1 != '0' || valor2 != '0') {
             resultado = valor1 / valor2;
             System.out.printf("O resultado final é: %d", resultado);
            
         } else {
             System.out.printf("\nNão e possível dividir por zero!");
            
         };
        break;
         
     case 4:
         resultado = valor1 - valor2;
         System.out.printf("O resultado final é: %d", resultado);
         break;
        
         
     case 5:
    	  System.out.printf(" Finalizando Processo .... \n\n");
	         System.out.printf(" Finalizando Processo ....... \n\n");
	         System.out.printf(" Finalizando Processo ............ \n\n");
	         System.out.printf(" Finalizando Processo ................\n\n");
	         System.out.printf(" Finalizando Processo ...................... \n\n");
	         System.out.printf(" ................ FINALIZADO .................. \n\n");
	         break;
	     
     
       
    	 
        
 }
    }while( opcao != 5);
	}

}
