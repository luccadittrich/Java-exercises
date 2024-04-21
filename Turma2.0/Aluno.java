public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private boolean formando;
    private char genero;
    private Turma turma;

    public Aluno(String nome, int idade, double peso, char genero, Turma turma) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.genero = genero;
        this.formando = false;
        this.turma = turma;
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

    public Turma getTurma(){
        return turma;
    }

    public String getDados() {
        String genero = (getGenero() == 'M' || getGenero() == 'm') ? "masculino ♂️" : "feminino ♀️";

        return "Aluno: " + nome
            + "\nIdade: " + idade
            + "\nPeso: " + peso + " kg"
            + "\nFormado: " + (getFormando() ? "Sim" : "Não")
            + "\nGênero: " + genero
            + "\n" + turma.getDados();
    }
}
