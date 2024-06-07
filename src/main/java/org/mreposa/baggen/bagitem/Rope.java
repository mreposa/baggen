package org.mreposa.baggen.bagitem;

import java.util.Random;

public class Rope extends GiantBagItem {
    int count = 0;

    public Rope(Random rand) {
        this.count = rand.nextInt((120 - 10) + 1) + 10;
    }

    @Override
    public String toString() {
        return this.count + "' coil very strong rope";
    }
}
