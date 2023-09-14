package com.algaworks.banco.app;
import com.algaworks.banco.modelo.Pessoa;
import com.algaworks.banco.modelo.ContaComum;
import com.algaworks.banco.modelo.ContaPremium;


public class Main {
    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa("Yago Gomes", "032.334.531-31");
        Pessoa titular2 = new Pessoa("Mario Claudia", "412.254.461-61");


        ContaComum minhaConta = new ContaComum(titular1,1234, 222, false);
        minhaConta.depositar(1000);
        minhaConta.creditarRendimento(1.07);
        minhaConta.mostrarDetalhes();

        ContaPremium suaConta = new ContaPremium(titular2, 1234, 111, true, 1000);
        suaConta.depositar(1000);
        suaConta.sacar(1500);
        minhaConta.creditarRendimento(1.07);

    }
}