package aula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListMethod {
    public static void main(String[] args) {

        ArrayList<String> contatos = new ArrayList();
        Scanner scan = new Scanner(System.in);

        contatos.add("Sabrina: 11 11111111");
        contatos.add("Julia: 22 222222222");
        contatos.add("Carol: 33 33333333");

        //antes de excluir
        for (int i = 0; i < contatos.size(); i++) {
            // System.out.printf("Posição %d- %s\n", i, contatos.get(i));
            System.out.println(i + ". " + contatos.get(i));
        }

        System.out.println("Qual deseja excluir? ");

        int escolha = scan.nextInt();

        contatos.remove(escolha);

        //após excluir


        for (int i = 0; i < contatos.size(); i++) {
            System.out.printf("Posição %d- %s\n", i, contatos.get(i));
        }

    }
}
