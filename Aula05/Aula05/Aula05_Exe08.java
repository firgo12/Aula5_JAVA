package repeticao;

import java.util.Scanner;

public class Aula05_Exe08 {
	
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	int frequencia = 0, numMatricula = 0, aprovado = 0, reprovado = 0;
	double nota, media = 0;
	
	for (int i = 0; i < 10; i++) {
		
			System.out.println("Digite o n�mero de matr�cula: ");
			numMatricula = entrada.nextInt();
			System.out.println("Digite a frequ�ncia do estudante: ");
			frequencia = entrada.nextInt();
			
			media=0;

			for(int cont = 1; cont < 4; cont++) {
				System.out.println("Digite a "+cont+"� nota: ");
				nota = entrada.nextDouble();
				media += nota;
			}
			
			media = media/3;
			
			if(media < 6 || frequencia < 40) {
				reprovado++;
				System.out.println("REPROVADO");
				System.out.println("M�dia: "+media);
			} else {
				aprovado++;
				System.out.println("APROVADO");
				System.out.println("M�dia: "+media);
			}
			
			i++;
		
		}//fim do for
	
	System.out.println("N�mero de alunos reprovados: "+ reprovado);
	System.out.println("N�mero de alunos reprovados: "+ aprovado);
	
	
	
	}

}
