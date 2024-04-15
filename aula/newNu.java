// package aula;
import java.util.ArrayList;

// Lucca Palmieri Dittrich 823217461
// me contrata por favor

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class newNu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade de lançamentos: ");
        int quantidadeReceber = input.nextInt();

        // String[] descricaoReceber = new String[quantidadeReceber];
        ArrayList<String> descricaoReceber = new ArrayList<>();

        // double[] valorReceber = new double[quantidadeReceber];
        ArrayList<Double> valorReceber = new ArrayList<>();

        // String[] sinal = new String[quantidadeReceber];
        ArrayList<String> sinal = new ArrayList<>();

        double valorTotal = 0;

        for (int i = 0; i < quantidadeReceber; i++) {
            System.out.println();
            System.out.print((i + 1) + " - Descrição: ");
            descricaoReceber.add(input.next());

            System.out.print("Valor: ");
            valorReceber.add(input.nextDouble());


            System.out.print("Sinal [-] ou [+]: ");
            sinal.add(input.next());

            if (sinal.get(i).equals("-")) {
                valorTotal -= valorReceber.get(i);
            } else if (sinal.get(i).equals("+")) {
                valorTotal += valorReceber.get(i);
            }
        }


System.out.println("\nNº - Descrição - Valor - Sinal");
        for (int i = 0; i < quantidadeReceber; i++) {
            System.out.println((i + 1) + " - " + descricaoReceber.get(i) + " - " + valorReceber.get(i) + " [" + sinal.get(i) + "]");
        }
        input.close();
        System.out.println("________TOTAL_______");
        System.out.println("R$ " + valorTotal);
    }
}
