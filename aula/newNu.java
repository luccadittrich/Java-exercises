package aula;
// Lucca Palmieri Dittrich 823217461
// me contrata por favor

import java.util.Scanner;

public class newNu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade de lançamentos: ");
        int quantidadeReceber = input.nextInt();

        String[] descricaoReceber = new String[quantidadeReceber];

        double[] valorReceber = new double[quantidadeReceber];

        String[] sinal = new String[quantidadeReceber];

        double valorTotal = 0;

        for (int i = 0; i < quantidadeReceber; i++) {
            System.out.println();
            System.out.print((i + 1) + " - Descrição: ");
            descricaoReceber[i] = input.next();

            System.out.print("Valor: ");
            valorReceber[i] = input.nextDouble();

            System.out.print("Sinal [-] ou [+]: ");
            sinal[i] = input.next();

            if (sinal[i].equals("-")) {
                valorTotal -= valorReceber[i];
            } else if (sinal[i].equals("+")) {
                valorTotal += valorReceber[i];
            }
        }


        System.out.println("\nNº - Descrição - Valor - Sinal");
        for (int i = 0; i < quantidadeReceber; i++) {
            System.out.println((i + 1) + " - " + descricaoReceber[i] + " - " + valorReceber[i] + " [" + sinal[i] + "]");
        }
        input.close();
        System.out.println("________TOTAL_______");
        System.out.println("R$ " + valorTotal);
    }
}
