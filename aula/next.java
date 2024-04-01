package aula;
import java.util.Scanner;

public class next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("x");
            String x = input.nextLine();
            System.out.print("y");
            String y = input.nextLine();
        }
    }
}
