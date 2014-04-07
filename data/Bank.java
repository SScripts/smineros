package smineros.data;


public enum Bank {

    BOVAR(17005),
    BOALK(-1),
    BOEDG(-1);

    private final int BOOTH_ID;

    private Bank( int BOOTH_ID) {
        this.BOOTH_ID = BOOTH_ID;
    }

    public int getBankBooth() {
        return BOOTH_ID;
    }



}
