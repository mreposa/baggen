package org.mreposa.baggen.bagitem;

public class GiantBagItem implements Comparable<GiantBagItem> {
    @Override
    public String toString() {
        return "BagItem description";
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().getName().equals(obj.getClass().getName());
    }

    @Override
    public int hashCode() {
        return this.getClass().getName().hashCode();
    }

    public int compareTo(GiantBagItem o)
    {
        return this.getClass().getName().compareTo(o.getClass().getName());
    }
}
