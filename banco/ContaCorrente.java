public class ContaCorrente {
    private int numero, digito;
    private Agencia agencia;
    private double saldo;

    public ContaCorrente(int numero, int digito, Agencia agencia, double saldo) {
        this.numero = numero;
        this.digito = digito;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }

    // public void setDigito() {
    //     int new_numero = 0;

    //     int[] numero_da_conta = new int[4];

    //     for (int i = 0; i < numero_da_conta.length; i++) {
    //         numero_da_conta[i] = numero % 10;
    //         numero /= 10;
    //     }

    //     for (int i = 0; i < 4; i++) {
    //         if (i == 3) {
    //             new_numero += numero_da_conta[i] * 6;
    //         } else {
    //             new_numero += numero_da_conta[i] * (2 * (i + 1));
    //         };
    //     }

    //     int digito = new_numero % 11;

    //     if (digito == 10) {
    //         digito = 0;
    //     }

    //     this.digito = digito;
    // }
    public void setDigito(int digito){
        this.digito = digito;
    }

    public boolean verificarDigito(int digito) {
        int new_numero = 0;

        int[] numero_da_conta = new int[4];

        for (int i = 0; i < numero_da_conta.length; i++) {
            numero_da_conta[i] = numero % 10;
            numero /= 10;
        }

        for (int i = 0; i < 4; i++) {
            if (i == 3) {
                new_numero += numero_da_conta[i] * 2;
            } else {
                new_numero += numero_da_conta[i] * (2 * (i + 2));
            };
        }

        int verificador = new_numero % 11;

        if (verificador == 10){
            verificador = 0;
        }

        if (digito == verificador) {
            System.out.println("Digito certo");
            return true;
        } else {
            return false;
        }
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public double sacar(double valor){
        if (saldo - valor >= 0) {
            saldo -= valor;
            System.out.println("Saque realizado");
            return valor;
        } else {
            System.out.println("Saldo insuficiente");
            return 0;
        }
    }

    public double consultarSaldo(){
        return saldo;
    }

    public String imprimirSaldo(){
        return "Conta: " + numero + "-" + digito
            + "\nAgência: " + agencia.getNumero() + "-" + agencia.getDigito()
            + "\nSaldo: " + saldo;
    }

}
