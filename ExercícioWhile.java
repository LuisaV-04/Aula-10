package projetos_LPA.aula10;

import java.util.Scanner;

public class ExercícioWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		long fat = 1;
		long i = 1;
		
		System.out.print("Informe o fatorial: ");
		long n = ler.nextInt();
		
		while(i <= n) {
			fat = fat * i;
			i++;
			
		}
		
		System.out.println("O fatorial é: " + fat);
		
		ler.close();
		
		}
	}


		
