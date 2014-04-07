package smineros.task.banking;

import org.powerbot.script.Area;
import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.GameObject;
import smineros.gui.Gui;
import smineros.SMinerOS;
import smineros.task.Task;

import java.util.concurrent.Callable;


public class OpenBank extends Task {

    public OpenBank(ClientContext ctx) {
        super(ctx);
    }


    @Override
    public boolean activate() {
        final Area bankArea = Gui.loc.getBankAreas();
        return bankArea.contains(ctx.players.local().tile()) && ctx.inventory.select().count() == 28 && !ctx.bank.opened();
    }

    @Override
    public void execute() {

        GameObject bank = ctx.objects.id(Gui.loc.getBank()).nearest().limit(2).shuffle().poll();
        if (ctx.bank.opened()){
            SMinerOS.status = "Banking";
        } else if (bank.inViewport() && !ctx.bank.opened()){
            bank.interact("Bank");
            SMinerOS.status = "Opening Bank";
            Condition.wait(new Callable<Boolean>() {

                @Override
                public Boolean call() throws Exception {
                    if (ctx.bank.opened())
                        return true;
                    return false;
                }
            });
        } else ctx.camera.turnTo(bank);
    }
}
