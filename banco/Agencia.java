public class Agencia {
    private String name;
    private int numero, digito;

    public Agencia(String name, int numero, int digito) {
        this.name = name;
        this.numero = numero;
        this.digito = digito;
    }

    public String getName(){
        return name;
    }

    public int getNumero(){
        return numero;
    }

    public int getDigito(){
        return digito;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setDigito(int digito){
        this.digito = digito;
    }

    public boolean verificarDigito(){
        int new_numero = 0;
        int[] numero_da_conta = new int[4];
        for (int i = 0; i < numero_da_conta.length; i++) {
            numero_da_conta[i] = numero % 10;
            numero /= 10;
        }

        for (int i = 0; i < 4; i++) {
            if (i == 3) {
                new_numero += numero_da_conta[i] * 6;
            } else {
                new_numero += numero_da_conta[i] * (2 * (i + 1));
            };
        }

        int verificador = new_numero % 11;

        if (verificador == 10) {
            verificador = 0;
        }

        if (verificador == digito) {
            System.out.println("Digito certo");
            return true;
        } else {
            System.out.println("Digito errado");
            return false;
        }
    }
}
