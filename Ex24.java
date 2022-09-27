package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in);
        String nome, sexofm = null, estadofm = null ;
        int estado, sexo, tempo = 0 ;
        
        System.out.printf(" Digite seu nome : ");
        nome = ler.next();
        do {
        System.out.printf("\n Selecione o Sexo : (1)- Feminino  e (2)- Masculino ");
        sexo = ler.nextInt();
        if (sexo < 1 || sexo > 2)
        {
        	System.out.printf("Valor Invalido - Digite o valor Correto");
        }
        }while(sexo < 1  || sexo > 2);
        
        do {
            System.out.printf("\n Selecione o Sexo : (1)- Casado  e (2)- Solteiro : ");
            estado = ler.nextInt();
            if (estado < 1 || estado > 2)
            {
            	System.out.printf("Valor Invalido - Digite o valor Correto");
            }
            else
            {  if (estado == 1 )
            {
            	System.out.printf("   Digite o tempo de casado :");
            	tempo = ler.nextInt();
            	if ( sexo == 1)
            	{
            		sexofm="FEMININO";
            	}
            	else
            	{
            		sexofm="MASCULINO";
            	}
            	if (estado == 1)
            	{
            		estadofm="CASADO";
            		System.out.printf("\n Seu nome : %s  , sexo : %s , estado Civil : %s e tempo de casado : %d: ", nome, sexofm, estadofm, tempo );
            	}
            	else
            	{
            		estadofm= "SOLTEIRO";
            		System.out.printf("\n Seu nome : %s  , sexo : %s, estado Civil : %s", nome, sexofm, estadofm);
            	}
            		
            }
            else
            {
            	if ( sexo == 1)
            	{
            		sexofm="FEMININO";
            	}
            	else
            	{
            		sexofm="MASCULINO";
            	}
            	if (estado == 1)
            	{
            		estadofm="CASADO";
            		System.out.printf("\n Seu nome : %s  , sexo : %s , estado Civil : %s e tempo de casado : %d: ", nome, sexofm, estadofm, tempo );
            	}
            	else
            	{
            		estadofm= "SOLTEIRO";
            		System.out.printf("\n Seu nome : %s  , sexo : %s, estado Civil : %s", nome, sexofm, estadofm);
            	}
            }
  
            }
            
            }while(estado < 1  || estado > 2);
        
	}

}
