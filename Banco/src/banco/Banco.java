/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

public class Banco {

   
    public static void main(String[] args) {
        BancoClass p1 = new BancoClass();
        p1.setNumConta(1111);
        p1.setNome("Jubileu");
        p1.abrirConta("cc");
        p1.depositar(100);
        p1.sacar(150);
        p1.fecharConta();
        
        BancoClass p2 = new BancoClass();
        p2.setNumConta(2222);
        p2.setNome("Creuza");
        p2.abrirConta("cp");
        p2.depositar(500);
        p2.sacar(100);
        
        p1.info();
        p2.info();
        
    }
    
}
