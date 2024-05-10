public class CPF {
    private String numero;

    // Construtor
    public CPF(String numero) {
        this.numero = numero;
    }

    // Método para verificar se o CPF é válido
    public boolean validarCPF() {
        // Remover caracteres não numéricos do CPF
        String cpfNumerico = numero.replaceAll("[^0-9]", "");

        // Verificar se o CPF possui 11 dígitos
        if (cpfNumerico.length() != 11) {
            return false;
        }

        // Verificar se todos os dígitos do CPF são iguais
        if (cpfTodosDigitosIguais(cpfNumerico)) {
            return false;
        }

        // Calcular o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpfNumerico.charAt(i)) * (10 - i);
        }
        int resto = soma % 11;
        int digitoVerificador1 = (resto < 2) ? 0 : (11 - resto);

        // Verificar o primeiro dígito verificador
        if (Character.getNumericValue(cpfNumerico.charAt(9)) != digitoVerificador1) {
            return false;
        }

        // Calcular o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpfNumerico.charAt(i)) * (11 - i);
        }
        resto = soma % 11;
        int digitoVerificador2 = (resto < 2) ? 0 : (11 - resto);

        // Verificar o segundo dígito verificador
        if (Character.getNumericValue(cpfNumerico.charAt(10)) != digitoVerificador2) {
            return false;
        }

        // Se passou por todas as verificações, o CPF é válido
        return true;
    }

    // Método para verificar se todos os dígitos do CPF são iguais
    private boolean cpfTodosDigitosIguais(String cpf) {
        char primeiroDigito = cpf.charAt(0);
        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(i) != primeiroDigito) {
                return false;
            }
        }
        return true;
    }

    // Método para obter o número do CPF
    public String getNumero() {
        return numero;
    }

    // Método para definir o número do CPF
    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Método toString para representação em string do CPF
    @Override
    public String toString() {
        return "CPF: " + numero;
    }
}
