package smineros.data;


import org.powerbot.script.Area;
import org.powerbot.script.Tile;

public enum Areas {

    AHLK_ONE(new Area(
            new Tile(3291, 3285, 0),
            new Tile(3304, 3283, 0),
            new Tile(3305, 3290, 0),
            new Tile(3297, 3291, 0)

    ), new Area(
            new Tile(3267, 3175, 0),
            new Tile(3272, 3175, 0),
            new Tile(3272, 3165, 0),
            new Tile(3267, 3165, 0)
    )),
    AHLK_TWO(new Area(
            new Tile(3304,3297, 0),
            new Tile(3304,3306, 0),
            new Tile(3293,3306, 0),
            new Tile(3292,3298, 0)
    ),
            new Area(
                    new Tile(3267, 3175, 0),
                    new Tile(3272, 3175, 0),
                    new Tile(3272, 3165, 0),
                    new Tile(3267, 3165, 0)
            )),
    AHLK_THREE(new Area(
            new Tile(3304,3308, 0),
            new Tile(3295,3308, 0),
            new Tile(3294,3317, 0),
            new Tile(3304,3317, 0)
    ),
            new Area(
                    new Tile(3267, 3175, 0),
                    new Tile(3272, 3175, 0),
                    new Tile(3272, 3165, 0),
                    new Tile(3267, 3165, 0)
            )),
    VARO(new Area(
            new Tile(3180, 3441, 0),
            new Tile(3180, 3432, 0),   //Area rocks
            new Tile(3186, 3432, 0),
            new Tile(3186, 3441, 0)

    ),new Area(
            new Tile(3180, 3441, 0),
            new Tile(3180, 3432, 0),
            new Tile(3186, 3432, 0),
            new Tile(3186, 3441, 0)
    )),
    BARB(new Area(
            new Tile(3076, 3416, 0),
            new Tile(3088, 3415, 0),
            new Tile(3085, 3426, 0),
            new Tile(3077, 3426, 0)
    ), new Area(
            new Tile(3091, 3501, 0),
            new Tile(3091, 3489, 0),
            new Tile(3101, 3489, 0),
            new Tile(3101, 3500, 0)
    ));

    private final Area rockArea;
    private final Area bankArea;

    private Areas (Area rockArea, Area bankArea){
        this.rockArea = rockArea;
        this.bankArea = bankArea;
    }

    public Area getRockArea() {
        return rockArea;
    }

    public Area getBankArea() {
        return  bankArea;
    }

}