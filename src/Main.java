public class Main {
    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa("Yago Gomes", "032.334.531-31");
        Pessoa titular2 = new Pessoa("Mario Claudia", "412.254.461-61");


        ContaComum minhaConta = new ContaComum(titular1,1234, 222, 5932);
        minhaConta.depositar(20000);
        ContaPremium suaConta = new ContaPremium(titular2, 1234, 111, 24424);
        minhaConta.sacar(20000, ContaComum.taxa);
        minhaConta.mostrarDetalhes();

        suaConta.sacar(20000, ContaPremium.taxa);
        suaConta.mostrarDetalhes();
    }
}