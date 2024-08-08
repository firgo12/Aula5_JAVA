import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		DecimalFormat formataPorc = new DecimalFormat ("#%");
		
		int idade = 0, contador = 0, cont50 =0, contAlt=0, cont40 = 0;
		double altura = 0, peso = 0, somaAlt = 0, porc =0;
		
		//ESTRUTURA DE REPETIÇÃO
		while (contador < 3) {
			contador++;
			
			//carregar variavéis
			System.out.println("Digite a idade: ");
			idade = entrada.nextInt();
			System.out.println("Digite a altuta: ");
			altura = entrada.nextDouble();
			System.out.println("Digite o peso: ");
			peso = entrada.nextDouble();
			
			//a) quant idade > 50 anos
			if(idade > 50) {
				cont50++;
			}
			
			//b)Média das alturas com idade entre 10 e 20 anos!
			if(idade>10 && idade < 20) {
				contAlt++;
				somaAlt =+ altura;
			}
			
			//c) Porcentagem de pessoas peso inferior a 40.
			if(peso < 40) {
				cont40++;
				
			}
			
			
		}//fim - while
		
		porc = (double)cont40/contador;
		System.out.println("Quantidade de pessoas com idade > 50: "+cont50);
		System.out.println("Média das alturas entre 10 e 20: "+somaAlt/contAlt);
		System.out.println("Porcentagem de peso inferior a 40: "+formataPorc.format(porc));

	}//main

}//inicio
