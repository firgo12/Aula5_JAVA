package repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula04_Exe10 {

public static void main(String[] args) { 
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formataMoeda = new DecimalFormat ("R$ ##0.00");
		int i =0, cp = 0;
		double pe=0, total=0;
		String resp="sim";
		
		//strutura de repetição das vendas
		while (resp.equalsIgnoreCase("sim")) {
			i++;
			System.out.println(i+"º Venda");
			
			//intens da VENDA
			System.out.println("Digite o preço da etiqueta: ");
			pe=entrada.nextDouble();
			
			//Resetando o total!!
			total=0;
			
			while(pe !=0) {
				total += pe;
				
				System.out.println("Digite o preço da etiqueta: ");
				pe=entrada.nextDouble();
			}//fim while
			System.out.println("Total: "+total);
			
			System.out.println("");
			System.out.println("PAGAMENTO");
			System.out.println("1 - À vista em dinheiro ou cheque, com 10% de desconto");
			System.out.println("2 - À vista com cartão de crédito, com 5% de desconto");
			System.out.println("3 - Em 2 vezes, preço normal de etiqueta sem juros");
			System.out.println("4 -Em 3 vezes, preço de etiqueta com acréscimo de 10%");
			
			System.out.println("Digite a opção: ");
			cp = entrada.nextInt();
			
			while(cp<1 || cp>4) {
				System.out.println("Digite a opção, corretamente: ");
				cp = entrada.nextInt();
			}
			
			switch (cp) {
			case 1:
				total = total * 0.9;
				System.out.println("Com 10% de desconto: "+formataMoeda.format(total));
			break;
			case 2:
				total = total * 0.95;
				System.out.println("Com 5% de desconto: "+formataMoeda.format(total));
			break;
			case 3:
				System.out.println("Em 2X sem juros de: "+formataMoeda.format(total/2));
			break;
			case 4:
				System.out.println("Em 3x com 10% de juros de: "+ formataMoeda.format((total * 1.10)/3));
			break;
			}
			
			
			
			///////////////////////////////////////////////////////
			System.out.println("Deseja continuar sim/não? ");
			resp=entrada.next();
			
			//validação
			
			while(!(resp.equalsIgnoreCase("sim")) && !(resp.equalsIgnoreCase("não"))) {
				System.out.println("Deseja continuar sim/não? ");
				resp=entrada.next();
				
			}
			
		}//while resp
		
		
	}
	
}
