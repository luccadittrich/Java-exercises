public class Produto {
    private String nome;
    private int quant;
    private double preco;

    public Produto(String n, int q, double p) {
        nome = n;
        quant = q;
        preco = p;
    }

    public String getNome(){
        return nome;
    }

    public int getQuant(){
        return quant;
    }

    public double getPreco(){
        return preco;
    }
}
