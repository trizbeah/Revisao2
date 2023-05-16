package questao3;

import java.util.Scanner;

public class ValorMinMax {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Diginte o valor mínimo: ");
		int valorMin = scan.nextInt();

		System.out.println("Digite o valor máximo");
		int valorMax = scan.nextInt();

		int[] num = { 4, 5, 9, 3, 90, 60, 53, 23, 7, 2 };

		for (int i = valorMin; i <= valorMax; i++) {
			System.out.println((num[i]));
		}

		scan.close();
	}

}
