package com.it.JD01.chapter6.partA.task16;

import java.util.Comparator;

public class LampByShelfLifeComparator implements Comparator<Lamp>{
    @Override
    public int compare(Lamp o1, Lamp o2) {
        if(o1.getShelfLife()==o2.getShelfLife())
            return 0;
        if(o1.getShelfLife()>o2.getShelfLife())
            return 1;
        else return -1;
    }
}
