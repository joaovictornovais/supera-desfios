package desafio4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Solucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> frases = new ArrayList<>();
		try {
			System.out.print("Quantas frases você deseja desinfectar? ");
			int qtdFrases = sc.nextInt();
			sc.nextLine();
			
			for (int i=0; i<qtdFrases; i++) {
				System.out.print(i+1 + ": ");
				String frase = sc.nextLine().toUpperCase();
				while (frase.length() < 2 || frase.length() > 100) {
					System.out.println("ERRO: Digite uma frase com no minimo 2 caracteres e no máximo 100: ");
					frase = sc.nextLine().toUpperCase();
				}
				frases.add(frase);
			}
			
			for (String frase : frases)  {
				int tamanhoFrase = frase.length();
				String fraseCortada1 = frase.substring(0, tamanhoFrase / 2);
				String fraseCortada2 = frase.substring(tamanhoFrase / 2, frase.length());
				
				System.out.print(new StringBuilder(fraseCortada1).reverse().toString());
				System.out.println(new StringBuilder(fraseCortada2).reverse().toString());
			}
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("ERRO: VOCÊ DEVE DIGITAR UM NÚMERO INTEIRO E POSITIVO. REINICIE A APLICAÇÃO.");
		}
	}
	
}
