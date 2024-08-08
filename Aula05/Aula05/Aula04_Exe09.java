package repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula04_Exe09 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat formataMoeda = new DecimalFormat ("R$ ##0.00");
		
		
		double precoCar = 0, total = 0;
		int percentual= 0;
		
		
		System.out.println("Digite o preço do carro: ");
		precoCar=entrada.nextDouble();
		
		System.out.println("Preço final com desconto 20% a vista: "+precoCar*0.8);
		
		percentual=3;
		
		for (int i = 6; i < 66;i += 6) {
			
			//Conta Total
			total = precoCar + (precoCar * percentual/100);
			
			System.out.println("O preço final parcelado em "+i+
					" X é de "+formataMoeda.format(total) + 
					" com parcelas de "+formataMoeda.format(total/i));
			//incrementa o percentual
			percentual += 3;
			
		}
		
	}

}
