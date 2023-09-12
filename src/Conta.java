public abstract class Conta {
    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

    public Conta(Pessoa titular, int agencia, int numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Insira um valor válido.");
        }
        saldo += valor;
        System.out.println("Deposito de R$ " + valor + " foi realizado com sucesso.");
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("-------------------------------");
    }

    void sacar(double valor) {
        if(saldo - valor < 0) {
            throw new IllegalStateException("Saldo Insuficiente");
        }
        saldo -= valor;
        System.out.println("Saque no valor de R$ " + valor + " foi realizado com sucesso");
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("-------------------------------");

    }


    void mostrarDetalhes() {
        System.out.println("Nome: " + this.titular.nome);
        System.out.println("CPF: " +this.titular.cpf);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("-------------------------------");
    }
}
