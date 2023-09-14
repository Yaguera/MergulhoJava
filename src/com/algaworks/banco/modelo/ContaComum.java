package com.algaworks.banco.modelo;

public class ContaComum extends ContaInvestimento {
    static double taxa = 0.2;
    public ContaComum(Pessoa titular, int agencia, int numero, boolean premium) {
        super(titular, agencia, numero, premium);
    }
    // Sobrecarga do método sacar para com.algaworks.banco.app.ContaComum
    public void sacar(double valor) {
        double valorComTaxa = valor - (valor * taxa)/100;
        super.sacar(valorComTaxa);
    }
}
