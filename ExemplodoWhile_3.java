package projetos_LPA.aula10;

import java.util.Scanner;

public class ExemplodoWhile_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		do {
			System.out.print("Digite um número: ");
			numero = ler.nextInt();
		}while (numero != 0);
		
		System.out.println("Você digitou: " + numero + " para terminar");
		ler.close();
		
	}

}
