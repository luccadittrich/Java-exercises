package aula;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");

        String name = input.nextLine();
        input.close();

        System.out.println("olá "+ name + "!");
    }
}
