package br.com.zup;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja consultar: ");
        double qtdNumeros = leitor.nextDouble();

        double resposta;
        int numerosPares =0;
        int numerosImpares = 0;


        int contador = 1;
        while (contador <= qtdNumeros){
            System.out.printf("Digite o %d° número: ", contador);
            resposta = leitor.nextDouble();

            if (resposta % 2 == 0) {
                numerosPares++;
            }

            if (resposta % 2 != 0) {
                numerosImpares++;
            }

            contador++;
        }
        System.out.printf("Você digitou %d números pares e %d números ímpares!", numerosPares, numerosImpares);
    }
}