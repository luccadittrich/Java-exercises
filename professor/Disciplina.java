public class Disciplina {
    private String name;
    private boolean pratica;

    public Disciplina(String name, boolean pratica) {
        this.name = name;
        this.pratica = pratica;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getPratica() {
        return pratica;
    }

    public void setPratica(boolean pratica) {
        this.pratica = pratica;
    }

    public String getDados(){
        String pratica_string;
        if (pratica == true){
            pratica_string = "sim";
        } else {
            pratica_string = "não";
        }

        return "Nome: " + name
            + "\nPratica: " + pratica_string;
    }

}
