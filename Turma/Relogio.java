import java.text.SimpleDateFormat;
import java.util.Date;

public class Relogio {

    public static void main(String[] args) {
        iniciarRelogio();
    }

    public static void iniciarRelogio() {
        // Loop infinito para atualizar o relógio a cada segundo
        while (true) {
            mostrarHora();
            pausarPorSegundo();
        }
    }

    public static void mostrarHora() {
        // Obtém a hora atual
        Date agora = new Date();
        // Formata a hora para exibição
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String horaFormatada = formatoHora.format(agora);
        // Exibe a hora atual
        System.out.println("Hora atual: " + horaFormatada);
    }

    public static void pausarPorSegundo() {
        try {
            // Pausa o programa por 1 segundo
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
