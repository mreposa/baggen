package org.mreposa.baggen.bagitem;

import java.util.Random;

public class Salt extends GiantBagItem {
    int count = 0;

    public Salt(Random rand) {
        this.count = rand.nextInt(2);
    }

    @Override
    public String toString() {
        String val;

        if (this.count == 0) {
            val = "small bag of salt";
        }
        else {
            val = "small box of salt";
        }
        return val;
    }
}
