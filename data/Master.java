package smineros.data;

import org.powerbot.script.Area;
import org.powerbot.script.Tile;


public enum Master {


    VARROCK_TIN(Path.VAR, Rock.TIN, Areas.VARO, Bank.BOVAR);
 /*   VARROCK_IRON(Path.VAR, Rock.IRON, Areas.VARO, Bank.BOVAR),
    VARROCK_CLAY(Path.VAR, Rock.CLAY, Areas.VARO, Bank.BOVAR),
    VARROCK_SILVER(Path.VAR, Rock.SILVER, Areas.VARO, Bank.BOVAR),
    BARBARIAN_VILLAGE_COAL(Path.BAR, Rock.COAL, Areas.BARB, Bank.BOEDG),
    BARBARIAN_VILLAGE_TIN(Path.BAR, Rock.TIN, Areas.BARB, Bank.BOEDG),
    AL_KHARID_IRON_FIRST_SPOT(Path.ALK_ONE, Rock.IRON, Areas.AHLK_ONE, Bank.BOALK),
    AL_KHARID_IRON_SECOUND_SPOT(Path.ALK_TWO, Rock.IRON,Areas.AHLK_TWO, Bank.BOALK),
    AL_KHARID_IRON_THIRD_SPOT(Path.ALK_THR, Rock.IRON, Areas.AHLK_THREE, Bank.BOALK),
    AL_KHARID_GOLD(Path.ALK_ONE, Rock.GOLD, Areas.AHLK_ONE, Bank.BOALK),
    AL_KHARID_COAL(Path.ALK_TWO, Rock.COAL, Areas.AHLK_TWO, Bank.BOALK),
    AL_KHARID_MITHRIL(Path.ALK_TWO, Rock.MITHRIL, Areas.AHLK_TWO, Bank.BOALK),
    AL_KHARID_SILVER(Path.ALK_TWO, Rock.SILVER, Areas.AHLK_TWO, Bank.BOALK),
    AL_KHARID_ADAMANTIT(Path.ALK_THR, Rock.ADAMANT, Areas.AHLK_THREE, Bank.BOALK); */

    private final Path path;
    private final Rock rock;
    private final Areas areas;
    private final Bank bank;

    private Master(final Path path, final Rock rock, final Areas areas, final Bank bank){
        this.path = path;
        this.rock = rock;
        this.areas = areas;
        this.bank = bank;
    }

    public Tile[] getPath() {
        return path.getRockPath();
    }

    public Tile[] getBankPath() {
        return path.getBankPath();
    }

    public int[] getRock() {
        return rock.getObject_ID();
    }

    public int getOre() {
        return rock.getOre_ID();
    }

    public int getBank() {
        return bank.getBankBooth();
    }

    public Area getRockAreas() {
        return  areas.getRockArea();
    }
    public Area getBankAreas() {
        return areas.getBankArea();
    }

    @Override
    public String toString() {
        String name = name().toLowerCase().replace("_", " ");
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return name;
    }
}
