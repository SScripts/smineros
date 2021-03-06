package smineros.task.walking;

import org.powerbot.script.Tile;
import org.powerbot.script.Area;
import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;
import smineros.SMinerOS;
import smineros.gui.Gui;
import smineros.task.Task;


import java.util.concurrent.Callable;


public class WalkToBank extends Task {
    public WalkToBank(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        final Area bankArea = Gui.loc.getBankAreas();
        return !bankArea.contains(ctx.players.local().tile())
                && ctx.inventory.select().count() == 28
                && !SMinerOS.drop;

    }

    @Override
    public void execute() {
        Tile[] path = Gui.loc.getBankPath();
        ctx.movement.newTilePath(path).randomize(1, 2).traverse();
        SMinerOS.status = "Walking to Bank";
        Condition.wait(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                return ctx.movement.distance(ctx.players.local(), ctx.movement.destination()) < 14;
            }
        }, 250, 20);



    }
}
