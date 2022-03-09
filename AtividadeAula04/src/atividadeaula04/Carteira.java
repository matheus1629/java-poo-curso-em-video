/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeaula04;

public class Carteira {
    private String cor;
    private float saldo;
    private boolean aberta;

    public Carteira (String c, float s, boolean ab) {
        this.cor = c;
        this.saldo = s;
        this.aberta = ab;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(aberta == true) {
            this.saldo = saldo;
        } else {
            System.out.println("Não é possível atualizar o saldo com a carteira fechada.");
        }
        
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    
    
    
    
    
    public void status() {
        System.out.println(getCor());
        System.out.println(saldo);
        System.out.println(aberta);
    }
    
}
