package questao2;

import java.util.Scanner;

public class CalcularSalario {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do seu sal�rio: ");
		double salUsuario = scan.nextInt();

		double salMinimo = 1320.0;

		double qntSalMin = salUsuario / salMinimo;

		System.out.println("O usu�rio tem " + qntSalMin + " sal�rios m�nimos no seu sal�rio total.");

		scan.close();

	}

}
