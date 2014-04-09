package smineros.data;
import org.powerbot.script.Tile;

public enum Path{

        ALK_ONE(new Tile[]{
                new Tile(3270,3166, 0),
                new Tile(3276,3181, 0),
                new Tile(3281,3200, 0),
                new Tile(3280,3218, 0),
                new Tile(3285,3235, 0),
                new Tile(3291,3254, 0),
                new Tile(3294,3274, 0),
                new Tile(3298,3290, 0)},

                new Tile[] {
                        new Tile(3298,3290, 0),
                        new Tile(3294,3274, 0),
                        new Tile(3291,3254, 0),
                        new Tile(3285,3235, 0),
                        new Tile(3280,3218, 0),
                        new Tile(3281,3200, 0),
                        new Tile(3276,3181, 0),
                        new Tile(3270,3166, 0)}),

        ALK_TWO(new Tile[]{
                new Tile(3270,3166, 0),
                new Tile(3276,3181, 0),
                new Tile(3281,3200, 0),
                new Tile(3280,3218, 0),
                new Tile(3285,3235, 0),
                new Tile(3291,3254, 0),
                new Tile(3294,3274, 0),
                new Tile(3298,3290, 0),
                new Tile(3298,3299, 0)},

                new Tile[] {
                        new Tile(3298,3290, 0),
                        new Tile(3294,3274, 0),
                        new Tile(3291,3254, 0),
                        new Tile(3285,3235, 0),
                        new Tile(3280,3218, 0),
                        new Tile(3281,3200, 0),
                        new Tile(3276,3181, 0),
                        new Tile(3270,3166, 0)}),

        ALK_THR(new Tile[]{
                new Tile(3270,3166, 0),
                new Tile(3276,3181, 0),
                new Tile(3281,3200, 0),
                new Tile(3280,3218, 0),
                new Tile(3285,3235, 0),
                new Tile(3291,3254, 0),
                new Tile(3294,3274, 0),
                new Tile(3298,3290, 0),
                new Tile(3298,3299, 0),
                new Tile(3300,3312, 0)},

                new Tile[] {
                        new Tile(3298,3299,0),
                        new Tile(3298,3290, 0),
                        new Tile(3294,3274, 0),
                        new Tile(3291,3254, 0),
                        new Tile(3285,3235, 0),
                        new Tile(3280,3218, 0),
                        new Tile(3281,3200, 0),
                        new Tile(3276,3181, 0),
                        new Tile(3270,3166, 0)}),


        VAR(new Tile[] {
                new Tile(3183, 3434, 0),
                new Tile(3175, 3427, 0),
                new Tile(3171, 3413, 0),
                new Tile(3170, 3407, 0),
                new Tile(3171, 3395, 0),
                new Tile(3177, 3380, 0),
                new Tile(3183, 3370, 0)},


                new Tile[]{
                        new Tile(3183, 3370, 0),
                        new Tile(3177, 3380, 0),
                        new Tile(3171, 3395, 0),
                        new Tile(3170, 3407, 0),
                        new Tile(3171, 3413, 0),
                        new Tile(3175, 3427, 0),
                        new Tile(3184, 3434, 0)}),



        BAR(new Tile[] {
                new Tile(3093,3491, 0),
                new Tile(3080,3479, 0),
                new Tile(3079,3467, 0),
                new Tile(3073,3450, 0),
                new Tile(3069,3432, 0),
                new Tile(3080,3418, 0)},

                new Tile[] {
                        new Tile(3080, 3418, 0),
                        new Tile(3069, 3432, 0),
                        new Tile(3073, 3450, 0),
                        new Tile(3079, 3467, 0),
                        new Tile(3080, 3479, 0),
                        new Tile(3093, 3491, 0)});


        private final Tile[] rockPath;
        private final Tile[] bankPath;

        private Path(Tile[] rockPath, Tile[] bankPath) {

            this.rockPath = rockPath;
            this.bankPath = bankPath;

        }

        public Tile[] getRockPath() {
            return rockPath;
        }

        public Tile[] getBankPath() {
            return bankPath;
        }

    }
