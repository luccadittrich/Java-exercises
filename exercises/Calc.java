package exercises;
import java.util.Scanner;

public class Calc {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();

        int n2 = input.nextInt();

        input.close();

        int sum = n1 + n2;
        System.out.println(n1 + "+" + n2 + "=" + sum);

        int minus = n1 - n2;
        System.out.println(n1 + "-" + n2 + "=" + minus);

        int mult = n1 * n2;
        System.out.println(n1 + "x" + n2 + "=" + mult);

        int div = n1 / n2;
        System.out.println(n1 + "/" + n2 + "=" + div);
    }
}
