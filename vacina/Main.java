import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int hora = 8;
        int vacinas = 700;
        Scanner chiclete = new Scanner(System.in);

        System.out.println("Bem vindo ao hospital");

        while (hora <= 17) {
            System.out.println("__________________________");

            Thread.sleep(1000);
            System.out.println("horário: " + hora + ":00");
            System.out.println("Total de vacinas: " + vacinas);

            System.out.print("Quantas vacinas foram aplicadas? ");

            // pedir quanta vacinas foram aplicadas
            int quantidade = chiclete.nextInt();

            //subtrair a quantidade total de vacinas
            vacinas -= quantidade;

            hora++;
        }

        System.out.println();
        System.out.println("Sobraram " + vacinas);
        System.out.println("Foram aplicadas " + (700 - vacinas));
    }
}
