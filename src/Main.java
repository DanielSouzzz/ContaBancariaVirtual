import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome: ");
        String name = input.next();
        System.out.println("Agora digite seu tipo de conta: ");
        String typeAccount = input.next();
        int option = 0;

        double bankBalance = 1500.00;

        String bankData = String.format("""
        ***********************        
        Dados iniciais do cliente:
        --------------------------
        Nome: %s
        Tipo conta: %s
        Saldo inicial: %.2f
        ***********************
                """, name, typeAccount,bankBalance);
        System.out.println(bankData);

        System.out.println("Operações");
        String optionsMenu = String.format("""
        |------------------------------|
        |  Opção 1 - Consultar saldos  |
        |  Opção 2 - Transferir valor  |
        |  Opção 3 - Receber valor     |
        |  Opção 4 - Sair              |
        |------------------------------|
        Digite uma opção:
        """);

        while (option != 4) {
            System.out.println(optionsMenu);
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.printf("Saldo: " + bankBalance + "\n");
                    break;
                case 2:
                    System.out.printf("Informe o valor que deseja transferir: ");
                    double valueToTransfer = input.nextDouble();
                    if (valueToTransfer <= bankBalance) {
                        bankBalance = bankBalance - valueToTransfer;
                        System.out.println("Saldo atualizado: " + bankBalance);
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Informe o valor a receber: ");
                    double amountReceived = input.nextDouble();
                    if (amountReceived >= 0) {
                        bankBalance = bankBalance + amountReceived;
                        System.out.println("Saldo atualizado: " + bankBalance);
                    } else {
                        System.out.println("Operação inválida");
                    }
                    break;
                case 4:
                    System.out.printf("Até logo!");
                    break;
                default:
                    System.out.printf("Opção inválida, tente novamente!");
                    break;
            }
        }
        input.close();
    }
}