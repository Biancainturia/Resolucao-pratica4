import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {
        // Leitura dos valores do produto
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto:"));

        // Criação do produto com os valores lidos
        Produto produto = new Produto(nome, preco, quantidade);

        // Exibindo o produto criado
        produto.exibirProduto();
    }
}
