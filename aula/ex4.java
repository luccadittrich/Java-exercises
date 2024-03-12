package aula;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float harry, draco;
        int i, nulos, voto;

        System.out.println("Escolha o seu Campeão Tribruxo de Hogwarts");
        System.out.println("7 - Harry Potter");
        System.out.println("6 - Draco Malfoy");
        System.out.println("qualquer número para NULO");
        System.out.println("0 - encerrar a votação");
        System.out.println();

        harry = 0;
        draco = 0;
        nulos = 0;

        for (i = 1; i <= 100; i++) {
            System.out.print("Eleitor " + i + ", seu voto: ");
            voto = input.nextInt();
            if (voto == 7) {
                harry++;
            } else if (voto == 6) {
                draco++;
            } else if (voto == 0) {
                break;
            } else {
                nulos++;
            }
        }
        input.close();
        i--;

        System.out.println();
        System.out.println("Total de votos: " + (i));
        System.out.println("Harry: " + (harry * 100.0)/i + "%");
        System.out.println("Draco: " + (draco * 100.0)/i + "%");
        System.out.println("Nulos: " + (nulos * 100)/i + "%");


        if (harry > draco) {
            System.out.println("🎉🥳 Harry é o Campeão 🎉🥳" );
        } else if (draco > harry) {
            System.out.println("🎉🥳 Draco é o Campeão 🎉🥳" );
        } else {
            System.out.println("Empate");
        }

    }
}
