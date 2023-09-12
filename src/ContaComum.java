public class ContaComum extends Conta {
    static double taxa = 0.05;
    public ContaComum(Pessoa titular, int agencia, int numero, double saldo) {
        super(titular, agencia, numero, saldo);
    }
    void sacar(double valor, double taxaSaque) {
        sacar(valor - (valor * taxaSaque));
    }
}
