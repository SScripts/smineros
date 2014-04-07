package smineros.task.banking;

import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.Condition;
import smineros.SMinerOS;
import smineros.task.Task;


import java.util.concurrent.Callable;


public class CloseBank extends Task {


    public CloseBank(ClientContext ctx) {
        super(ctx);
    }


    @Override
    public boolean activate() {
        return ctx.bank.opened() && ctx.inventory.select().isEmpty();
    }

    @Override
    public void execute() {
        if (ctx.bank.close()){
            SMinerOS.status = "Closing Bank";
            Condition.wait(new Callable<Boolean>() {
                public Boolean call() throws Exception {
                    return !ctx.bank.opened();
                }
            }, 500, 2);
        }else ctx.bank.close();
        SMinerOS.status = "Closing Bank";
    }


}
