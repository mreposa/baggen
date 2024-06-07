package org.mreposa.baggen.bagitem;

import java.util.Random;

public class TeethTusks extends GiantBagItem {
    int flip = 0;
    int count = 0;

    public TeethTusks(Random rand) {
        this.flip = rand.nextInt(2);
        this.count = rand.nextInt(8) + 1;
    }

    @Override
    public String toString() {
        String val;

        if (this.flip == 0) {
            val = this.count + " animal teeth of no value";
        }
        else {
            val = this.count + " animal tusks of no value";
        }
        return val;
    }
}
