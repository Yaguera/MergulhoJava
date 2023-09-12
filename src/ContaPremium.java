public class ContaPremium extends Conta{
    static double taxa = 0.01;
    public ContaPremium(Pessoa titular, int agencia, int numero, double saldo) {
        super(titular, agencia, numero, saldo);
    }
    void sacar(double valor, double taxaSaque) {
        sacar(valor - (valor * taxaSaque) );
    }
}
