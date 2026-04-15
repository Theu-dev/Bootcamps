package com.Exercicios.AbstracaocomClassesEEncapsulamento;

public class ContaBancaria {

    private final String name = "Matheus";
    private int idade = 23;

    private float saldo;
    private float CHe;
    private float depositar;
    private float sacar;
    private float pagar;
    private boolean verificarConta;

    public String getName() { return name; }

    public int getIdade() { return idade; }

    public void setIdade(int idade) { this.idade = idade; }

    public float getSaldo() { return saldo; }

    public void setSaldo(float saldo) { this.saldo = saldo; }

    public float getCHe() { return CHe; }

    public void setCHe(float CHe) { this.CHe = CHe; }

    public float getDepositar() { return depositar; }

    public void setDepositar(float depositar) { this.depositar = depositar; }

    public float getSacar() { return sacar; }

    public void setSacar(float sacar) {this.sacar = sacar;}

    public float getPagar() { return pagar; }

    public void setPagar(float pagar) { this.pagar = pagar; }

    public boolean isVerificarConta() { return verificarConta; }

    public void setVerificarConta(boolean verificarConta) { this.verificarConta = verificarConta; }
}
