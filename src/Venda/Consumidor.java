/* 2) O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do
distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do
distribuidor seja de 28% e os impostos de 45%, escreva um algoritmo que leia o custo de f�brica
de um carro e escreva o custo ao consumidor. */

package Venda;

import Carro.Imposto;

import java.util.Scanner;

public class Consumidor {
	
	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		
		System.out.print("Quantos custous para montar este carro? = ");

		Imposto imposto = new Imposto(entrada.nextDouble());
		
		System.out.println("\nEste carro custara para o consumidor = " + imposto.getCustodefabrica());

	}

}
