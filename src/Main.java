import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Banco banco = new Banco();

        Conta contaPrincipal = new Conta("Lener", TipoConta.CORRENTE, 2500.00, 1001, 12345);
        Conta outraConta = new Conta("Maria Silva", TipoConta.POUPANCA, 5000.00, 1001, 54321);
        banco.adicionarConta(contaPrincipal);
        banco.adicionarConta(outraConta);


        System.out.println("Bem-vindo ao Banco Digital");
        System.out.println("Você está operando a conta de: " + contaPrincipal.getNomeCliente());
        contaPrincipal.exibirExtrato();

        System.out.println("\n***************************************");

        int opcao = 0;

        while (opcao != 5) {
            exibirMenu();
            opcao = scan.nextInt();

          switch (opcao) {
              case 1:
                  contaPrincipal.exibirExtrato();
                  break;
              case 2:
                  System.out.print("Digite o valor a ser depositado: ");
                  double valorDeposito = scan.nextDouble();
                  contaPrincipal.depositar(valorDeposito);
                  break;
              case 3:
                  System.out.print("Informe o valor a sacar: ");
                  double valorSaque = scan.nextDouble();
                  contaPrincipal.sacar(valorSaque);
                  break;
              case 4:
                  System.out.print("Digite o número da conta de destino: ");
                  int numeroContaDestino = scan.nextInt();
                  System.out.print("Digite o valor a ser transferido: ");
                  double valorTransferencia = scan.nextDouble();
                  Conta contaDestino = banco.buscarContaPorNumero(numeroContaDestino);
                  if (contaDestino != null){
                      if (contaDestino.getNumero() == contaPrincipal.getNumero()) {

                          System.out.println("Não é possível transferir para mesma conta.");
                      
                      }
                  } else {
                    contaPrincipal.transferir(valorTransferencia, contaDestino);    
                  }

                  break;
              case 5:
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
        System.out.println("1- Exibir extrato");
        System.out.println("2- Depositar valor");
        System.out.println("3- Sacar valor");
        System.out.println("4- Transferir valor");
        System.out.println("5- Sair");
        System.out.print("\nDigite a opção desejada: ");
    }

}
