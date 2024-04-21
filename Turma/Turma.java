public class Turma {

    private String nome, curso;
    private int quantAlunos, serie;

    public Turma(String ovo, String c, int q, int s) {
        nome = ovo;
        curso = c;
        quantAlunos = q;
        serie = s;
    }

    public String getNome(){
        return nome;
    }

    public String getCurso(){
        return curso;
    }

    public int getQuant(){
        return quantAlunos;
    }

    public int getSerie(){
        return serie;
    }
}
