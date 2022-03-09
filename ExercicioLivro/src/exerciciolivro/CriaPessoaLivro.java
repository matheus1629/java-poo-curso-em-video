/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciolivro;

/**
 *
 * @author mathe
 */
public class CriaPessoaLivro {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa [2];
        Livro l[] = new Livro [3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa ("Maria", 25, "F");
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
        
        l[0].detalhes();
        
    }
    
}
