package com.algaworks.banco.modelo;
public class ContaInvestimento extends Conta{
    public ContaInvestimento(Pessoa titular, int agencia, int numero, boolean premium) {
        super(titular, agencia, numero, premium);
    }

    public void creditarRendimento(double percentualJuros){
        double valorRendimento = getSaldo() * percentualJuros / 100;
        depositar(valorRendimento);
}

}
