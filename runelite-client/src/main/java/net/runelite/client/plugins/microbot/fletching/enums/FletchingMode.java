package net.runelite.client.plugins.microbot.fletching.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FletchingMode {
    UNSTRUNG("Cutting", "knife", 1),
    STRUNG("Stringing", "bow string", 14),
    PROGRESSIVE("Progressive Logs Cutting", "knife", 1);


    private final String name;
    private final String itemName;
    private final int amount;

    @Override
    public String toString() {
        return name;
    }
}