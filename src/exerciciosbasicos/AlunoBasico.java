package exerciciosbasicos;

import java.util.Scanner;

public class AlunoBasico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua nota1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite sua nota2: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite sua nota3: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);

        if (media >= 7){
            System.out.println("Voce foi Aprovado!!");
        } else if (media >= 5) {
            System.out.println("Voce esta de Recuperação!!");
        } else {
            System.out.println("Voce foi Reprovado!!");
        }

        scanner.close();

    }

}
