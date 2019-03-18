package exercicio06;

import java.util.Scanner;

public class Central {

    private Controlador controlador = new Controlador(000);
    public void menu(Scanner ler) {
        boolean exec = true;
        while (exec) {
            if (controlador.isAtivo()) {
                System.out.println("1 - Para desligar sistema");
                System.out.println("2 - Para verificar sensores");
                System.out.println("3 - Para Ligar sensor");
                System.out.println("4 - Para desligar sensor");
                System.out.println("5 - Para testar sensor");
            } else {
                System.out.println("1 - Ligar sistema");
            }
            System.out.println("6 - Para sair");
            int opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o código de segurança:");
                    if (controlador.verificarCodigo(ler.nextInt())){
                        if (controlador.isAlarmeAtivado())
                            controlador.desativarAlarmes();
                        else
                            controlador.ligarSistema();
                    }
                    break;
                case 2:
                    if (controlador.isAtivo())
                        controlador.mostrarStatusSensores();
                    else
                        System.out.println("Opção inválida");
                    break;
                case 3:
                    if (controlador.isAtivo()){
                        controlador.mostrarSensoresDesligados();
                        System.out.print("Digite o código do sensor: ");
                        controlador.ligarSensor(ler.next());
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;
                case 4:
                    if (controlador.isAtivo()){
                        controlador.mostrarSensoresLigados();
                        System.out.print("Digite o código do sensor: ");
                        controlador.desligarSensor(ler.next());
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;
                case 5:
                    if (controlador.isAtivo()){
                        controlador.mostrarSensoresLigados();
                        System.out.print("Digite o código do sensor: ");
                        controlador.testarSensor(ler.next());
                    } else {
                        System.out.println("Opção inválida");
                    }
                    break;
                case 6:
                    exec = false;
                    break;
                default:
                    if (opcao != controlador.getCodSeguranca())
                        System.out.println("Opção inválida");
                    else
                        controlador.desativarAlarmes();
                    break;
            }
        }
    }
}
