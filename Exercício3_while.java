package projetos_LPA.aula10;

import java.util.Scanner;

public class Exercício3_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double media = 0, soma = 0, num;
		int i = 1;
		
		while(i <= 5) {
			System.out.print("Informe o " + i + "º número: ");
			num = ler.nextDouble();
			soma = soma + num;
			i++;
		}
		
		media = soma/5;
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);
		ler.close();
	}

}