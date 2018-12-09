package pl.sda.behavioral.command;

import java.util.Random;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        CashMachine cashMachine = new CashMachine();
        Random random = new Random();
        for(int i=0;i<10;i++){
            DepositMoneyCommand depositMoneyCommand = new DepositMoneyCommand(bankAccount, random.nextInt(100));
            WithdrawMoneyCommand withdrawMoneyCommand = new WithdrawMoneyCommand(bankAccount, random.nextInt(100));
            cashMachine.takeCommand(depositMoneyCommand);
            cashMachine.takeCommand(withdrawMoneyCommand);
            cashMachine.takeCommand(withdrawMoneyCommand);
            cashMachine.placeCommand();
            System.out.println(bankAccount.getBalance());
        }
        cashMachine.undo();
        System.out.println(bankAccount.getBalance());
    }
}
