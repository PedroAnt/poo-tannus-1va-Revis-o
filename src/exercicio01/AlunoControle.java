package exercicio01;

import java.util.List;

public class AlunoControle {

    public String nome;
    public int idade;
    private String sala;
    public float notas[];

    public AlunoControle(String nome, int idade, String sala, float[] notas) {
        this.nome = nome;
        this.idade = idade;
        this.sala = sala;
        this.notas = notas;
    }


    public float media() {
        float resultado = 0;
        for (float nota : this.notas) {
            resultado = resultado + nota;
        }
        return resultado / this.notas.length;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
