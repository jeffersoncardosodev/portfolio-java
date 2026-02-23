package projetinhospoo.AlunoPOO;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();

        System.out.println("Digite a nota1: ");
        aluno.nota1 = scanner.nextDouble();

        System.out.println("Digite a nota2: ");
        aluno.nota2 = scanner.nextDouble();

        System.out.println("Digite a nota3: ");
        aluno.nota3 = scanner.nextDouble();

        System.out.println("Nome do aluno: " + aluno.nome);
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Situação: " + aluno.verificarSituacao());

        scanner.close();
    }
}