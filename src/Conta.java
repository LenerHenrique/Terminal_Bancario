public class Conta {
    private String nomeCliente;
    private String tipoConta;
    private double saldo;

    public Conta() {
    }

    public Conta(String nomeCliente, String tipoConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }


    public void consultarSaldo (){
        System.out.println("O saldo atual é R$ " + String.format("%.2f", this.saldo));
    }
    public void depositar (double valor){
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso. Novo saldo: R$ " + String.format("%.2f", this.saldo));
    }
    public void sacar (double valor){
        if (this.saldo < valor){
            System.out.println("Erro: Saldo insuficiente.");
    } else {
        this.saldo -= valor;
            System.out.println("Saque realizado com Sucesso.  Novo Saldo: R$ " + String.format("%.2f", this.saldo));
        }
    }
}
