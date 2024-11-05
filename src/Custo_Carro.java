import java.util.Scanner;

public class Custo_Carro {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("digite o custo do carro: ");

		double custofabrica = scanner.nextDouble();
		double porcentagemdistribuidor = 28.0 / 100.0;
		double porcentagemimpostos = 45.0 / 100.0;

		double valordistribuidor = custofabrica * porcentagemdistribuidor;
		double valorimpostos = custofabrica * porcentagemimpostos;
		double custofinal = custofabrica + valordistribuidor + valorimpostos;

		System.out.print("O valor final do carro do consumidor é: " + custofinal);

	}

}
