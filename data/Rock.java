package smineros.data;


public enum Rock {

    TIN( new int[]{20955, 20953, 20954}, 439 ),
   COPPER( new int[]{145, 457, 755}, 436),
    CLAY(new int[]{15505,15503, 15504}, 434),
    IRON( new int[]{11956,11955, 11954, 37307, 37309, 37308}, 440),
    COAL( new int[]{11931, 11932, 11930}, 453),
    SILVER( new int[]{11950, 11949, 37306, 37304, 37305},442),
    GOLD( new int[]{37312, 37310}, 444),
    MITHRIL( new int[]{11944,11942}, 447),
    ADAMANT( new int[]{11939,11941}, 449); 

    private final int[] OBJECT_ID;
    private final int ore_ID;


    private Rock( int[] object_id, int ore_ID) {

        this.OBJECT_ID = object_id;
        this.ore_ID = ore_ID;

    }


    public int[] getObject_ID() {
        return OBJECT_ID;
    }

    public int getOre_ID() {
        return ore_ID;
    }



}
