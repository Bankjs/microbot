package net.runelite.client.plugins.microbot.util.globval;

import java.util.HashMap;
import java.util.Map;

public enum VarbitValues {
    // Weapon Type
    WEAPON_TYPE_UNARMED(0),
    WEAPON_TYPE_AXE(1),
    WEAPON_TYPE_BLUNT(2),
    WEAPON_TYPE_BOW(3),
    WEAPON_TYPE_CLAW(4),
    WEAPON_TYPE_CROSSBOW(5),
    WEAPON_TYPE_SALAMANDER(6),
    WEAPON_TYPE_CHINCHOMPAS(7),
    WEAPON_TYPE_UNKNOWN_8(8),
    WEAPON_TYPE_SLASH_SWORD(9),
    WEAPON_TYPE_TWO_HANDED_SWORD(10),
    WEAPON_TYPE_PICKAXE(11),
    WEAPON_TYPE_POLEARM(12),
    WEAPON_TYPE_UNKNOWN_13(13),
    WEAPON_TYPE_SCYTHE(14),
    WEAPON_TYPE_SPEAR(15),
    WEAPON_TYPE_SPIKED(16),
    WEAPON_TYPE_STAB_SWORD(17),
    WEAPON_TYPE_STAFF(18),
    WEAPON_TYPE_THROWN(19),
    WEAPON_TYPE_WHIP(20),
    WEAPON_TYPE_BLADED_STAFF(21),
    WEAPON_TYPE_UNKNOWN_22(22),
    WEAPON_TYPE_POWERED_STAFF(23),
    WEAPON_TYPE_BANNER(24),
    WEAPON_TYPE_UNKNOWN_25(25),
    WEAPON_TYPE_BLUDGEON(26),
    WEAPON_TYPE_BULWARK(27),
    // Rune Pouch Amount
    RUNE_POUCH_AMOUNT_MIN(0),
    RUNE_POUCH_AMOUNT_MAX(16000),
    // Motherlode Mine Z Plane
    MOTHERLODE_MINE_UPPER_FLOOR(1),
    MOTHERLODE_MINE_GROUND_FLOOR(0),
    // Quest goblin diplomacy
    QUEST_GOBLIN_DIPLOMACY_NOT_STARTED(0),
    QUEST_GOBLIN_DIPLOMACY_STARTED(3),
    QUEST_GOBLIN_DIPLOMACY_ORANGE_ARMOR_GIVEN(4),
    QUEST_GOBLIN_DIPLOMACY_BLUE_ARMOR_GIVEN(5),
    QUEST_GOBLIN_DIPLOMACY_FINISHED(6),
    // Quest demon slayer
    QUEST_DEMON_SLAYER_NOT_STARTED(0),
    QUEST_DEMON_SLAYER_STARTED(1),
    QUEST_DEMON_SLAYER_TALKED_TO_PRYSIN(2),
    QUEST_DEMON_SLAYER_FINISHED(3),
    // Defensive Autocast
    DEFENSIVE_AUTOCAST_DISABLED(0),
    DEFENSIVE_AUTOCAST_ENABLED(1),
    // Quest misthalin mystery
    QUEST_MISTHALIN_MYSTERY_NOT_STARTED(0),
    QUEST_MISTHALIN_MYSTERY_STARTED(5),
    QUEST_MISTHALIN_MYSTERY_ABIGALE_TOLD_WHAT_TO_DO(10),
    QUEST_MISTHALIN_MYSTERY_WALKED_PAST_FOUNTAIN(15),
    QUEST_MISTHALIN_MYSTERY_KILLER_WALKED_AWAY_FROM_SID(20),
    QUEST_MISTHALIN_MYSTERY_WATER_TAKEN_FROM_BARREL(25),
    QUEST_MISTHALIN_MYSTERY_ENTERED_MANOR(30),
    QUEST_MISTHALIN_MYSTERY_TAYTEN_SLASHED(35),
    QUEST_MISTHALIN_MYSTERY_NOTE_RED(40),
    QUEST_MISTHALIN_MYSTERY_PAINTING_SLASHED(45),
    QUEST_MISTHALIN_MYSTERY_ROOM_WITH_CANDLES_ENTERED(50),
    QUEST_MISTHALIN_MYSTERY_CANDLES_LIT(55),
    QUEST_MISTHALIN_MYSTERY_EXPLOSIVE_BARREL_LIT(60),
    QUEST_MISTHALIN_MYSTERY_BARREL_EXPLODED(65),
    QUEST_MISTHALIN_MYSTERY_LACEY_SLASHED(70),
    QUEST_MISTHALIN_MYSTERY_SECOND_NOTE_RED(75),
    QUEST_MISTHALIN_MYSTERY_DEAD_PLAYED_ON_PIANO(80),
    QUEST_MISTHALIN_MYSTERY_OPENED_GREEN_KNOB_DOORS(85),
    QUEST_MISTHALIN_MYSTERY_MANDY_SLASHED(90),
    QUEST_MISTHALIN_MYSTERY_THIRD_NODE_RED(95),
    QUEST_MISTHALIN_MYSTERY_KNIFE_USED_ON_FIREPLACE(100),
    QUEST_MISTHALIN_MYSTERY_GEMSTONE_SWITCH_CONFIGURED(105),
    QUEST_MISTHALIN_MYSTERY_BLUE_KNOB_DOOR_OPENED(110),
    QUEST_MISTHALIN_MYSTERY_KILLER_HID_IN_WARDROBE(111),
    QUEST_MISTHALIN_MYSTERY_KILLER_HURT(115),
    QUEST_MISTHALIN_MYSTERY_CUTSCENE_ENDED(120),
    QUEST_MISTHALIN_MYSTERY_ABIGALE_SLASHED(125),
    QUEST_MISTHALIN_MYSTERY_MANDY_KILLED_ABIGALE(130),
    QUEST_MISTHALIN_MYSTERY_FINISHED(135),
    // Bank Always Set Placeholders
    BANK_ALWAYS_SET_PLACEHOLDERS_DISABLED(0),
    BANK_ALWAYS_SET_PLACEHOLDERS_ENABLED(1),
    // Bank Withdraw Mode
    BANK_WITHDRAW_MODE_ITEM(0),
    BANK_WITHDRAW_MODE_NOTE(1),
    // Bank Rearrange Mode
    BANK_REARRANGE_MODE_SWAP(0),
    BANK_REARRANGE_MODE_INSERT(1),
    // Fairy Ring Dial ABCD
    FAIRY_RING_LEFT_DIAL_A(0),
    FAIRY_RING_LEFT_DIAL_B(1),
    FAIRY_RING_LEFT_DIAL_C(2),
    FAIRY_RING_LEFT_DIAL_D(3),
    // Fairy Ring Dial ILJK
    FAIRY_RING_MIDDLE_DIAL_I(0),
    FAIRY_RING_MIDDLE_DIAL_J(1),
    FAIRY_RING_MIDDLE_DIAL_K(2),
    FAIRY_RING_MIDDLE_DIAL_L(3),
    // Fairy Ring Dial PSRQ
    FAIRY_RING_RIGHT_DIAL_P(0),
    FAIRY_RING_RIGHT_DIAL_S(1),
    FAIRY_RING_RIGHT_DIAL_R(2),
    FAIRY_RING_RIGHT_DIAL_Q(3),
    // Quick Prayer
    QUICK_PRAYER_DISABLED(0),
    QUICK_PRAYER_ENABLED(1),
    // Prayers
    PRAYER_THICK_SKIN_INACTIVE(0),
    PRAYER_THICK_SKIN_ACTIVE(1),
    PRAYER_BURST_OF_STRENGTH_INACTIVE(0),
    PRAYER_BURST_OF_STRENGTH_ACTIVE(1),
    PRAYER_CLARITY_OF_THOUGHT_INACTIVE(0),
    PRAYER_CLARITY_OF_THOUGHT_ACTIVE(1),
    PRAYER_ROCK_SKIN_INACTIVE(0),
    PRAYER_ROCK_SKIN_ACTIVE(1),
    PRAYER_SUPERHUMAN_STRENGTH_INACTIVE(0),
    PRAYER_SUPERHUMAN_STRENGTH_ACTIVE(1),
    PRAYER_IMPROVED_REFLEXES_INACTIVE(0),
    PRAYER_IMPROVED_REFLEXES_ACTIVE(1),
    PRAYER_RAPID_RESTORE_INACTIVE(0),
    PRAYER_RAPID_RESTORE_ACTIVE(1),
    PRAYER_RAPID_HEAL_INACTIVE(0),
    PRAYER_RAPID_HEAL_ACTIVE(1),
    PRAYER_PROTECT_ITEM_INACTIVE(0),
    PRAYER_PROTECT_ITEM_ACTIVE(1),
    PRAYER_STEEL_SKIN_INACTIVE(0),
    PRAYER_STEEL_SKIN_ACTIVE(1),
    PRAYER_ULTIMATE_STRENGTH_INACTIVE(0),
    PRAYER_ULTIMATE_STRENGTH_ACTIVE(1),
    PRAYER_INCREDIBLE_REFLEXES_INACTIVE(0),
    PRAYER_INCREDIBLE_REFLEXES_ACTIVE(1),
    PRAYER_PROTECT_FROM_MAGIC_INACTIVE(0),
    PRAYER_PROTECT_FROM_MAGIC_ACTIVE(1),
    PRAYER_PROTECT_FROM_MISSILES_INACTIVE(0),
    PRAYER_PROTECT_FROM_MISSILES_ACTIVE(1),
    PRAYER_PROTECT_FROM_MELEE_INACTIVE(0),
    PRAYER_PROTECT_FROM_MELEE_ACTIVE(1),
    PRAYER_RETRIBUTION_INACTIVE(0),
    PRAYER_RETRIBUTION_ACTIVE(1),
    PRAYER_REDEMPTION_INACTIVE(0),
    PRAYER_REDEMPTION_ACTIVE(1),
    PRAYER_SMITE_INACTIVE(0),
    PRAYER_SMITE_ACTIVE(1),
    PRAYER_SHARP_EYE_INACTIVE(0),
    PRAYER_SHARP_EYE_ACTIVE(1),
    PRAYER_MYSTIC_WILL_INACTIVE(0),
    PRAYER_MYSTIC_WILL_ACTIVE(1),
    PRAYER_HAWK_EYE_INACTIVE(0),
    PRAYER_HAWK_EYE_ACTIVE(1),
    PRAYER_MYSTIC_LORE_INACTIVE(0),
    PRAYER_MYSTIC_LORE_ACTIVE(1),
    PRAYER_EAGLE_EYE_INACTIVE(0),
    PRAYER_EAGLE_EYE_ACTIVE(1),
    PRAYER_MYSTIC_MIGHT_INACTIVE(0),
    PRAYER_MYSTIC_MIGHT_ACTIVE(1),
    PRAYER_CHIVALRY_INACTIVE(0),
    PRAYER_CHIVALRY_ACTIVE(1),
    PRAYER_PIETY_INACTIVE(0),
    PRAYER_PIETY_ACTIVE(1),
    PRAYER_PROTECT_FROM_MAGIC_OVERHEAD_INACTIVE(0),
    PRAYER_PROTECT_FROM_MAGIC_OVERHEAD_ACTIVE(1),
    PRAYER_PROTECT_FROM_MISSILES_OVERHEAD_INACTIVE(0),
    PRAYER_PROTECT_FROM_MISSILES_OVERHEAD_ACTIVE(1),
    PRAYER_PROTECT_FROM_MELEE_OVERHEAD_INACTIVE(0),
    PRAYER_PROTECT_FROM_MELEE_OVERHEAD_ACTIVE(1),
    // Bank Active Tab
    BANK_ACTIVE_TAB_FIRST(0),
    BANK_ACTIVE_TAB_SECOND(1),
    BANK_ACTIVE_TAB_THIRD(2),
    BANK_ACTIVE_TAB_FOURTH(3),
    BANK_ACTIVE_TAB_FIFTH(4),
    BANK_ACTIVE_TAB_SIXTH(5),
    BANK_ACTIVE_TAB_SEVENTH(6),
    BANK_ACTIVE_TAB_EIGHT(7),
    BANK_ACTIVE_TAB_NINTH(8),
    // Bank Tab Display Style
    BANK_TAB_DISPLAY_STYLE_ITEM(0),
    BANK_TAB_DISPLAY_STYLE_DIGIT(1),
    BANK_TAB_DISPLAY_STYLE_ROMAN_NUMERAL(2),
    BANK_TAB_DISPLAY_STYLE_HIDDEN(3),
    // Grand exchange offer type
    GE_OFFER_TYPE_BUY(0),
    GE_OFFER_TYPE_SELL(1),
    // Deposit Box Deposit Amount
    DEPOSIT_BOX_DEPOSIT_AMOUNT_1(0),
    DEPOSIT_BOX_DEPOSIT_AMOUNT_5(1),
    DEPOSIT_BOX_DEPOSIT_AMOUNT_10(2),
    DEPOSIT_BOX_DEPOSIT_AMOUNT_X(3),
    DEPOSIT_BOX_DEPOSIT_AMOUNT_ALL(4),
    // Grand exchange offer slot open
    GE_OFFER_NONE_SLOT_OPEN(0),
    GE_OFFER_FIRST_SLOT_OPEN(1),
    GE_OFFER_SECOND_SLOT_OPEN(2),
    GE_OFFER_THIRD_SLOT_OPEN(3),
    GE_OFFER_FOURTH_SLOT_OPEN(4),
    GE_OFFER_FIFTH_SLOT_OPEN(5),
    GE_OFFER_SIXTH_SLOT_OPEN(6),
    GE_OFFER_SEVENTH_SLOT_OPEN(7),
    GE_OFFER_EIGHT_SLOT_OPEN(8),
    // Multicombat zone
    OUTSIDE_MULTICOMBAT_ZONE(0),
    INSIDE_MULTICOMBAT_ZONE(1),
    // XP Drops
    XP_DROPS_HIDDEN(0),
    XP_DROPS_SHOWN(1),
    // Bank Show Incinerator
    BANK_INCINERATOR_HIDDEN(0),
    BANK_INCINERATOR_SHOWN(1),
    // Deposit Worn Items
    BANK_DEPOSIT_WORN_ITEMS_SHOWN(0),
    BANK_DEPOSIT_WORN_ITEMS_HIDDEN(1),
    // TODO: FAIRY_RING_LAST_DESTINATION
    // Motherlode Mine Sack Size
    MOTHERLODE_MINE_SACK_EMPTY(0),
    MOTHERLODE_MINE_SACK_NOT_UPGRADED_MAX_QUANT(108),
    MOTHERLODE_MINE_SACK_UPGRADED_MAX_QUANT(189),
    MOTHERLODE_MINE_SACK_TECHNICAL_MAX_QUANT(255),
    // Wildneress zone
    WILDNERESS_ZONE_OUTSIDE(0),
    WILDNERESS_ZONE_INSIDE(1),
    // Chatbox Interface Size
    CHATBOX_INTERFACE_SMALLER(0), // Note: A NPC head is speaking.
    CHATBOX_INTERFACE_BIGGER(1), // Note: Dialog options are present, this can be also just one option "Click here to continue"
    // Quest corsair curse
    QUEST_CORSAIR_CURSE_NOT_STARTED(0),
    QUEST_CORSAIR_CURSE_STARTED(5),
    QUEST_CORSAIR_CURSE_CAPTAIN_WENT_RIMMINGTON(10),
    QUEST_CORSAIR_CURSE_SAILED_TO_DESTINATION(15),
    QUEST_CORSAIR_CURSE_CURSE_STORIES_DISPELLED(20),
    QUEST_CORSAIR_CURSE_CAPTAIN_INFORMED(25),
    QUEST_CORSAIR_CURSE_GNOCI_COOK_INFORMED(30),
    QUEST_CORSAIR_CURSE_ARESEN_THIEF_INFORMED(35),
    QUEST_CORSAIR_CURSE_ITHOI_SUSPICION_INFORMED(40),
    QUEST_CORSAIR_CURSE_ITHOI_ACCUSED_OF_CURSE(45),
    QUEST_CORSAIR_CURSE_TINDERBOX_USED(49),
    QUEST_CORSAIR_CURSE_ITHOI_CAST_WATER_SPELL(50),
    QUEST_CORSAIR_CURSE_CAPTAIN_INFORMED_OF_ITHOI(52),
    QUEST_CORSAIR_CURSE_ITHOI_KILLED(55),
    QUEST_CORSAIR_CURSE_FINISHED(60),
    // Curse of cabin boy colin sub-stages
    CABIN_BOY_COLIN_NOT_SPOKEN_TO(0),
    CABIN_BOY_COLIN_SPOKEN_TO(1),
    CABIN_BOY_COLIN_TELESCOPE_USED(2),
    CABIN_BOY_COLIN_NOT_CURSED_MERMAID_AN_OGRE(3),
    // Curse of gnocci cook sub-stages
    GNOCCI_COOK_NOT_SPOKEN_TO(0),
    GNOCCI_COOK_SPOKEN_TO(1),
    GNOCCI_COOK_DUG_IN_SAND(2),
    GNOCCI_COOK_NOT_CURSED_DOLL_CLOCKWORK(3),
    // Curse of arsen thief sub-stages
    ARSEN_THIEF_NOT_SPOKEN_TO(0),
    ARSEN_THIEF_SPOKEN_TO(1),
    ARSEN_THIEF_GET_RELIC(2),
    ARSEN_THIEF_RELIC_GAINED(3),
    ARSEN_THIEF_RELIC_GIVEN_TESS(4),
    ARSEN_THIEF_TESS_SAID_NOT_RELIC(5),
    ARSEN_THIEF_INFORMED_NOT_CURSED(6),
    // Curse of ithoi navigator sub-stages
    ITHOI_NAVIGATOR_NOT_SPOKEN_TO(0),
    ITHOI_NAVIGATOR_SPOKEN_TO(1),
    // Mouse Wheel Zoom
    MOUSE_WHEEL_ZOOM_ENABLED(0),
    MOUSE_WHEEL_ZOOM_DISABLED(1),
    // Bank Withdraw Quantity
    BANK_WITHDRAW_QUANTITY_ONE(0),
    BANK_WITHDRAW_QUANTITY_FIVE(1),
    BANK_WITHDRAW_QUANTITY_TEN(2),
    BANK_WITHDRAW_QUANTITY_X(3),
    BANK_WITHDRAW_QUANTITY_ALL(4),
    // Magic Filter
    MAGIC_FILTER_COMBAT_SPELLS_SHOWN(0),
    MAGIC_FILTER_COMBAT_SPELLS_HIDDEN(1),
    MAGIC_FILTER_UTILITY_SPELLS_SHOWN(0),
    MAGIC_FILTER_UTILITY_SPELLS_HIDDEN(1),
    MAGIC_FILTER_NO_LEVEL_SPELLS_SHOWN(0),
    MAGIC_FILTER_NO_LEVEL_SPELLS_HIDDEN(1),
    MAGIC_FILTER_NO_RUNES_SPELLS_SHOWN(0),
    MAGIC_FILTER_NO_RUNES_SPELLS_HIDDEN(1),
    MAGIC_FILTER_TELEPORT_SPELLS_SHOWN(0),
    MAGIC_FILTER_TELEPORT_SPELLS_HIDDEN(1),
    // Quest x marks the spot
    QUEST_X_MARKS_THE_SPOT_NOT_STARTED(0),
    QUEST_X_MARKS_THE_SPOT_STARTED(1),
    QUEST_X_MARKS_THE_SPOT_VEOS_GAVE_SCROLL(2),
    QUEST_X_MARKS_THE_SPOT_FIRST_DIG_DONE(3),
    QUEST_X_MARKS_THE_SPOT_SECOND_DIG_DONE(4),
    QUEST_X_MARKS_THE_SPOT_THIRD_DIG_DONE(5),
    QUEST_X_MARKS_THE_SPOT_FOURTH_DIG_DONE(6),
    QUEST_X_MARKS_THE_SPOT_VEOS_TOOK_TREASURE(7),
    QUEST_X_MARKS_THE_SPOT_FINISHED(8),
    // PvP spec orb
    PVP_SPEC_ORB_DISABLED(0),
    PVP_SPEC_ORB_ENABLED(1),
    // Tab Quest Subtabs
    TAB_QUEST_SUBTAB_CHARACTER_SUMMARY(0),
    TAB_QUEST_SUBTAB_QUEST_LIST(1),
    TAB_QUEST_SUBTAB_MINIGAME_GROUP_FINDER(2),
    TAB_QUEST_SUBTAB_ACHIEVEMENT_DIARY(3),
    TAB_QUEST_SUBTAB_KOUREND_FAVOR(4),
    TAB_QUEST_SUBTAB_LEAGUES(5),
    // Bank Deposit Inventory
    BANK_DEPOSIT_INVENTORY_SHOWN(0),
    BANK_DEPOSIT_INVENTORY_HIDDEN(1),
    // Tab Settings Subtabs
    TAB_SETTINGS_SUBTAB_CONTROLLS(0),
    TAB_SETTINGS_SUBTAB_AUDIO(1),
    TAB_SETTINGS_SUBTAB_DISPLAY(2),
    // Tab Account Management Subtabs
    TAB_ACC_MANAGEMENT_SUBTAB_ACCOUNT(0),
    TAB_ACC_MANAGEMENT_SUBTAB_COMMUNITY(1),
    TAB_ACC_MANAGEMENT_SUBTAB_LINKS(2),
    // Bank Inventory Options
    BANK_INVENTORY_OPTIONS_SHOWN(0),
    BANK_INVENTORY_OPTIONS_HIDDEN(1),
    // Bank Tutorial Progress
    BANK_TUTORIAL_PROGRESS_FIRST_FRAME(0),
    BANK_TUTORIAL_PROGRESS_LAST_FRAME(13),
    // Bank Show Tutorial
    BANK_TUTORIAL_SHOWN(0),
    BANK_TUTORIAL_HIDDEN(1),
    // Quest below ice mountain
    QUEST_BELOW_ICE_MOUNTAIN_NOT_STARTED(0),
    QUEST_BELOW_ICE_MOUNTAIN_STARTED(5),
    QUEST_BELOW_ICE_MOUNTAIN_DIG_WENT_WRONG_DIALOG(7),
    QUEST_BELOW_ICE_MOUNTAIN_FIND_STRONGMAN_DIALOG(10),
    QUEST_BELOW_ICE_MOUNTAIN_FLEX_EMOTE_SHOWN(15),
    QUEST_BELOW_ICE_MOUNTAIN_TEAM_GATHERED(20),
    QUEST_BELOW_ICE_MOUNTAIN_TALKED_TO_WILLOW_AT_GATE(25),
    QUEST_BELOW_ICE_MOUNTAIN_TRAPS_DISARMED(30),
    QUEST_BELOW_ICE_MOUNTAIN_GOLEM_AWOKE(35),
    QUEST_BELOW_ICE_MOUNTAIN_GOLEM_SLAIN(40),
    QUEST_BELOW_ICE_MOUNTAIN_FINISHED(120),
    // Marley sub-stages
    MARLEY_NOT_STARTED(0),
    MARLEY_STARTED(2),
    // TODO: Marley sub-stages 10,35
    MARLEY_BEEF_SANDWICH_GIVEN_AT_EDGE(40),
    MARLEY_TRAPS_DISARMED(45),
    MARLEY_GOLEM_AWOKE(50),
    // Checkal sub-stages
    CHECKAL_NOT_STARTED(0),
    // TODO: Checkal sub-stages
    CHECKAL_TRAPS_DISARMED(45),
    CHECKAL_GOLEM_AWOKE(50),
    // Burntof sub-stages
    BURNTOF_NOT_STARTED(0),
    BURNTOF_STARTED(5),
    BURNTOF_BEER_GIVEN(10),
    BURNTOF_INVITED_FOR_GAME(15),
    BURNTOF_WON_GAME(40),
    BURNTOF_TRAPS_DISARMED(45),
    BURNTOF_GOLEM_AWOKE(50),
    // Ruins of camdozaal
    RUINS_OF_CAMDOZAAL_NOT_ENTERED(0),
    RUINS_OF_CAMDOZAAL_ENTERED(1),
    // Ramarno stages, likely progress towards barronite mace
    RAMARNO_NOT_TALKED_TO(0),
    RAMARNO_TALKED_TO(1),
    RAMARNO_EXPLAINED_FORGE(2),
    // Magic Filter Lackign Requirements
    MAGIC_FILTER_LACKING_REQUIREMENTS_SPELLS_SHOWN(0),
    MAGIC_FILTER_LACKING_REQUIREMENTS_SPELLS_HIDDEN(1),
    // Hide roofs
    ROOFS_SHOWN(0),
    ROOFS_HIDDEN(1),
    // Tab Chat Channel Subtabs
    TAB_CHAT_CHANNEL_SUBTAB_CHAT_CHANNEL(0),
    TAB_CHAT_CHANNEL_SUBTAB_YOUR_CLAN(1),
    TAB_CHAT_CHANNEL_SUBTAB_VIEW_ANOTHER_CLAN(2),
    TAB_CHAT_CHANNEL_SUBTAB_GROUPING(3);

    // cache values on load
    private static final Map<Object, Object> hashMap = new HashMap<>();
    static {
        for (VarbitValues varbitEnum : VarbitValues.values()) {
            hashMap.put(varbitEnum.value, varbitEnum);
        }
    }

    private final int value;

    VarbitValues(int value) {
        this.value = value;
    }

    public static VarbitValues valueOf(int varbitEnum) {
        return (VarbitValues) hashMap.get(varbitEnum);
    }

    public int getValue() {
        return value;
    }
}