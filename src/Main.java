import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nomeCliente = "Ana Julia";
        String tipoConta = "Corrente";
        double saldo = 1678.99;
        int opcao = 0;
        String menu;

        System.out.println("############################");
        System.out.println("\nNome do Cliente: " + nomeCliente);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("\n############################");

        menu = """
            # DIGITE SUA OPÇÃO:
            1 - Consultar saldo
            2 - Transferir valor
            3 - Receber valor
            4 - Sair
            """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor para transferência");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atual: R$ " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: R$ ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atual: R$ " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}