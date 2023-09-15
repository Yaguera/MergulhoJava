package com.algaworks.banco.modelo;
public class ContaInvestimento extends Conta{
    public ContaInvestimento(Pessoa titular, int agencia, int numero, boolean premium) {
        super(titular, agencia, numero, premium);
    }

    public void creditarRendimento(double percentualJuros){
        double valorRendimento = getSaldo() * percentualJuros / 100;
        if(valorRendimento < 0){
            System.out.println(getTitular().getNome() + ", sua conta possui saldo negativo, portanto não haverá rendimento.");
            System.out.println("-------------------------------");
        }else if(valorRendimento == 0){
            System.out.println(getTitular().getNome() +", sua conta está zerada, portanto não haverá rendimento.");
            System.out.println("-------------------------------");
        }else {
            depositar(valorRendimento);
        }
}

}
