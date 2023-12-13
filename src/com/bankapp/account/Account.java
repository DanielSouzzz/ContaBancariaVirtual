package com.bankapp.account;
import java.util.Scanner;

public class Account {
    Scanner entrada = new Scanner(System.in);
    private double bankBalance = 1000;
    private double values;

    private String name;

    public void setName(String novoNome) {
        this.name = novoNome;
    }
    public double getSaldo() {
        return bankBalance;
    }
    public double getValues() {
        return values;
    }
    public void realizaTransferencia(){
        System.out.println("Informe o valor qur deseja transferir: ");
        values = entrada.nextDouble();
        if (values <= bankBalance){
            bankBalance = bankBalance - values;
            System.out.println("Saldo atualizado: " + bankBalance);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void recebeValor(){
        System.out.println("Informe o valor a receber: ");
        values = entrada.nextDouble();
        if (values >= 0){
            bankBalance = bankBalance + values;
            System.out.println("Saldo atualizado: " + bankBalance);
        }else {
            System.out.println("Operação inválida");
        }
    }

    public void saida() {
        System.out.println("Até logo, " + name);
    }

}
