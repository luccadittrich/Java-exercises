import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        // Perguntar o ano
        System.out.println("Digite o ano: ");
        int currentYear = new Scanner(System.in).nextInt();
        // em que ano nasceu?
        System.out.println("Digite o ano de nascimento: ");
        int birthYear = new Scanner(System.in).nextInt();

        // calcular a idade
        int yearsOld = currentYear - birthYear;

        if (yearsOld < 0) {
            System.out.println("Você ainda não nasceu");
        } else {
            System.out.println("Você completa " + yearsOld + " anos em " + currentYear);
        }
    }
}
