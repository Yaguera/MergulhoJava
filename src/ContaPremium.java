public class ContaPremium extends Conta{
    static double taxa = 0.01;

    public ContaPremium(Pessoa titular, int agencia, int numero, double saldo, boolean premium) {
        super(titular, agencia, numero, saldo, premium);
    }
    public void sacar(double valor) {
        double valorComTaxa = valor - (valor * taxa);
        super.sacar(valorComTaxa);
    }
}
