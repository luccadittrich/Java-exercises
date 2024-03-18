package exercises;
import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Perguntar o ano

        System.out.println("Digite o ano: ");
        int currentYear = input.nextInt();
        // em que ano nasceu?
        System.out.println("Digite o ano de nascimento: ");
        int birthYear = input.nextInt();
        input.close();
        // calcular a idade
        int yearsOld = currentYear - birthYear;

        if (yearsOld < 0) {
            System.out.println("Você ainda não nasceu");
        } else {
            System.out.println("Você completa " + yearsOld + " anos em " + currentYear);
        }
    }
}
