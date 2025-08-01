import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Conta {

    private int agencia;
    private int numero;
    private List<Transacao> historico;

    private String nomeCliente;
    private String tipoConta;
    private double saldo;


    public Conta(String nomeCliente, String tipoConta, double saldoInicial, int agencia, int numero) {
        this.nomeCliente = nomeCliente;
        this.tipoConta = tipoConta;
        this.saldo = saldoInicial;
        this.agencia = agencia;
        this.numero = numero;
        this.historico = new ArrayList<>();
        this.registrarTransacao("ABERTURA", saldoInicial);
    }


    public String getNomeCliente() { return this.nomeCliente; }
    public String getTipoConta() { return this.tipoConta; }
    public double getSaldo() { return this.saldo; }
    public int getAgencia() { return this.agencia; }
    public int getNumero() { return this.numero; }


    private void registrarTransacao(String tipo, double valor) {
        this.historico.add(new Transacao(tipo, valor));
    }


    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            this.registrarTransacao("DEPÓSITO", valor);
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser positivo.");
        } else if (this.saldo < valor) {
            System.out.println("Erro: Saldo insuficiente.");
        } else {
            this.saldo -= valor;
            this.registrarTransacao("SAQUE", valor);
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        }
    }


    public void exibirExtrato() {
        System.out.println("\n--- EXTRATO BANCÁRIO ---");
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("Agência: " + this.agencia + " | Conta: " + this.numero);
        System.out.println("--------------------------");

        if (this.historico.isEmpty()) {
            System.out.println("Não há transações nesta conta.");
        } else {
            for (Transacao transacao : this.historico) {
                System.out.println(transacao.getDetalhes());
            }
        }

        System.out.println("--------------------------");
        System.out.printf("SALDO ATUAL: R$ %.2f\n", this.saldo);
        System.out.println("--------------------------");
    }
}