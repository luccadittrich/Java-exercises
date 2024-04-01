package aula;
import java.util.Scanner;

public class Nubank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantidade de lançamentos: ");
        int quantidadeReceber = input.nextInt();

        String[] descricaoReceber = new String[quantidadeReceber];

        double[] valorReceber = new double[quantidadeReceber];

        String[] sinal = new String[quantidadeReceber];

        double valorTotal = 0;

        for (int i = 0; i < quantidadeReceber; i++) {
            System.out.println("\n");
            System.out.println((i + 1) + " - Descrição: ");
            descricaoReceber[i] = input.nextLine();

            System.out.println("Valor: ");
            valorReceber[i] = input.nextDouble();

            System.out.println("Sinal [-] ou [+]: ");
            sinal[i] = input.next();

            System.out.println("xxxxxxxxxxxxxx ");

            if (sinal[i] == "-") {
                valorTotal -= valorReceber[i];
            } else if (sinal[i] == "+") {
                valorTotal += valorReceber[i];
            }
        }


        System.out.println("Nº - Descrição - Valor - Sinal");
        for (int i = 0; i < quantidadeReceber; i++) {
            System.out.println((i + 1) + " - " + descricaoReceber[i] + " - " + valorReceber[i] + "[" + sinal[i] + "]");
        }
        input.close();
        System.out.println("________TOTAL_______");
        System.out.println("R$ " + valorTotal);
    }
}
