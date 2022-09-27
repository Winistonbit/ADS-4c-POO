package Entrada_Saida_Processamento;
import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler= new Scanner(System.in);
        double a, vo, tempo, velocidade;
        System.out.printf("Digite a velocidade de aceleração do veículo : ");
        a = ler.nextDouble();
        System.out.printf("Digite a velocidade inicial do veículo : ");
        vo = ler.nextDouble();
        System.out.printf("Digite o tempo do percurso : ");
        tempo = ler.nextDouble();
        velocidade = vo+a*tempo;
        if (velocidade >= 120)
        {
        	System.out.printf("\nVeiculo Muito Rapido -=====++@_@]º");
        }
        else
        {
        	if (velocidade > 80)
        	{
        		System.out.printf("\nVeiculo Rapido -===+@_@]");
        	}
        	else
        	{
        		if (velocidade > 60)
        		{
        			System.out.printf("\n Veiculo em velocidade de Cruzeiro  --==@-@]");
        		}
        		else
        		{
        			if (velocidade > 40)
        			{
        				System.out.printf("\n Velocidade Permitida -=@_@]");
        			}
        			else
        			{
        				System.out.printf("Velocidade muito lenta -@_@");
        			}
        		}
        	}
        }
	}

}
