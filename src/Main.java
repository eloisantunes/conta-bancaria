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
        }

    }
}