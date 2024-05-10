import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double juros = 0.11;

        Scanner input = new Scanner(System.in);

        System.out.print("Valor em atraso: R$");
        double valor = input.nextDouble();

        double valorTotal = valor + (valor * juros);
        System.out.println("Você deve R$" + valorTotal);

        double valorDesconto = valorTotal - (valorTotal * juros);
        System.out.println("Valor com desconto R$" + valorDesconto);

        double prejuizo = valor - valorDesconto;
        System.out.println("o prejuízo é de R$" + prejuizo);

        input.close();
    }
}
