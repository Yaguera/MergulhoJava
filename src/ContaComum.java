public class ContaComum extends Conta {
    static double taxa = 0.05;
    public ContaComum(Pessoa titular, int agencia, int numero, double saldo, boolean premium) {
        super(titular, agencia, numero, saldo, premium);
    }
    // Sobrecarga do método sacar para ContaComum
    public void sacar(double valor) {
        double valorComTaxa = valor - (valor * taxa);
        super.sacar(valorComTaxa);
    }
}
