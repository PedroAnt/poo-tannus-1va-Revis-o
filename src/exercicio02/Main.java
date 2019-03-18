package exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String x[] = {"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10"};
        Pessoa pessoa = new Pessoa("Fabiano", 21, "M", x);
        boolean exec = true;
        while (exec){
            System.out.println("1 - Visualizar elemento desejado de X");
            System.out.println("2 - Visualizar todos elementos de X");
            System.out.println("3 - Sair");
            int opcoes = ler.nextInt();
            switch (opcoes) {
                case 3:
                    exec = false;
                    break;
                case 1:
                    System.out.print("Digite a posição dos elementos de 1 a 10: ");
                    int el = ler.nextInt();
                    if (el > 10 || el < 1) {
                        System.out.println("Elemento inválido!");
                    } else {
                        pessoa.showElementxs();// Essa linha não funciona corretamente
                    }
                    break;
                case 2:
                    pessoa.showElementxs();
                    break;
                default:
                    System.out.println("Inválido");
                    break;
            }
        }

    }


}
