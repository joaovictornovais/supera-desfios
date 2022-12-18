package desafio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solucao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		
		System.out.print("Digite o tamanho do array: ");
		int tamanhoLista = sc.nextInt();
		System.out.print("Digite o valor alvo: ");
		int valorAlvo = sc.nextInt();
		
		for (int i=0; i<tamanhoLista; i++) {
			System.out.print("Número #" + (i+1) + " do ARRAY: ");
			int numero = sc.nextInt();
			while (numero < 0) {
				System.out.print("ERRO: O número deve ser inteiro e positivo. Digite novamente: ");
				numero = sc.nextInt();
			}
			lista.add(numero);
		}
		
		int pares = 0;
		
		for (int i=0; i<lista.size(); i++) {
			if ((i+1) < lista.size()) {
				for (Integer numero : lista) {
					int calculoTemporario = lista.get(i+1) - numero;
					if (calculoTemporario == valorAlvo) {
						pares += 1;
					}
				}
			}
		}
		
		System.out.println(pares);
		
		
		
		sc.close();
		
		
	}
	
}
