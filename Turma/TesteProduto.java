import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome do Produto");
        int quant = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço"));

        Produto produto = new Produto(nome, quant, preco);

        String msg = "Produto: " + produto.getNome() + "\nQuantidade: " + produto.getQuant() + "\nR$ " + produto.getPreco();

        JOptionPane.showMessageDialog(null, msg);
    }
}
