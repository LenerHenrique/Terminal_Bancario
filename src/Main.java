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

    }
}