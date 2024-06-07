package org.mreposa.baggen;

import org.mreposa.baggen.bagitem.*;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class GiantBagGenerator {

    public Set<GiantBagItem> generate() {
        Set<GiantBagItem> giantBag = new HashSet<>();
        int itemCount = 0;

        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            itemCount = itemCount + rand.nextInt(4) + 1;
        }

        GiantBagItem bagItem;
        for (int j = 0; j < itemCount; j++) {
            do {
                bagItem = getBagItem(rand);
            } while (giantBag.contains(bagItem));

            giantBag.add(bagItem);
        }

        return giantBag;
    }

    public GiantBagItem getBagItem(Random rand) {
        GiantBagItem item;
        int roll = rand.nextInt(100) + 1;

        if (roll <= 3) {
            item = new AxeBlade();
        }
        else if (roll <= 17) {
            item = new Boulders(rand);
        }
        else if (roll <= 19) {
            item = new Utensils(rand);
        }
        else if (roll <= 21) {
            item = new BrassItems();
        }
        else if (roll <= 23) {
            item = new Caltrops(rand);
        }
        else if (roll <= 25) {
            item = new Cheese();
        }
        else if (roll <= 30) {
            item = new Cloak(rand);
        }
        else if (roll <= 32) {
            item = new Comb();
        }
        else if (roll <= 40) {
            item = new Pot();
        }
        else if (roll <= 43) {
            item = new DrinkingHorn();
        }
        else if (roll <= 47) {
            item = new Knife();
        }
        else if (roll <= 53) {
            item = new Linens();
        }
        else if (roll <= 60) {
            item = new Meat();
        }
        else if (roll <= 64) {
            item = new CopperCoins(rand);
        }
        else if (roll <= 67) {
            item = new SilverCoins(rand);
        }
        else if (roll <= 69) {
            item = new GoldCoins(rand);
        }
        else if (roll <= 76) {
            item = new Pelt();
        }
        else if (roll <= 83) {
            item = new Rope(rand);
        }
        else if (roll <= 85) {
            item = new Salt(rand);
        }
        else if (roll <= 90) {
            item = new Sandals();
        }
        else if (roll <= 98) {
            item = new DrinkingSkin(rand);
        }
        else {
            item = new TeethTusks(rand);
        }

        return item;
    }
}
