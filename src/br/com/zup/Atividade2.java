package br.com.zup;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja consultar: ");
        double qtdNumeros = leitor.nextDouble();

        double resposta;
        int numerosImpares = 0;


        int contador = 1;
        while (contador <= qtdNumeros){
            System.out.printf("Digite o %d° número: ", contador);
            resposta = leitor.nextDouble();

            if (resposta % 2 != 0) {
                numerosImpares++;
            }

            contador++;
        }
        System.out.printf("Você digitou %d números ímpares!", numerosImpares);
    }
}