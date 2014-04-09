package smineros;

import org.powerbot.script.PaintListener;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt4.ClientContext;
import smineros.gui.Gui;
import smineros.task.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.*;
import java.util.List;

@Script.Manifest(description = "OS Miner, Mines at some Locations", name = "SMiner OS", properties = "topic=0;client=4;")

public class SMinerOS extends PollingScript<org.powerbot.script.rt4.ClientContext> implements PaintListener {

    public List<Task> tasks = Collections.synchronizedList(new ArrayList<Task>());


    public static boolean drop = false;

    public static String status = "Waiting for input";


    @Override
    public void start() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui(ctx, tasks);
            }
        });
    }


    @Override
    public void poll() {

        synchronized(tasks) {
            if (tasks.size() == 0) {
                try {
                    tasks.wait();
                } catch (InterruptedException ignored) {}
            }
        }

        for (Task task : tasks) {
            if (task.activate()) {
                task.execute();
            }
        }

    }





    public String formatTime(final long time) {
        final int sec = (int) (time / 1000), h = sec / 3600, m = sec / 60 % 60, s = sec % 60;
        return (h < 10 ? "0" + h : h) + ":" + (m < 10 ? "0" + m : m) + ":" + (s < 10 ? "0" + s : s);
    }



    @Override
    public void repaint(Graphics g) {

      
    	g.drawString("Status:" + status, 10, 100);
        g.drawString("Runtime:" + formatTime(getTotalRuntime()), 10, 120);
        g.setColor(Color.WHITE);
        g.drawLine(ctx.mouse.getLocation().x, ctx.mouse.getLocation().y - 10, ctx.mouse.getLocation().x, ctx.mouse.getLocation().y + 10);
        g.drawLine(ctx.mouse.getLocation().x - 10, ctx.mouse.getLocation().y, ctx.mouse.getLocation().x + 10, ctx.mouse.getLocation().y);
    }


}
