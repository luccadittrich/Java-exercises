package exercises;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class newhello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a frase: ");
        String string = scanner.nextLine();

        scanner.close();

        char[] array = string.toCharArray();
        ArrayList<String> arrayVazio = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            // System.out.println(array[i]);
            arrayVazio.add(String.valueOf(array[i]));
            System.out.println(String.join("", arrayVazio));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
