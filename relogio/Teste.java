public class Teste {
    public static void main(String[] args) throws InterruptedException {
        Relogio relogio = new Relogio();
        for (int i = 0; i < 1440; i++) {
            relogio.ticTac();
            System.out.println(relogio.mostra());
            Thread.sleep(500);
        }
    }
}
