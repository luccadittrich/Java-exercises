// package aluno;
import javax.swing.JOptionPane;

public class TesteAluno {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("peso"));
        char genero = JOptionPane.showInputDialog("Genero [M/F]").charAt(0);

        String code = JOptionPane.showInputDialog("Código");
        int year = Integer.parseInt(JOptionPane.showInputDialog("Ano"));

        Turma turma = new Turma(code, year);

        Aluno aluno = new Aluno(nome, idade, peso, genero, turma);

        JOptionPane.showConfirmDialog(null, aluno.getDados());

        year = Integer.parseInt(JOptionPane.showInputDialog("Novo ano"));
        // Aluno aluno2 = new Aluno(nome, idade, peso, genero, turma);
        turma.setYear(year);

        JOptionPane.showConfirmDialog(null, aluno.getDados());

    }
}
