package aula;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName, lastName;

        System.out.print("Primeiro nome: ");
        firstName = input.nextLine();
        System.out.print("Último nome: ");
        lastName = input.nextLine();
        input.close();

        System.out.println("Olá " + firstName + " " + lastName);
    }
}
