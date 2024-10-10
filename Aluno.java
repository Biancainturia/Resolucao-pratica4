import javax.swing.JOptionPane;

public class Aluno {
    // Atributos privados
    private String nome;
    private int idade;
    private double peso;
    private boolean formando;
    private char sexo;

    // Construtor que inicializa os atributos
    public Aluno(String nome, int idade, double peso, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.formando = false; // O atributo formando é inicializado com falso
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isFormando() {
        return formando;
    }

    public char getSexo() {
        return sexo;
    }

    // Métodos modificadores (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setFormando(boolean formando) {
        this.formando = formando;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}

