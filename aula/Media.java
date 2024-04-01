package aula;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();

        scanner.close();

        float average = (num1 + num2) / 2;
        System.out.println("MÉDIA = " + average);
    }
}
