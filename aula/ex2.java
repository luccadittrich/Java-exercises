package aula;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor total da compra para ser dividida por 5 prestações?");
        float value = input.nextInt();
        input.close();

        System.out.println("O valor de cada prestação é R$" + (value / 5));
    }
}
