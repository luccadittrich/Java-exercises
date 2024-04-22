class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir informações do animal
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
