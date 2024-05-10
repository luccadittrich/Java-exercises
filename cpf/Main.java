import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Crie um objeto CPF com um número de CPF
        System.out.print("Insira o cpf: ");
        String x = input.next();
        input.close();
        CPF cpf = new CPF(x);
        // Verifique se o CPF é válido e imprima o resultado
        if (cpf.validarCPF()) {
            System.out.println("O CPF " + cpf.getNumero() + " é válido. ✅");
        } else {
            System.out.println("O CPF " + cpf.getNumero() + " é inválido. ❌");
        }
    }
}
