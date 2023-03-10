package desafio2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Solucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			final int[] notas = {100, 50, 20, 10, 5, 2};
			final double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
			
			System.out.print("Digite o valor a ser retirado do caixa: ");
			double valorRetirado = sc.nextDouble();
			while (valorRetirado < 0 || valorRetirado > 1000000.00) {
				System.out.print("Digite um valor maior que R$0 e menor que R$1.000.000: ");
				valorRetirado = sc.nextDouble();
			}
			
			System.out.println("NOTAS: ");
			for (int nota : notas) {
				int qtdNotas = contaDinheiro(valorRetirado, nota);
				System.out.println(String.format("%d   nota(s)   de   R$   %d.00", qtdNotas, nota));
				valorRetirado -= qtdNotas * nota;
			}
			
			System.out.println("MOEDAS: ");
			for (double moeda : moedas) {
				int qtdMoedas = contaDinheiro(valorRetirado, moeda);
				System.out.println(String.format("%d   moeda(s)   de   R$   %.2f", qtdMoedas, moeda));
				valorRetirado -= qtdMoedas * moeda;
			}
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("ERRO: VOCÊ DEVE DIGITAR UM NÚMERO INTEIRO E POSITIVO. REINICIE A APLICAÇÃO.");
		}
	}
	public static int contaDinheiro(double valorRetirado, double valor) {
		int qtdNotasMoedas = 0;
		while (valorRetirado >= valor) {
			qtdNotasMoedas += 1;
			valorRetirado -= valor;
		}
		return qtdNotasMoedas;
	}
}