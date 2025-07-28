import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Conta conta = new Conta("Lener", "Corrente", 2500.00)




        System.out.println("***************************************");
        System.out.println("\nDADOS INICIAIS DO CLIENTE:\n");

        System.out.println("Nome: " + conta.getNomeCliente());
        System.out.println("Conta: " + conta.getTipoConta());

        conta.consultarSaldo();
        System.out.println("\n***************************************");

        int opcao = 0;

        while (opcao != 4) {
            exibirMenu();
            opcao = scan.nextInt();

          switch (opcao) {
              case 1:
                  conta.consultarSaldo();
                  break;
              case 2:
                  System.out.print("Digite o valor a ser depositado: ");
                  double valorDeposito = scan.nextDouble();
                  conta.depositar(valorDeposito);
                  break;
              case 3:
                  System.out.print("Informe o valor a sacar: ");
                  double valorSaque = scan.nextDouble();
                  conta.sacar(valorSaque);
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

}






