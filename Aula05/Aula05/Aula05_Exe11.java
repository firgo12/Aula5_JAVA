package repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula05_Exe11 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formataMoeda = new DecimalFormat ("R$ ##0.00");
		
		int qtdParcelas = 0;
		double divida = 0, valorJuros = 0, valorParcela =0;
		
		System.out.println("Informe o valor da dívida: ");
		divida = entrada.nextDouble();
		
		System.out.println("Valor da dívida: "+ divida);
		System.out.println("Valor dos juros: 0");
		System.out.println("Quantidade de parcelas: 1");
		System.out.println("Valor da Parcela: "+ divida);
		
		
		for (int i = 3; i < 13; i+=3) {
			switch (i) {
			case 3:
				System.out.println("Valor da dívida: "+ formataMoeda.format(divida * 1.10));
				System.out.println("Valor dos juros: "+ formataMoeda.format(divida * 0.10));
				System.out.println("Quantidade de parcelas: "+ i);
				System.out.println("Valor da Parcela: "+ formataMoeda.format((divida * 1.10)/i));
			break;
			case 6:
				System.out.println("Valor da dívida: "+ formataMoeda.format(divida * 1.15));
				System.out.println("Valor dos juros: "+ formataMoeda.format(divida * 0.15));
				System.out.println("Quantidade de parcelas: "+ i);
				System.out.println("Valor da Parcela: "+ formataMoeda.format((divida * 1.15)/i));
			break;
			case 9:
				System.out.println("Valor da dívida: "+ formataMoeda.format(divida * 1.20));
				System.out.println("Valor dos juros: "+ formataMoeda.format(divida * 0.20));
				System.out.println("Quantidade de parcelas: "+ i);
				System.out.println("Valor da Parcela: "+ formataMoeda.format((divida * 1.20)/i));
			break;
			case 12:
				System.out.println("Valor da dívida: "+ formataMoeda.format(divida * 1.25));
				System.out.println("Valor dos juros: "+ formataMoeda.format(divida * 0.25));
				System.out.println("Quantidade de parcelas: "+ i);
				System.out.println("Valor da Parcela: "+ formataMoeda.format((divida * 1.25)/i));
			break;
			}
		
			
		}
	}
}
