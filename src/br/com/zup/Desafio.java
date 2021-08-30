package br.com.zup;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja informar: ");
        double qtdNumeros = leitor.nextDouble();

        System.out.print("Digite o 1° número: ");
        double resposta = leitor.nextDouble();

        double numeroMenor = resposta;
        double numeroMaior = resposta;
        double soma = resposta;

        int contador = 2;
        while (contador <= qtdNumeros) {
            System.out.printf("Digite o %d° número: ", contador);
            resposta = leitor.nextDouble();

            if (numeroMenor > resposta){
                numeroMenor = resposta;
            }

            if (numeroMaior < resposta){
                numeroMaior = resposta;
            }

            soma += resposta;

            contador++;
        }
        System.out.printf("\nO menor número digitado foi: %.2f\n", numeroMenor);
        System.out.printf("O maior número digitado foi: %.2f\n", numeroMaior);
        System.out.printf("A soma entre todos os números informados foi: %.2f\n", soma);
    }
}
