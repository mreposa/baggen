package org.mreposa.baggen.bagitem;

import java.util.Random;

public class Caltrops extends GiantBagItem {
    int count = 0;

    public Caltrops(Random rand) {
        this.count = rand.nextInt(6) + 1;
    }

    @Override
    public String toString() {
        return this.count + " large iron caltrops";
    }
}
