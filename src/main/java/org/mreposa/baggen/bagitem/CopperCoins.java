package org.mreposa.baggen.bagitem;

import java.util.Random;

public class CopperCoins extends GiantBagItem {
    int count = 0;

    public CopperCoins(Random rand) {
        this.count = rand.nextInt((400 - 100) + 1) + 100;
    }

    @Override
    public String toString() {
        return this.count + " copper pieces";
    }
}
