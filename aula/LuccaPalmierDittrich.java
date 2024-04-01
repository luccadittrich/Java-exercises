package aula;
// Lucca Palmieri Dittrich 823217461 19/03/2024
// me da um emprego por favooooor
import java.util.Scanner;

public class LuccaPalmierDittrich {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Código da camisa: ");
        int codigo1 = scan.nextInt();

        System.out.print("Digite o valor: ");    //saida
        float valor1 = scan.nextFloat();          //entrada

        System.out.print("Digite a quantidade: ");
        int quant1 = scan.nextInt();

        System.out.print("Código da calça: ");
        int codigo2 = scan.nextInt();

        System.out.print("Digite o valor: ");
        float valor2 = scan.nextFloat();

        System.out.print("Digite a quantidade: ");
        int quant2 = scan.nextInt();

        float ipi = 5;

        float total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

        System.out.println("Cod - Preço - Quant.");
        System.out.println(codigo1 + " - R$ " + valor1 + " - " + quant1);
        System.out.println(codigo2 + " - R$ " + valor2 + " - " + quant2);

        System.out.println("Total: R$" + total);

        scan.close();
    }
}
