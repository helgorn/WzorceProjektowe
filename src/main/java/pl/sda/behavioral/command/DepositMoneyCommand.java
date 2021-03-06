package pl.sda.behavioral.command;

public class DepositMoneyCommand implements BankCommand {

    private final BankAccount bankAccount;
    private final int moneyToDeposit;

    DepositMoneyCommand(BankAccount bankAccount, int moneyToDeposit) {
        this.bankAccount = bankAccount;
        this.moneyToDeposit = moneyToDeposit;
    }

    @Override
    public void execute() {
        bankAccount.deposit(moneyToDeposit);
    }

    @Override
    public void undo() {
        bankAccount.withdraw(moneyToDeposit);
    }
}
