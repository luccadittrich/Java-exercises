package exercises;
import java.util.Scanner;

public class e1067 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        input.close();
        for (int i = 1; i <= num; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
