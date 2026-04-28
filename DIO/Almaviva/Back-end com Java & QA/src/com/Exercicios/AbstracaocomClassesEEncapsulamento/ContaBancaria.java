package com.Exercicios.AbstracaocomClassesEEncapsulamento;

public class ContaBancaria {

    private float saldo;
    private float limite;

    public ContaBancaria(float saldo){

        this.saldo = saldo;

        if(saldo < 0){
            
            throw new IllegalArgumentException("Saldo inferior a 1");
            
        } else { if(saldo <= 500){
                limite = 50;
            } else { limite = saldo * 0.5; } }
    }

    public float getSaldo() { return saldo; }

    public float getLimite() { return limite; }

    public void setDeposito(float deposito){
        
        if(deposito < 0){ throw new IllegalArgumentException("Saldo inferior a 1"); }

        float antes = saldo;

        this.deposito = deposito;
        saldo = saldo + deposito;

        if(antes < 0){
            saldo = saldo * 0.2;
        }
    }
}
