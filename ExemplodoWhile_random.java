package projetos_LPA.aula10;

import java.util.Random;

public class ExemplodoWhile_random {

	public static void main(String[] args) {
		Random random = new Random();
		int faceDado;
		
		do {
			faceDado = random.nextInt(7);
			System.out.println("Face do dado: " + faceDado);
		}while (faceDado != 6);

	}

}
