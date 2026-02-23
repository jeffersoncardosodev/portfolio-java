package exerciciosbasicos;

import java.util.Scanner;

public class Desconto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do serviço: ");
        double valor = scanner.nextDouble();

        double valorFinal;

        if (valor < 50){
            valorFinal = valor * 0.9;
            System.out.println("Voce ganhou desconto!");
        } else {
            valorFinal = valor;
            System.out.println("Valor normal!");
        }

        System.out.println("Valor final: " + valorFinal);
        scanner.close();



    }
}
