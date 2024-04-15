// package aluno;
import javax.swing.JOptionPane;

public class TesteAluno {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("peso"));
        char genero = JOptionPane.showInputDialog("Genero [M/F]").charAt(0);

        char formando = JOptionPane.showInputDialog("Formado? [S/N]").charAt(0);
        boolean formado = false;

        if (formando == 's' || formando == 'S') {
            formado = true;
        } else if (formando == 'n' || formando == 'N') {
            formado = false;
        }

        Aluno aluno = new Aluno(nome, idade, peso, genero, formado);

        String msg = "Nome: " + aluno.getNome() + "\nIdade: " + aluno.getIdade() + " anos" + "\nPeso: " + aluno.getPeso() + " kg";

        if (aluno.getFormando()){
            msg += "\nFormando: sim";
        } else {
            msg += "\nFormando: não";
        }


        if (aluno.getGenero() == 'M' || aluno.getGenero() == 'm' ) {
            msg += "\ngenero: masculino ♂️";
        } else {
            msg += "\ngenero: feminino ♀️";
        }

        JOptionPane.showConfirmDialog(null, msg);
    }
}
