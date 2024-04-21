import javax.swing.JOptionPane;

public class TesteAtribuicao {
    public static void main(String[] args) {
        String p_name = JOptionPane.showInputDialog("Nome do professor");
        int p_age = Integer.parseInt(JOptionPane.showInputDialog("Idade do professor"));
        Professor professor = new Professor(p_name, p_age);

        String d_name = JOptionPane.showInputDialog("Nome da maéria");
        String text = "Pratica?";
        int d_pratica = JOptionPane.showConfirmDialog(null, text);

        boolean pratica = (d_pratica == JOptionPane.YES_OPTION);

        Disciplina disciplina = new Disciplina(d_name, pratica);

        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        JOptionPane.showMessageDialog(null, atribuicao.getDados());
    }
}
