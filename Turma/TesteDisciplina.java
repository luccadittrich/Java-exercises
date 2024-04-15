import javax.swing.JOptionPane;

public class TesteDisciplina {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Aula");
        String professor = JOptionPane.showInputDialog("Professor");
        int semeste = Integer.parseInt(JOptionPane.showInputDialog("Semestre"));

        Disciplina disciplina = new Disciplina(nome, professor, semeste, true);

        String msg = "Curso: " + disciplina.getNome() + "\nProfessor: " + disciplina.getProf() + "\nSemestre: " + disciplina.getSemestre();

        if (disciplina.getOfertada() == true) {
            msg += "\nOfertada: Sim";
        } else if (disciplina.getOfertada() == false) {
            msg += "\nOfertada: Não";
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}
