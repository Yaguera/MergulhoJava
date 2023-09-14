package com.algaworks.banco.modelo;

public class ContaPremium extends ContaInvestimento{
    static double taxa = 0.1;
    private double valorLimite;

    public double getValorLimite() {
        return valorLimite;
    }

    @Override
    public double getSaldoDisponivel() {
        return getSaldo() + getValorLimite();
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }

    public ContaPremium(Pessoa titular, int agencia, int numero, boolean premium, double valorLimite) {
        super(titular, agencia, numero, premium);
        this.valorLimite = valorLimite;
    }
    public void sacar(double valor) {
        double valorComTaxa = valor - (valor * taxa)/100;
        super.sacar(valorComTaxa);
    }
}
