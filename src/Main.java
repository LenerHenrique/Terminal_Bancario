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

        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");
        System.out.println("Digite a opção desejada:");
        opcao = scan.nextInt();

        System.out.println("Opção escolhida: " + opcao);
    }
}