package exercises;
import java.util.Scanner;

public class e1142 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        int pum = 1;
        for (int i = 1; i <= num; i++){
            System.out.println(pum + " " + (pum += 1 ) + " " + (pum += 1) + " PUM");
            pum += 2;
        }
    }
}
