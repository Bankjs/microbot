package net.runelite.client.plugins.microbot.example;

import net.runelite.client.plugins.microbot.Microbot;
import net.runelite.client.plugins.microbot.util.npc.Rs2Npc;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.*;

public class ExampleOverlay extends OverlayPanel {
    @Inject
    ExampleOverlay(ExamplePlugin plugin)
    {
        super(plugin);
        setPosition(OverlayPosition.TOP_LEFT);
        setNaughty();
    }
    @Override
    public Dimension render(Graphics2D graphics) {
        try {
            panelComponent.setPreferredSize(new Dimension(200, 300));
            panelComponent.getChildren().add(TitleComponent.builder()
                    .text("Micro Example V" + ExampleScript.version)
                    .color(Color.GREEN)
                    .build());

            panelComponent.getChildren().add(LineComponent.builder().build());

            panelComponent.getChildren().add(LineComponent.builder()
                    .left(Microbot.status)
                    .build());


            if (ExampleScript.npc != null && ExampleScript.npc.getCanvasTilePoly() != null) {
                try {
                    panelComponent.getChildren().add(LineComponent.builder()
                            .left("Health: " + Rs2Npc.getHealth(ExampleScript.npc))
                            .build());
                    panelComponent.getChildren().add(LineComponent.builder()
                            .left("index: " + ExampleScript.npc.getIndex())
                            .build());
                    panelComponent.getChildren().add(LineComponent.builder()
                            .left("Name: " + ExampleScript.npc.getName())
                            .build());
                    panelComponent.getChildren().add(LineComponent.builder()
                            .left("combat: " + ExampleScript.npc.getCombatLevel())
                            .build());
                    graphics.setColor(Color.CYAN);
                    graphics.draw(ExampleScript.npc.getCanvasTilePoly());
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }


        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return super.render(graphics);
    }
}