package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double base, altura, ret;
		do {
		 Scanner ler = new Scanner(System.in);
		 System.out.printf("Digite a base do Triangulo : \n", args);
		 base= ler.nextDouble();
		 System.out.printf("Digite a altura do Triangulo : ", args);
		 altura=ler.nextDouble();
		if ( base == altura )
		   {System.out.printf("Os valores informados não pertencem a um triangulo\n", args);
		   System.out.printf(" -== Digite os Valores Novamente ==-\n\n", args);
		   }
		else
		  {   ret = (base*altura)/2;
			System.out.printf(" A Area do Triangulo é : %.2f ",ret);
		  }
		 }while(base == altura);
		

	}

}
