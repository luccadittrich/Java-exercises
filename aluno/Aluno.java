// package aluno;
public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private boolean formando;
    private char genero;

    public Aluno(String n, int i, double p, char g, boolean f) {
        nome = n;
        idade = i;
        peso = p;
        genero = g;
        formando = f;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getPeso(){
        return peso;
    }

    public char getGenero(){
        return genero;
    }

    public boolean getFormando(){
        return formando;
    }
}
