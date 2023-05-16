package questao2;

import java.util.Scanner;

public class CalcularSalario {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do seu salário: ");
		double salUsuario = scan.nextInt();

		double salMinimo = 1320.0;

		double qntSalMin = salUsuario / salMinimo;

		System.out.println("O usuário tem " + qntSalMin + " salários mínimos no seu salário total.");

		scan.close();

	}

}
