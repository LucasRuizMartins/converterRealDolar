package aplicacao;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao = 0;

		System.out.println("Escolha uma opção:");
		System.out.println("1 - Conversao de Real para Dolar");
		System.out.println("2 - Conversao de Dolar para Real");
		System.out.println("3 - SAIR");
		opcao = sc.nextInt();

		while (opcao != 3) {

			double real = 0;
			double dolar = 0;
			double valorDolar = 5.36;

			if (opcao == 1) {
				System.out.println("Digite o valor em R$ :");
				real = sc.nextDouble();
				dolar = real / valorDolar;
				System.out.print("valor convertido US$ : ");
				System.out.printf("%.2f", dolar);
				System.out.println();
				System.out.println("Escolha uma opção:");
				System.out.println("1 - Conversao de Real para Dolar");
				System.out.println("2 - Conversao de Dolar para Real");
				System.out.println("3 - SAIR");
				opcao = sc.nextInt();

			}
			if (opcao == 2) {
				System.out.println("Digite o valor em US$:");
				dolar = sc.nextDouble();
				real = dolar * valorDolar;
				System.out.print("valor convertido R$ :");
				System.out.printf("%.2f", real);
				System.out.println();

				System.out.println("Escolha uma opção:");
				System.out.println("1 - Conversao de Real para Dolar");
				System.out.println("2 - Conversao de Dolar para Real");
				System.out.println("3 - SAIR");
				opcao = sc.nextInt();
			} else {

				System.out.println("Escolha uma opção válida:");
				System.out.println("1 - Conversao de Real para Dolar");
				System.out.println("2 - Conversao de Dolar para Real");
				System.out.println("3 - SAIR");
				opcao = sc.nextInt();
			}

		}

		sc.close();
		System.out.println("Encerrando programa...");
	}

}
