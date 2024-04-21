public class A {
    int a;
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getValor());
    }

    public String getValor() {

        int i = 1;
        String str = "";

        if (i > 0) {
            str = " "+i;
        } else if (i < 0) {
            str = "0"+i;
        } else {
            // str = 0; não pode !
        }

        return str;
    }
}
