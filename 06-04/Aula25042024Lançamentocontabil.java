import java.util.ArrayList;
import java.util.Scanner;

public class Aula25042024Lançamentocontabil {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double saldoTotal = 0;
        System.out.print("Quantidade de lançamentos contas a Receber: ");
        int quantidadeReceber = scanner.nextInt();
        scanner.nextLine(); // Consumindo a quebra de linha

        ArrayList<String> descricaoReceber = new ArrayList();
        ArrayList<Double> valorReceber = new ArrayList();
        ArrayList<String> sinalreceber = new ArrayList();

        for (int i = 0; i < quantidadeReceber; i++) {
            System.out.print((i + 1) + " - Descrição do lançamento a receber: ");
            descricaoReceber.add(scanner.next());
            System.out.print(" Digitar o valor a receber: ");
            valorReceber.add(scanner.nextDouble());
            System.out.print(" Digitar o sinal a receber: ");
            sinalreceber.add(scanner.next());

            System.out.println(" xx - sinal a receber: "+(sinalreceber.get(i)));
            System.out.println(" xx - saldo total: "+ saldoTotal);

            if ("+".equals(sinalreceber.get(i))) {
                saldoTotal += valorReceber.get(i); // Adicionando ao saldo total

            } else {
                saldoTotal -= valorReceber.get(i); // Adicionando ao saldo total

            }
            System.out.println(" yy - sinal a receber: "+(sinalreceber.get(i)));
            System.out.println(" yy - saldo total: "+ saldoTotal);
        }
        // contas a apagar
        System.out.print("\nQuantidade de lançamentos de Contas a Pagar: ");
        int quantidadePagar = scanner.nextInt();
        scanner.nextLine(); // Consumindo a quebra de linha

        ArrayList<String> descricaoPagar = new ArrayList();
        ArrayList<Double> valorPagar = new ArrayList();
        ArrayList<String> sinalpagar = new ArrayList();

        for (int i = 0; i < quantidadePagar; i++) {
            System.out.print((i + 1) + " - Descrição do lançamento a pagar: ");
            descricaoPagar.add(scanner.next());
            System.out.print(" Valor do lançamento: ");
            valorPagar.add(scanner.nextDouble());
            System.out.print(" Sinal do lançamento (+)/(-): ");
            sinalpagar.add(scanner.next());

            if ("+".equals(sinalpagar.get(i))) {
                saldoTotal += valorPagar.get(i); // Adicionando ao saldo total
            } else {
                saldoTotal -= valorPagar.get(i); // Adicionando ao saldo total

            }
            System.out.println(" 5 - saldo do lançamento a pagar " + saldoTotal);
            System.out.println(" ");

        }

        System.out.println("\nFluxo de Caixa Mensal de XX/2021");
        System.out.println("Saldo Anterior = 0");
        System.out.println("\nContas a Receber:");
        double totalReceber = 0;
        for (int i = 0; i < quantidadeReceber; i++) {
            System.out.println((i + 1) + " - " + descricaoReceber.get(i) + " - " + valorReceber.get(i) + " - " + " Sinal " + sinalreceber.get(i));
            totalReceber += valorReceber.get(i);
        }
        System.out.println("Total de contas a Receber: " + totalReceber);

        System.out.println("\nContas a Pagar:");
        double totalPagar = 0;
        for (int i = 0; i < quantidadePagar; i++) {
            System.out.println((i + 1) + " - " + descricaoPagar.get(i) + " - " + valorPagar.get(i) + " Sinal " + sinalpagar.get(i));
            totalPagar += valorPagar.get(i);
        }
        System.out.println("Total de contas a Pagar: " + totalPagar);

        System.out.println("\nSaldo do Mês Total = " + saldoTotal + " (+)");

        scanner.close();
    }
}

// Updater (Installer only):

// * WinGup (for Notepad++) v5.2.4
// Aula26032024Lançamentocontabillista.txt
// Exibindo Aula26032024Lançamentocontabillista.txt…
