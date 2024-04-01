package aula;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffer {
    public static void main(String[] args) throws IOException {
        // Criando um BufferedReader para ler entrada do teclado
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Pedindo ao usuário para digitar um nome
        System.out.println("Digite um nome:");

        // Lendo o nome digitado pelo usuário
        String nome = reader.readLine();

        // Imprimindo o nome digitado
        System.out.println("O nome digitado foi: " + nome);

        // Fechando o BufferedReader
        reader.close();
    }
}
