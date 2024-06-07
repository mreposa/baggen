package org.mreposa.baggen.bagitem;

import java.util.Random;

public class SilverCoins extends GiantBagItem {
    int count = 0;

    public SilverCoins(Random rand) {
        this.count = rand.nextInt((80 - 20) + 1) + 20;
    }

    @Override
    public String toString() {
        return this.count + " silver pieces";
    }
}
