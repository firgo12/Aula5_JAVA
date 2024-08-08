import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista4_Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int idade = 0, contador = 0, tot1 = 0, tot2 = 0, tot3 = 0, tot4 = 0, tot5 = 0;

		do {
			contador++;

			System.out.println("Digite a idade: ");
			idade = entrada.nextInt();

			if (idade <= 15) {
				tot1 = tot1 + 1;
			} else {
				if (idade >= 16 && idade <= 30) {
					tot2 = tot2 + 1;
				} else {
					if (idade >= 31 && idade <= 45) {
						tot3 = tot3 + 1;
					} else {
						if (idade >= 46 && idade <= 60) {
							tot4 = tot4 + 1;
						} else {
							tot5 = tot5 + 1;
						}
					}
				}
			}

		} while (contador < 20);// fim - do

		System.out.println("1 - Faixa Etária: " + tot1);
		System.out.println("2 - Faixa Etária: " + tot2);
		System.out.println("3 - Faixa Etária: " + tot3);
		System.out.println("4 - Faixa Etária: " + tot4);
		System.out.println("5 - Faixa Etária: " + tot5);

	}

}
