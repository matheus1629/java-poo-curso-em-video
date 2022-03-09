/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade01;

/**
 *
 * @author mathe
 */
public class atividade01 {
    public static void main(String[] args) {
        Gato g1 = new Gato();
        g1.nome = "Katarina";
        g1.cor = "Branco e preto";
        g1.peso = 3.5f;
        g1.dormindo = false;
        g1.mia = true;
        
        g1.statusGato();
        g1.mia();
        g1.dormindo();
        
        
    }
}
