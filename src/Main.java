public class Main {
    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa("Yago Gomes", "032.334.531-31");
        Pessoa titular2 = new Pessoa("Mario Claudia", "412.254.461-61");


        ContaComum minhaConta = new ContaComum(titular1,1234, 222, 5932, false);
        minhaConta.depositar(20000);
        minhaConta.sacar(20000);
        minhaConta.mostrarDetalhes();

        ContaPremium suaConta = new ContaPremium(titular2, 1234, 111, 24424, true);
        suaConta.sacar(20000);
        suaConta.depositar(525);
        suaConta.mostrarDetalhes();
        suaConta.sacar(1070);
        suaConta.mostrarDetalhes();
    }
}