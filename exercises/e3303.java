package exercises;
import java.util.Scanner;

public class e3303 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        input.close();
        if (word.length() < 20 ) {
            System.out.println("palavrinha");
        } else if (word.length() > 19) {

            System.out.println("palavrao");
        }
    }
}
