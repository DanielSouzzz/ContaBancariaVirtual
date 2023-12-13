package menu.option;
import com.bankapp.account.Account;

import java.util.Scanner;

public class Menu {
    Account conta;


    private double saldoAtual; // Acessa o saldo da conta
    Scanner input = new Scanner(System.in);

    public Menu(Account conta) {
        this.conta = conta;
        saldoAtual = conta.getSaldo(); // método construtor
    }

    public String getMenu() {
        int option = 0;
        String optionsMenu = String.format("""
        Operações
        |------------------------------|
        |  Opção 1 - Consultar saldos  |
        |  Opção 2 - Transferir valor  |
        |  Opção 3 - Receber valor     |
        |  Opção 4 - Sair              |
        |------------------------------|
        Digite uma opção:
        """);
        while (option != 4){
            System.out.println(optionsMenu);
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.printf("Saldo atual: %.2f\n", saldoAtual);
                    break;
                case 2:
                    conta.realizaTransferencia();
                    break;
                case 3:
                    conta.recebeValor();
                    break;
                case 4:
                    conta.saida();
                    break;
                default:
                    System.out.printf("Opção inválida, tente novamente!");
                    break;
            }
        }

        return optionsMenu;
    }
}
