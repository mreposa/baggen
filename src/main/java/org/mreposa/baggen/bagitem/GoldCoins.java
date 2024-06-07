package org.mreposa.baggen.bagitem;

import java.util.Random;

public class GoldCoins extends GiantBagItem {
    int count = 0;

    public GoldCoins(Random rand) {
        this.count = rand.nextInt((40 - 10) + 1) + 10;
    }

    @Override
    public String toString() {
        return this.count + " gold pieces";
    }
}
