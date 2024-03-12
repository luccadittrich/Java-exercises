import java.util.Scanner;

public class e1146 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            num = input.nextInt();
            if (num != 0) {
                for (int i = 1; i <= num; i++) {
                    System.out.print(i);
                    if (i < num) {System.out.print(" ");}
                }
                System.out.println();
            }
        } while (num != 0);
        input.close();
    }
}
