import javax.swing.JOptionPane;

public class TesteDisciplina {
    public static void main(String[] args) {
        // Leitura dos dados da disciplina
        String nome = JOptionPane.showInputDialog("Informe o nome da disciplina:");
        String professor = JOptionPane.showInputDialog("Informe o nome do professor:");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Informe o semestre da disciplina (número):"));
        int opcao = JOptionPane.showConfirmDialog(null, "A disciplina está sendo ofertada?", "Oferta de Disciplina", JOptionPane.YES_NO_OPTION);
        boolean ofertada = (opcao == JOptionPane.YES_OPTION);

        // Criação do objeto Disciplina
        Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);

        // Exibição dos detalhes da disciplina criada
        JOptionPane.showMessageDialog(null, disciplina.exibirDetalhes());
    }
}
