public class op {
    public static void main(String[] args) {
        String reset = "\u001B[0m";
        String red = "\u001B[31m";

        int a = 127;
        int b = 10;
        int c = 5;
        boolean d = false;
        boolean e = true;

        System.out.println("a) não D = " + red + !d + reset);
        System.out.println("b) D e E = " + red + (d && e) + reset);
        System.out.println("c) não A > B = " + red + (!(a > b)) + reset);
        System.out.println("d A - B > C = " + red + (a - b > c) + reset);
        System.out.println("e) B - C < 0 ou A > B = " + red + (b - c < 0 || a > b) + reset);
        System.out.println("f) (A > B) ou (B < C) = " + red + (a > b || b < c) + reset);
        System.out.println("g) não (A < B) = " + red + !(a < b) + reset);
        System.out.println("h) A / 5 > 10 e E " + red + ((a / 5 > 10) && e) + reset);
        System.out.println("i) D e E ou não B < C = " + red + (d && e || !(b < c)) + reset);
        System.out.println("j) D e E e A / 5 - B > B = " + red + (d || e && a / 5 - b > b) + reset);
        System.out.println("k) D e E ou A = B = " + red + ((d && e) || a == b) + reset);
    }
}
