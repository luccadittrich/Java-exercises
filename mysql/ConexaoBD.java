public class ConexaoBD {
    public static void main(String[] args) {
        try {
            Class.forName( "con. mysql. jdbe. Driver");

        } catch (ClassNotFoundException e) {

            throw new RuntimeException(e);

        }
    }
}
