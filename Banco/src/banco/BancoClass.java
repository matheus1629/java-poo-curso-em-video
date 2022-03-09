/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

public class BancoClass {
    public int numConta;
    protected String tipo;
    private String nome;
    private float saldo;
    private boolean status;
    
    
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if(status == true) {
           if (tipo == "cc") {
           //this.saldo = 50f;
            this.setSaldo(50);
        } else if (tipo == "cp") {
            // this.saldo = 150f;
            this.setSaldo(150);
        }
        }
        
    }
    
    public void depositar(float d) {
        if (this.getStatus()) {
           // this.saldo += d;
           this.setSaldo(this.getSaldo() + d);
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }
    
    public void sacar(float s) {
        if (this.getStatus()) {
            if (this.getSaldo() >= s) {
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque realizado na conta de " + this.getNome());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }
    
    public void fecharConta() {
        if(this.getSaldo() == 0f) {
            this.status = false;
            System.out.println("Conta fechada com sucesso.");
        } else if(this.getSaldo() > 0f) {
            System.out.println("Você precisa retirar seu dinheiro para poder fechar a conta.");
        } else if (this.getSaldo() <0f ) {
            System.out.println("Você precisa depositar dinheiro até zerar a conta para poder fechar a conta");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "cc") {
            v = 12;
        } else if (this.getTipo() == "cp") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        } else {
            System.out.println("Impossível pagar uma conta fechada");
        }
    }
    
    public void info() {
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono da conta: " + this.getNome());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
        System.out.println("--------------------------------");

    }
    
}
