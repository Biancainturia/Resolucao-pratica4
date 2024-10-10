import javax.swing.JOptionPane;

public class TesteAluno {
    public static void main(String[] args) {
        // Ler os valores do usuário usando JOptionPane
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do aluno:"));
        char sexo = JOptionPane.showInputDialog("Digite o sexo do aluno (M/F):").charAt(0);

        // Criar uma instância de Aluno com os valores lidos
        Aluno aluno = new Aluno(nome, idade, peso, sexo);

        // Mostrar os atributos do objeto Aluno
        JOptionPane.showMessageDialog(null, "Dados do Aluno:\n" +
                "Nome: " + aluno.getNome() + "\n" +
                "Idade: " + aluno.getIdade() + "\n" +
                "Peso: " + aluno.getPeso() + "\n" +
                "Sexo: " + aluno.getSexo() + "\n" +
                "Formando: " + (aluno.isFormando() ? "Sim" : "Não"));

        // Perguntar novamente sobre a idade, peso e se é formando
        int novaIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova idade do aluno:"));
        double novoPeso = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo peso do aluno:"));
        boolean formando = JOptionPane.showInputDialog("O aluno é formando? (Sim/Não)").equalsIgnoreCase("Sim");

        // Atualizar os valores do objeto Aluno
        aluno.setIdade(novaIdade);
        aluno.setPeso(novoPeso);
        aluno.setFormando(formando);

        // Mostrar novamente os atributos atualizados do objeto Aluno
        JOptionPane.showMessageDialog(null, "Dados Atualizados do Aluno:\n" +
                "Nome: " + aluno.getNome() + "\n" +
                "Idade: " + aluno.getIdade() + "\n" +
                "Peso: " + aluno.getPeso() + "\n" +
                "Sexo: " + aluno.getSexo() + "\n" +
                "Formando: " + (aluno.isFormando() ? "Sim" : "Não"));
    }
}
