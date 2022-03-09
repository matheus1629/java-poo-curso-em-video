/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11;

public class Aula11 {

    public static void main(String[] args) {
        /*
        Visitante v1 = new Visitante();
        v1.setIdade(20);
        v1.setNome("joao");
        System.out.println(v1.toString());
        */
        Aluno a1 = new Aluno();
        a1.setNome("claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        Tecnico t1 = new Tecnico();
        t1.nome = "carlos";
        System.out.println(t1.toString());
        
    }
    
}
