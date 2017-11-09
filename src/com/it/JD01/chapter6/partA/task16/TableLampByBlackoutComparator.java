package com.it.JD01.chapter6.partA.task16;

import java.util.Comparator;

public class TableLampByBlackoutComparator implements Comparator<TableLamp> {
    @Override
    public int compare(TableLamp o1, TableLamp o2) {
        if(o1.getBlackout()==o2.getBlackout())
            return 0;
        if(o1.getBlackout()>o2.getBlackout())
            return 1;
        else return -1;
    }
}
