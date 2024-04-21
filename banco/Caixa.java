import javax.swing.JOptionPane;

public class Caixa {
    public static void main(String[] args) {
        Agencia agencia = new Agencia("NuBank", 7890, 5);

        ContaCorrente conta_corrente = new ContaCorrente(1234, 4, agencia, 150);

        Cliente cliente = new Cliente("Lucca", "123456", conta_corrente);

        conta_corrente.sacar(140.0);

        System.out.println("Saldo: R$" + conta_corrente.consultarSaldo());

        conta_corrente.sacar(200);

        System.out.println("Saldo: R$" + conta_corrente.consultarSaldo());

        System.out.println("___________");

        System.out.println("Depositar: R$ 25,45");

        conta_corrente.depositar(25.45);

        System.out.println(conta_corrente.imprimirSaldo());
    }
}
