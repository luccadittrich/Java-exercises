// importar bibliotecas

// declarar classeimport java.util.*;

public class ExemploThrows {
    // declarar uma nova instância da classe Vector
    private Vector v = new Vector();

    // método declarativo para adicionar itens ao array
    public ExemploThrows() throws Exception {
        // adicionar um valor para a instância
        v.add("Disciplina 1");
        v.add("Disciplina 2");
        // invocar o método imprime vetor
        imprimeVetor();
    }

    // declarar um método que não retorna nada mas imprime itens no array
    public void imprimeVetor() throws Exception {
        // imprime a quantidade de itens no total do array
        System.out.println("O número de elementos do vetor é"+v.size());
        // executa um loop para imprimir os itens no array
        for (int i = 0; i <= v.size(); i++) {
            System.out.println(v.elementAt(i).toString());
        }
    }

    // declarar o método main terá um bloco de try catch
    public static void main(String par[]) {
        // try tenta executar o código, caso haja exceção, executa um catch
        try {
            // o try tenta executar uma nova instância de ExemploThrows
            ExemploThrows explthrows = new ExemploThrows();
        } catch (Exception exc) {
            // em caso de exceção, imprime uma mensagem de erro
            System.out.println("Erro " + exc.getMessage());
        } finally {
            //essa mensagem será executada ao final do bloco
            System.out.println("Processo finalizado");
        }
    }
}
