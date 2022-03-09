/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01;

/**
 *
 * @author mathe
 */
public class Gato {
    String nome;
    String cor;
    boolean mia;
    float peso;
    boolean dormindo;
        
    void statusGato () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Peso: " + peso);
        System.out.println("Dormindo: " + dormindo );
        System.out.println("Mia: " + mia);
        
    }
    
    void mia() {
    if(this.mia == true) {
        System.out.println("moewmeowmewoemoweomw");
        } else {
        System.out.println("Não mia");
    }
    }
    void dormindo() {
        if (this.dormindo == true) {
            System.out.println("*ronronando");
        } else {
            System.out.println("Não ronrona");
        }
    }

}
