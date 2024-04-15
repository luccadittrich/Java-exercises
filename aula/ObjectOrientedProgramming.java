package aula;
public class ObjectOrientedProgramming {

    // public int age;
    // public String name, lastName;

    public static void main(String[] args) {
        String fullName = fullName(args[0], args[1]);
        System.out.println("Hello " + fullName);

        int age = Integer.parseInt(args[2]); // Converte a string em um inteiro
        int year = birth(age);
        System.out.println("you were born in " + year);
    }

    public static String fullName(String name, String lastName){
        return name + " " + lastName;
    }

    public static int birth(int age){
        return 2024 - age;
    }
}
