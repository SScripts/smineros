package smineros.task.mining;

import org.powerbot.script.Area;
import org.powerbot.script.Condition;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.GameObject;
import smineros.SMinerOS;
import smineros.gui.Gui;
import smineros.task.Task;


import java.util.concurrent.Callable;


public class Mine extends Task {

    public Mine(ClientContext ctx) {
        super(ctx);
    }


    private int[] rock;

    @Override
    public boolean activate() {
        rock = Gui.loc.getRock();
        final Area rockArea = Gui.loc.getRockAreas();
        return ctx.inventory.select().count() <28
                && ctx.players.local().animation() == -1
                && rockArea.contains(ctx.players.local().tile());

    }

    @Override
    public void execute() {
        rock = Gui.loc.getRock();
        final Area rockArea = Gui.loc.getRockAreas();
        final GameObject Rock = ctx.objects.select().id(rock).nearest().first().poll();
        if (Rock.inViewport()
                && ctx.players.local().animation() == -1
                && rockArea.contains(Rock)
                && !ctx.players.local().inMotion()){
            Rock.interact("Mine");
            SMinerOS.status = "Mining";
            Condition.wait(new Callable<Boolean>() {
                public Boolean call() throws Exception {
                    return ctx.players.local().animation() == -1;
                }
            }, 1000, 2);
        }else {
            ctx.camera.turnTo(Rock);
            SMinerOS.status = "Looking for Rock";
            Condition.wait(new Callable<Boolean>() {
                public Boolean call() throws Exception {
                    return Rock.inViewport();
                }
            }, 500, 2);
        }
    }
}
