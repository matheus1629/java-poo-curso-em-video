package exerciciolivro;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    // Métodos

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }
    
    public void status() {
        System.out.println(this.getNome());
        System.out.println(this.getIdade());
        System.out.println(this.getSexo());
    }
    
    //Métodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
