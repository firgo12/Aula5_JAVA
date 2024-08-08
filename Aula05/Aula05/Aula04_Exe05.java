package repeticao;

import java.util.Scanner;

public class Aula04_Exe05 {
	
	public static void main(String[] args) { 
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0, i = 0, maior = 0, menor = 0;
		
		System.out.println("Digite o número: ");
		num = entrada.nextInt();
		
		menor = num;
		
		
		while (i < 9) {
			System.out.println("Digite o número: ");
			num = entrada.nextInt();
			
			if (num > maior) {
				maior = num;
			}  else {
				if (num < menor) {
					menor = num;
				}
			}
			
			i++;
			
		}//fim while
		
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);
		
		
	}

}
