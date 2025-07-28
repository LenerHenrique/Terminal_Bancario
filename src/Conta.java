public class Conta {
    String nomeCliente;
    String tipoConta;
    double saldo;


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
