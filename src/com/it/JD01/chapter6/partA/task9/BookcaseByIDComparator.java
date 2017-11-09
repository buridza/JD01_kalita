package com.it.JD01.chapter6.partA.task9;

import java.util.Comparator;

public class BookcaseByIDComparator implements Comparator<Bookcase> {
    @Override
    public int compare(Bookcase o1, Bookcase o2) {
        if(o1.getID()==o2.getID())
            return 1;
        else if(o1.getID()<o2.getID())
            return -1;
        else
            return 0;
    }
}
