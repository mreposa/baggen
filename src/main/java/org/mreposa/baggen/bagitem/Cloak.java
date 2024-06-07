package org.mreposa.baggen.bagitem;

import java.util.Random;

public class Cloak extends GiantBagItem {
    int count = 0;

    public Cloak(Random rand) {
        this.count = rand.nextInt(2);
    }

    @Override
    public String toString() {
        String val;

        if (this.count == 0) {
            val = "shabby wool cloak";
        }
        else {
            val = "shabby hide cloak";
        }
        return val;
    }
}
