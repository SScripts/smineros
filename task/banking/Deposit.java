package smineros.task.banking;

import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;
import smineros.SMinerOS;
import smineros.task.Task;


import java.util.concurrent.Callable;


public class Deposit extends Task {
    public Deposit(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return ctx.bank.opened() && ctx.inventory.select().count() == 28;
    }

    @Override
    public void execute() {
        if (ctx.bank.depositInventory()){
            SMinerOS.status = "Deposit Inventory";
            Condition.wait(new Callable<Boolean>() {
                public Boolean call() throws Exception {
                    return ctx.inventory.select().isEmpty();
                }
            }, 500, 2);
        } else ctx.bank.depositInventory();
        SMinerOS.status = "Deposit Inventory";
    }
}
