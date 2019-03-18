package exercicio05;

import java.util.Scanner;

public class UsaGPS {

    public void main(Scanner ler) {
        boolean exec = true;
        GPS gps;
        System.out.println("Iniciar o GPS com idioma e rota pré-definidos?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        if (ler.nextInt() == 1) {
            System.out.print("Digite o idioma desejado: ");
            String idioma = ler.next();
            System.out.print("Digite a rota desejada: ");
            String rota = ler.next();
            gps = new GPS(idioma, rota);
        } else {
            gps = new GPS();
        }
        while (exec) {
            System.out.println("1 - Para definir o idioma do GPS");
            System.out.println("2 - Para definir a rota do GPS");
            System.out.println("3 - Para mostrar as informações do GPS");
            System.out.println("4 - Para sair");
            switch (ler.nextInt()) {
                case 1:
                    System.out.print("1 - Digite o novo idioma: ");
                    gps.setIdioma(ler.next());
                    break;
                case 2:
                    System.out.print("1 - Digite a nova rota: ");
                    gps.setRota(ler.next());
                    break;
                case 3:
                    gps.mostrar();
                    break;
                case 4:
                    exec = false;
                    break;
            }
        }
    }
}
