package com.algaworks.banco.modelo;

public class CaixaEletronico {
    public void imprimirSaldo(Conta conta) {
        System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo: " + conta.getSaldo());
        if(conta.isPremium()) {
            System.out.println("Saldo Disponível: " + conta.getSaldoDisponivel());
        }
        String typeAcount = conta.isPremium() ? "Premium" : "Standard";
        System.out.println("Cliente " + typeAcount);
        System.out.println("-------------------------------");
    }
}
