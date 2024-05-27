import java.util.ArrayList;

public class b {
    public static void main(String[] args) {
        ArrayList<String> beatles = new ArrayList<String>();
        beatles.add("John");
        beatles.add("Paul");
        beatles.add("Ringo");

        for (String b:beatles){
            System.out.println(b);
        }

        for (int i = 0; i < beatles.size(); i++){
            System.out.println(beatles.get(i));
        }

    }
}
