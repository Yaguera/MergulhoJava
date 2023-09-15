package com.algaworks.banco.modelo;

import java.util.Objects;

public abstract class Conta {
    private final Pessoa titular;
    private final int agencia;
    private final int numero;
    private double saldo;
    private boolean premium;

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public Pessoa getTitular() {
        return titular;
    }
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getSaldoDisponivel() {
        return getSaldo();
    }

    public Conta(Pessoa titular, int agencia, int numero, boolean premium) {
        Objects.requireNonNull(titular);

        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.premium = premium;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Insira um valor válido.");
        }
        saldo += valor;
        System.out.printf("Foi debitado um valor de %s na conta %d / %d%n", valor, getAgencia(), getNumero());
        System.out.println(getTitular().getNome() + ", seu saldo atual é de R$ " + saldo);
        System.out.println("-------------------------------");
    }

    public void sacar(double valor) {
        if (getSaldoDisponivel() >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
            System.out.println("Saldo atual: " + saldo);
            System.out.println("-------------------------------");
        } else {
            throw new IllegalStateException("Saldo Insuficiente");
        }
    }
}
