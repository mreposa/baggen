package org.mreposa.baggen.bagitem;

import java.util.Random;

public class Utensils extends GiantBagItem {
    int count = 0;

    public Utensils(Random rand) {
        this.count = rand.nextInt(2);
    }

    @Override
    public String toString() {
        String val;

        if (this.count == 0) {
            val = "battered tin bowl and spoon";
        }
        else {
            val = "battered pewter bowl and spoon";
        }
        return val;
    }
}
