public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Luna", 12);
        Gato meuGato = new Gato("Harry", 13);
        Foca minhaFoca = new Foca("Hermione", 17);

        meuCachorro.mostrarInfo();
        meuCachorro.latir();

        meuGato.mostrarInfo();
        meuGato.miado();


        minhaFoca.mostrarInfo();
        minhaFoca.barulho();
    }
}
