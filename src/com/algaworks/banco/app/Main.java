package com.algaworks.banco.app;
import com.algaworks.banco.modelo.*;


public class Main {
    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa("Yago Gomes", "032.334.531-31");
        Pessoa titular2 = new Pessoa("Mario Claudia", "412.254.461-61");
        Pessoa titular3 = new Pessoa("Ednaldo Pereira", "132.435.567-95");

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaComum minhaConta = new ContaComum(titular1,1234, 222, false);
        minhaConta.depositar(1000);
        minhaConta.creditarRendimento(1.07);

        ContaPremium suaConta = new ContaPremium(titular2, 1234, 111, true, 1000);
        suaConta.depositar(1000);
        suaConta.sacar(1500);
        suaConta.creditarRendimento(1.07);

        ContaComum conta3 = new ContaComum(titular3, 1356, 535, false);
        conta3.creditarRendimento(1.07);
        caixaEletronico.imprimirSaldo(minhaConta);
        caixaEletronico.imprimirSaldo(suaConta);
        caixaEletronico.imprimirSaldo(conta3);


    }
}