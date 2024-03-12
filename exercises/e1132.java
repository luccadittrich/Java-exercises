package exercises;
import java.util.Scanner;

public class e1132 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int total = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 13 != 0) {
                total += i;
            }
        }
        input.close();
        System.out.println(total);
    }
}
