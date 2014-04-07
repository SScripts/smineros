package smineros.task.walking;

import org.powerbot.script.Area;
import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientContext;
import smineros.SMinerOS;
import smineros.gui.Gui;
import smineros.task.Task;



import java.util.concurrent.Callable;


public class WalkToRock extends Task {
    public WalkToRock(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean activate() {
        final Area rockArea = Gui.loc.getRockAreas();
        return !rockArea.contains(ctx.players.local().tile()) && ctx.inventory.isEmpty();
    }

    @Override
    public void execute() {
        Tile[] path = Gui.loc.getPath();
        ctx.movement.newTilePath(path).traverse();
        SMinerOS.status = "Walking to Mine";

    }
}
