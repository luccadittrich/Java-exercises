// package calvo;

//1) Crie um algoritmo para calcular o número de dias aproximado que você viveu,
//com base em sua idade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class calvo1 {

    static void main(String args[]) throws IOException {
        // Criando um BufferedReader para ler entrada do teclado
        /* okokokokokoko */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        String name = "ok";
        String concat = 'o' + name + "ok" + 1 + 2;

        String concat1 = 'o' + name + "ok" + (1 + 2);

        int age = Integer.parseInt(input);
        int days = age * 365;

        System.out.println(concat);
        System.out.println(concat1);

        reader.close();
    }
}
