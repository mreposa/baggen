package org.mreposa.baggen.bagitem;

import java.util.Random;

public class Boulders extends GiantBagItem {
    int count = 0;

    public Boulders(Random rand) {
        this.count = rand.nextInt(4) + 1;
    }

    @Override
    public String toString() {
        return this.count + " small boulders";
    }
}
