import java.util.Scanner;

public class Lucro {

    private int numeroClientes;
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Lucro lucro = new Lucro();

        lucro.calcularMediaGastoPorCliente();

        System.out.println("______________________________");
        System.out.println();

        lucro.calcularMediaGeral();
    }

    public void calcularMediaGastoPorCliente() {
        double valorAcumulado = 0;

        System.out.print("Digite o número de clientes: ");
        numeroClientes = input.nextInt();

        int i = 1;

        while (i <= numeroClientes) {
            System.out.println("_______ cliente " + i + "_______");
            System.out.print("Insira o valor gasto com bebidas: R$");
            valorAcumulado += input.nextDouble();

            System.out.print("Insira o valor gasto com comida: R$");
            valorAcumulado += input.nextDouble();
            System.out.println();
            i++;
        }

        double media = valorAcumulado / numeroClientes;
        System.out.println();
        System.out.println("****************************");
        System.out.println("Média por cliente: R$" + media);
        System.out.println("****************************");
        System.out.println();

    }

    public void calcularMediaGeral() {

        System.out.print("Valor geral das bebidas: R$");
        double bebidas = input.nextDouble();

        System.out.println();
        System.out.print("Valor geral das comidas: R$");
        double comidas = input.nextDouble();

        double totalBebidas = bebidas / numeroClientes;
        double totalComidas = comidas / numeroClientes;
        double geral = (comidas + bebidas) /  numeroClientes;

        System.out.println();
        System.out.println("##############################");
        System.out.println("Bebidas: R$" + totalBebidas);
        System.out.println("Comidas: R$" + totalComidas);
        System.out.println("Geral: R$" + geral);


        System.out.println("#############################");
    }

}
