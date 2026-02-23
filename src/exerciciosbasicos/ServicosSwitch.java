package exerciciosbasicos;

import java.util.Scanner;

public class ServicosSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o serviço: ");
        String servico = scanner.nextLine().toLowerCase();

        double valor;

        switch (servico){
            case "corte":
                valor = 40;
                break;

            case "barba":
                valor = 30;
                break;

            case "sobrancelha":
                valor = 15;
                break;

            default:
                System.out.println("Serviço inválido!!");
                scanner.close();
                return;
        }
        System.out.println("Cliente: " + nome);
        System.out.println("Serviço: " + servico);
        System.out.println("Valor: " + valor);
    }

}
