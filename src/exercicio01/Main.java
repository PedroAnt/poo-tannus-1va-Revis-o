package exercicio01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o nome do aluno: ");
        String nome = scanner.next();
        System.out.printf("Digite a nota do aluno: ");
        float notas[] = {0, 0, 0, 0};
        int idade = scanner.nextInt();
        System.out.printf("Digite idade do aluno: ");
        String sala = scanner.next();
        for (int i = 0; i < 4 ; i++) {
            System.out.println("Digite a nota do aluno");
            float nota = scanner.nextFloat();
            notas[i] = nota;
        }
        AlunoControle aluno = new AlunoControle(nome, idade, sala, notas);
        System.out.println("Media: " + aluno.media());
    }

}
