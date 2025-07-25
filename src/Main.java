import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nomeCliente = "Lener";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println("***************************************");
        System.out.println("\nDADOS INICIAIS DO CLIENTE:\n");

        System.out.println("Nome: " + nomeCliente);
        System.out.println("Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);

        System.out.println("\n***************************************");

        int opcao = 0;

        while (opcao != 4) {
            exibirMenu();
            opcao = scan.nextInt();

            if (opcao == 1){
                consultarSaldo(saldo);
            }
            else if (opcao == 2) {
                System.out.println("Informe o valor a receber: ");
                double valorRecebido = scan.nextDouble();
                saldo =  depositar(saldo, valorRecebido);
                System.out.println("Saldo atualizado R$ " + saldo);
            }
            else if (opcao == 3) {
                System.out.println("Informe o Valor a tranferir:");
                double valorSacar = scan.nextDouble();
                saldo = sacar(saldo, valorSacar);
                System.out.println("Saldo atualizado R$ " + saldo);
            }
            else if (opcao != 4) {
                System.out.println("Opção invalida!");
            }

        }
        System.out.println("\nPrograma encerrado. Obrigado por usar nossos serviços!");
        scan.close();
    }
    public static void exibirMenu(){
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");
        System.out.println("Digite a opção desejada:");
    }
    public static void consultarSaldo(double saldo){
        System.out.println("O saldo Atual é R$ " + saldo);
    }
    public static double depositar(double saldoAtual, double valorDeposito){
        return saldoAtual + valorDeposito;
    }
    public static double sacar(double saldoAtual, double valorSaque) {

        if (saldoAtual < valorSaque){
            System.out.println("Não há saldo Suficiente para fazer essa tranferência.");
            return saldoAtual;
        }
        else {
            double novoSaldo = saldoAtual - valorSaque;

            return novoSaldo;
            }

        }
}






