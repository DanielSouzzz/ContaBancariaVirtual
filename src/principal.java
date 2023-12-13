import com.bankapp.account.Account;
import menu.option.Menu;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Account contaClient = new Account();
        Menu menuzinho = new Menu(contaClient);

        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome: ");
        String name = input.next();
        String nameFormatado = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase(); // Formata o nome
        System.out.printf("Bem vindo, %s!\nDigite seu tipo de conta: ", nameFormatado);
        String accountType = input.next();

        double bankBalance = contaClient.getSaldo(); // Acessa o saldo inicial
        contaClient.setName(nameFormatado);

        String bankData = String.format("""
        ***********************        
        Dados iniciais do cliente:
        --------------------------
        Nome: %s
        Tipo conta: %s
        Saldo inicial: %.2f
        ***********************
                """, name, accountType,bankBalance);
        System.out.println(bankData);

        menuzinho.getMenu();
    }
}
