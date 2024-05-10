package aulacalveti;
//1) Crie um algoritmo que leia três palavras, separadamente, e as apresente na tela
// na ordem contrária em que foram digitadas, separadas por espaço;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calvo {
    public static void main(String[] args) throws IOException {
        // Criando um BufferedReader para ler entrada do teclado
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] nomes = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um nome: ");
            String nome = reader.readLine();
            nomes[i] = nome;
        }

        for (int i = 2; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        reader.close();
    }

    public String ok(){
        return "ok";
    }
}
