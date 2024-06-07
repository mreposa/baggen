package org.mreposa.baggen.bagitem;

import java.util.Random;

public class DrinkingSkin extends GiantBagItem {
    int count = 0;

    public DrinkingSkin(Random rand) {
        this.count = rand.nextInt(2);
    }

    @Override
    public String toString() {
        String val;

        if (this.count == 0) {
            val = "full water skin";
        }
        else {
            val = "full wine skin";
        }
        return val;
    }
}
