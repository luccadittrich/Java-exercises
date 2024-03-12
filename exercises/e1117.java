package exercises;
import java.util.Scanner;

public class e1117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = 0;
        for (int i = 1; i <= 2; i++) {
            float new_num = input.nextFloat();
            if (new_num >= 0 && new_num <= 10) {
                num += new_num;
            } else {
                System.out.println("nota invalida");
                i--;
            }
        }
        input.close();
        float media = num / 2;
        System.out.println("media = " + media);
    }
}
