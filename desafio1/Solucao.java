package desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Solucao {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Quantos números você quer digitar? ");
    	int qtdNumeros = sc.nextInt();
    	while (qtdNumeros > 10 || qtdNumeros < 1) {
    		System.out.print("ERRO: Digite um número entre 1 e 10: ");
    		qtdNumeros = sc.nextInt();
    	}

    	List<Integer> lista = new ArrayList<>();
    	
    	try {
    		for (int i=0; i<qtdNumeros; i++) {
        		System.out.print("Número #" + (i+1) + ": ");
        		int numero = sc.nextInt();
        		while (numero < 0) {
        			System.out.print("ERRO: O número não pode ser negativo. Digite novamente: ");
        			numero = sc.nextInt();
        		}
        		lista.add(numero);
        	}
    	} catch (InputMismatchException e) {
    		System.out.println("ERRO: O NÚMERO DEVE SER INTEIRO E POSITIVO. REINICIE A APLICAÇÃO.");
    	}
    	
    	List<Integer> listaPar = new ArrayList<>();
    	for (int j=0; j<lista.size(); j++) {
    		if (lista.get(j) % 2 == 0) {
    			listaPar.add(lista.get(j));
    		}
    	}
    	Collections.sort(listaPar);
    	
    	List<Integer> listaImpar = new ArrayList<>();
    	for (int k=0; k<lista.size(); k++) {
    		if (lista.get(k) % 2 != 0) {
    			listaImpar.add(lista.get(k));
    		}
    	}
    	Collections.sort(listaImpar);
    	Collections.reverse(listaImpar);
    	
    	lista.clear();
    	
    	lista.addAll(listaPar);
    	lista.addAll(listaImpar);
    	
    	System.out.println();
    	for (Integer numero : lista) {
    		System.out.println(numero);
    	}
    	
    	sc.close();
    }
}