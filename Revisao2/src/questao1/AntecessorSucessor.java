package questao1;

import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int n = scan.nextInt();

		System.out.println("O antecessor do n�mero digitado �: " + (n - 1));
		System.out.println("O Sucessor do n�mero digitado �: " + (n + 1));

		scan.close();
	}

}
