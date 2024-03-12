public class operators {
    public static void main(String[] args) {

        int x = 1;

        System.out.println(x == 1); // true
        System.out.println(x == 2); // false
        System.out.println(x != 2); // true

        System.out.println("___________");


        System.out.println(x > 1);  // false
        System.out.println(x >= 1); // true
        System.out.println(x < 10); // true

        System.out.println("___________");

        System.out.println(x != 10); // true
        System.out.println(x != 1);  // false


        System.out.println("______and_____");

        System.out.println(x == 1 && x == 1); // true
        System.out.println(x == 2 && x == 2); // false

        System.out.println("______or_____");

        System.out.println(x != 1 || x == 1); // true
        System.out.println(x == 1 || x == 2); // true
        System.out.println(x == 2 || x == 4); // false

        System.out.println("______not_____");

        System.out.println(!(x == 1)); // false
        System.out.println(!(x == 2)); // true
        int i = 1;
        i++;
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i);
    }
}
