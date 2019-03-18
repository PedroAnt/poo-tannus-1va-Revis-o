package exercicio03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite o número da conta: ");
        int numero = ler.nextInt();
        ContaCorrente conta = new ContaCorrente(numero);
        boolean exec = true;
        while (exec) {
            System.out.println("Número da conta: " + conta.getNumero());
            System.out.println("Saldo atual: " + conta.getSaldo());
            System.out.println("Você deseja?");
            System.out.println("1 - Para depositar");
            System.out.println("2 - Para sacar");
            System.out.println("3 - Para sair");
            int op = ler.nextInt();
            switch (op) {
                case 3:
                    exec = false;
                    break;
                case 1:
                    System.out.printf("Digite o valor para deposito: ");
                    double valD = ler.nextDouble();
                    conta.depositar(valD);
                    break;
                case 2:
                    System.out.printf("Digite a quantia para saque: ");
                    double valS = ler.nextDouble();
                    conta.sacar(valS);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
