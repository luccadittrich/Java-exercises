public class colorized {
    public static void main(String[] args) {
        // Cores ANSI para console
        String reset = "\u001B[0m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";

        // Exemplo de prints coloridos
        System.out.println(red + "Texto em vermelho" + reset);
        System.out.println(green + "Texto em verde" + reset);
        System.out.println(yellow + "Texto em amarelo" + reset);
    }
}
