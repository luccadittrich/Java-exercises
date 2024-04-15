public class Disciplina {
    private String nome, professor;
    private int semestre;
    private boolean ofertada;

    public Disciplina(String nom, String professo, int semeste, boolean ofertada) {
        nome = nom;
        professor = professo;
        semestre = semeste;
        ofertada = false;
    }

    public String getNome(){
        return nome;
    }

    public String getProf(){
        return professor;
    }

    public int getSemestre(){
        return semestre;
    }

    public boolean getOfertada(){
        return ofertada;
    }
}
