package smineros.task.drop;

import org.powerbot.script.Random;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Game;
import org.powerbot.script.rt4.Item;
import smineros.SMinerOS;
import smineros.gui.Gui;
import smineros.task.Task;


public class Drop extends Task {

    public Drop(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        return SMinerOS.drop
                && ctx.inventory.select().count() == 28;
    }

    @Override
    public void execute() {
        final int item = Gui.loc.getOre();

        for (Item i: ctx.inventory.select().id(item)){
            i.interact("Drop");
            SMinerOS.status = "Dropping";
            wait(347);

        }
    }

    public void wait(int ms) {
        try {
            Thread.sleep(Math.max(5, (int) (ms * Random.nextDouble(0.76, 1.45))));
        } catch (InterruptedException ignored) {
        }
    }


}
