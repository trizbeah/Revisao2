package questao1;

import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n = scan.nextInt();

		System.out.println("O antecessor do número digitado é: " + (n - 1));
		System.out.println("O Sucessor do número digitado é: " + (n + 1));

		scan.close();
	}

}
