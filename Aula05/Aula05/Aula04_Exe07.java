package repeticao;

import java.util.Scanner;

public class Aula04_Exe07 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int idade = 0, totalIdade =0, i = 0, contA = 0, contB = 0, contC = 0, contD = 0, contE = 0;
		String op;
		
		do {
			
			System.out.println("Digite a sua idade: ");
			idade = entrada.nextInt();
			
			if (idade != 0) {
				System.out.println("Fale a sua opini�o do filme: ");
				op = entrada.next();
				
				if (!(op.equalsIgnoreCase("A")) && !(op.equalsIgnoreCase("B")) && !(op.equalsIgnoreCase("C")) && !(op.equalsIgnoreCase("D")) && !(op.equalsIgnoreCase("E"))) {
					while(!(op.equalsIgnoreCase("A")) && !(op.equalsIgnoreCase("B")) && !(op.equalsIgnoreCase("C")) && !(op.equalsIgnoreCase("D")) && !(op.equalsIgnoreCase("E"))) {
						System.out.println("Fale a sua opini�o do filme, corretamente: ");
						op = entrada.next();
					}
					
				}// fim do segundo if
				
				switch (op) {
				case "A":
					contA++;
				break;
				case "B":
					contB++;
				break;
				case "C":
					contC++;
				break;
				case "D":
					contD++;
				break;
				case "E":
					contE++;
				break;
				default:
					System.out.println("Op��o inv�lida");
					i--;
				}
				
				//M�dia de idade
				totalIdade += idade;
				
				i++;
			}//fim do primeiro if
			
		}while(idade != 0);
		
		System.out.println("Quantidade de respostas: "+i);
		System.out.println("M�dia de idade: " + (double)totalIdade/i);
		System.out.println("Porcentagem da Opini�o A: "+(double)(contA*100)/ i);
		System.out.println("Porcentagem da Opini�o B: "+(double)(contB*100)/ i);
		System.out.println("Porcentagem da Opini�o C: "+(double)(contC*100)/ i);
		System.out.println("Porcentagem da Opini�o D: "+(double)(contD*100)/ i);
		System.out.println("Porcentagem da Opini�o E: "+(double)(contE*100)/ i);
		
	}
}
