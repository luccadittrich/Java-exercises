public class Professor {
    private String name;
    private int age;

    public Professor(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDados(){
        return "Nome: " + name
            + "\nIdade: " + age;
    }
}
