// package aula;
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {

                        //  0   1   2  3
        String[] beatles = {"", "", "", ""};

        beatles[0] = "JohnLennon";
        beatles[1] = "Ringo";
        beatles[2] = "Paul Mc";
        beatles[3] = "George Harrison";


        for (int i = 0; i < beatles.length; i++) {
            System.out.println("nome " + beatles[i]);
        }


        ArrayList<String> oneDirection = new ArrayList<>();

        oneDirection.add("Harry Styles");
        oneDirection.add("Niall Horan ");
        oneDirection.add("Zayn Malik");
        oneDirection.add("Lyan");
    }
}
