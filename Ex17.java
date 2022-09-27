package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso, altura, imc;
      Scanner ler= new Scanner(System.in);
      System.out.printf("Digite o seu Peso : ");
      int ret;
      peso = ler.nextDouble();
      do {
      System.out.printf("Digite ( 1 ) para o sexo masculino ou ( 2 ) para o sexo Feminino : ");
      ret = ler.nextInt();

      if (ret < 1 || ret > 2 )
      {
    	  System.out.printf("\n  Valor incorreto - informe novos valores\n");
      }
      } while (ret < 1 || ret > 2 );
      
      System.out.printf(" Digite sua altura : ");
      altura = ler.nextDouble();
      imc=peso/(altura*altura);
      
      if (ret == 1)
      {
    	 if (imc>=25)
    	 { System.out.printf(" Você esta ACIMA do peso! "); 
    		 
    	 }else
    	 {
    		 if (imc>=20)
    		 {
    			System.out.printf("Você está no PESO IDEAL!");
    		 }
    		 else {
				System.out.printf("Você está ABAIXO do peso");
			}
    	 }
    	 
    	 
    	 
    	 
      }
      else
      {
    	  if (imc>=24)
     	 { System.out.printf(" Você esta ACIMA do peso!"); 
     		 
     	 }else
     	 {
     		 if (imc>=19)
     		 {
     			System.out.printf("Você está no PESO IDEAL!");
     		 }
     		 else {
 				System.out.printf("Você está ABAIXO do peso!");
 			}
     	 }
      }
	}

}
