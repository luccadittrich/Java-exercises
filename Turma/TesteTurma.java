import javax.swing.JOptionPane;

public class TesteTurma {
    public static void main(String[] args) {
        String msg1 = "";
        String msg2 = "";

        for (int i = 0; i < 2; i++) {
            String nome = JOptionPane.showInputDialog("Nome da turma");
            String curso = JOptionPane.showInputDialog("Nome do curso");
            int quantAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos"));
            int serie = Integer.parseInt(JOptionPane.showInputDialog("Serie"));

            Turma turma = new Turma(nome, curso, quantAlunos, serie);
            String msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso() + "\nAlunos: " + turma.getQuant() + "\nSérie: " + turma.getSerie();

            if (i == 0) {
                msg1 += msg + "\n\n";
            } else {
                msg2 += msg + "\n\n";
            }
        }
        JOptionPane.showMessageDialog(null, msg1 + msg2);

    }
}
