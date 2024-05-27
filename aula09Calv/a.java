import java.util.ArrayList;

public class a {
    public static void main(String[] args) {
        ArrayList<String> beatles = new ArrayList<String>();

        beatles.add("John");
        beatles.add("Paul");
        beatles.add("Ringo");
        beatles.add("Lucca");

        System.out.println(beatles);
        System.out.println(beatles.size());

        System.out.println(beatles.get(3));

        beatles.remove(0);
        System.out.println(beatles);

        System.out.println(beatles.size());
    }
}
