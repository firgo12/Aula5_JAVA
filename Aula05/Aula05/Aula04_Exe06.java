package repeticao;

import java.util.Scanner;

public class Aula04_Exe06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numCri = 0, meses = 0;
		String sexo;
		double totalMasc = 0, totalFem = 0, total24 = 0, percMasc = 0, percFem = 0, perc24 = 0;

		System.out.println("Digite o n�mero de crian�as: ");
		numCri = entrada.nextInt();

		for (int cont = 1; cont <= numCri; cont++) {
			System.out.println("Digite o sexo da" + cont + " crian�a: ");
			sexo = entrada.next();

			while (!(sexo.equalsIgnoreCase("f")) && !(sexo.equalsIgnoreCase("m"))) {
				System.out.println("Digite o sexo da" + cont + " crian�a: ");
				sexo = entrada.next();
			}

			System.out.println("Digite o tempo de vida (em meses) da " + cont + "  crian�a: ");
			meses = entrada.nextInt();
			
			if (sexo.equalsIgnoreCase("m")) {
				totalMasc++;
			}else {
				totalFem++;
			}
			
			if(meses<24) {
				total24++;
			}
		}
		
		percMasc=(double)(totalMasc*100)/numCri;
		percFem=(double)(totalFem*100)/numCri;
		perc24=(double)(total24*100)/numCri;
		
		System.out.println("Percentual de crian�as do sexo feminino mortas: "+percFem);
		System.out.println("Percentual de crian�as do sexo masculino mortas: "+percMasc);
		System.out.println("Percentual de crian�as com 24 meses ou menos mortas no per�odo: "+ perc24);
		
		entrada.close();
		
	}

}
