package exercicio04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        SimulaBombaDagua bomba = new SimulaBombaDagua();
        boolean exec = true;
        while (exec) {
            System.out.println("1 - Ligar bomba");
            System.out.println("2 - Sair");
            int opcao = ler.nextInt();
            switch (opcao){
                case 1:
                    System.out.print("Digite o tempo para a bomba ficar ligada em segundos:");
                    int second = ler.nextInt();
                    bomba.ligar(second);
                    break;
                case 2:
                    exec = false;
                    break;
                default:
                    System.out.println("Inválido");
                    break;
            }
        }
    }
}
