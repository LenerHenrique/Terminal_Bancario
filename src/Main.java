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
        System.out.println("Saldo: " + String.format("%.2f", saldo));

        System.out.println("\n***************************************");

        int opcao = 0;

        while (opcao != 4) {
            exibirMenu();
            opcao = scan.nextInt();

          switch (opcao) {
              case 1:
                  consultarSaldo(saldo);
                  break;
              case 2:
                  System.out.print("Digite o valor a ser depositado: ");
                  double valorDeposito = scan.nextDouble();
                  saldo = depositar(saldo, valorDeposito);
                  System.out.println("Deposito realizado com sucesso. Novo saldo: R$ " + String.format("%.2f", saldo));
                  break;
              case 3:
                  System.out.print("Informe o valor a sacar: ");
                  double valorSaque = scan.nextDouble();
                  double saldoAnterior = saldo;
                  saldo = sacar(saldo, valorSaque);
                  if (saldo != saldoAnterior){
                      System.out.println("Saque realizado com sucesso. Novo saldo: R$ " + String.format("%.2f", saldo));
                  }
                  break;
              case 4:

                  break;
              default:
                  System.out.println("Opção inválida!");
                  break;
          }

        }
        System.out.println("\nPrograma encerrado. Obrigado por usar nossos serviços!");
        scan.close();
    }
    public static void exibirMenu(){
        System.out.println("\nOperações");
        System.out.println("1- Consultar saldo");
        System.out.println("2- Depositar valor");
        System.out.println("3- Sacar valor");
        System.out.println("4- Sair");
        System.out.print("\nDigite a opção desejada: ");
    }
    public static void consultarSaldo(double saldo){
        System.out.println("O saldo Atual é R$ " + String.format("%.2f", saldo));
    }
    public static double depositar(double saldoAtual, double valorDeposito){
        return saldoAtual + valorDeposito;
    }
    public static double sacar(double saldoAtual, double valorSaque) {
        if (saldoAtual < valorSaque){
            System.out.println("Erro: Saldo insuficiente.");
            return saldoAtual;
        }
        return saldoAtual - valorSaque;

    }
}






