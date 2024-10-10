import javax.swing.JOptionPane;

public class TesteTurma {
    public static void main(String[] args) {
        // Coletando os dados da turma via JOptionPane
        String nome = JOptionPane.showInputDialog("Digite o nome da turma:");
        String curso = JOptionPane.showInputDialog("Digite o curso da turma:");
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a série da turma:"));

        // Criando o objeto Turma
        Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);

        // Exibindo os dados da turma criada
        JOptionPane.showMessageDialog(null, "Dados da Turma Criada:\n" +
            "Nome: " + turma.getNome() + "\n" +
            "Curso: " + turma.getCurso() + "\n" +
            "Quantidade de Alunos: " + turma.getQuantidadeDeAlunos() + "\n" +
            "Série: " + turma.getSerie());

        // Pedindo ao usuário para alterar a quantidade de alunos
        int novaQuantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade de alunos:"));
        turma.setQuantidadeDeAlunos(novaQuantidadeDeAlunos);

        // Exibindo os dados atualizados da turma
        JOptionPane.showMessageDialog(null, "Dados Atualizados da Turma:\n" +
            "Nome: " + turma.getNome() + "\n" +
            "Curso: " + turma.getCurso() + "\n" +
            "Nova Quantidade de Alunos: " + turma.getQuantidadeDeAlunos() + "\n" +
            "Série: " + turma.getSerie());
    }
}
