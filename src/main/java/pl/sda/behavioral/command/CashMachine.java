package pl.sda.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {

    private List<BankCommand> bankCommandList = new ArrayList<>();

    public void takeCommand(BankCommand bankCommand) {
        bankCommandList.add(bankCommand);
    }

    public void undo() {
        for (BankCommand bankCommand : bankCommandList) {
            bankCommand.execute();
        }
    }

    public void placeCommand() {
        for (BankCommand bankCommand : bankCommandList) {
            bankCommand.execute();
        }
    }
}
