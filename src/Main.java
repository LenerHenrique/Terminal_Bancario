import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nomeCliente = "Lener";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;

        System.out.println("***************************************");
        System.out.println("\nDADOS INICIAIS DO CLIENTE:\n");

        System.out.println("Nome: " + nomeCliente);
        System.out.println("Conta: " + tipoConta);
        System.out.println("Saldo: " + saldoInicial);

        System.out.println("\n***************************************");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("Digite a opção desejada:");
            opcao = scan.nextInt();

            if (opcao == 1){
                System.out.println("O saldo Atual é R$ " +  saldoInicial);
            }
            else if (opcao == 2) {
                System.out.println("Informe o valor a receber: ");
                double valorRecebido = scan.nextDouble();
                saldoInicial += valorRecebido;
                System.out.println("Saldo atualizado R$ " + saldoInicial);
            }
            else if (opcao == 3) {
                System.out.println("Informe o Valor a tranferir:");
                double valorTransferido = scan.nextDouble();
                if (valorTransferido > saldoInicial){
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                }
                else {
                    saldoInicial -= valorTransferido;
                    System.out.println("Saldo atualizado R$ " + saldoInicial);
                }
            }
            else if (opcao != 4) {
                System.out.println("Opção invalida!");
            }

        }
        System.out.println("\nPrograma encerrado. Obrigado por usar nossos serviços!");
    }
}