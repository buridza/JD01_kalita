package com.it.JD01.chapter4.tasksB.entity;

public class ChocolateDark extends Chocolate {




    public ChocolateDark(double sugarLevel, String name, double cocoaMassLevel, double cocoaButterLevel, boolean fruits, boolean almonds) {
        super(sugarLevel, name, cocoaMassLevel, cocoaButterLevel, fruits, almonds);
        super.mass = super.getSugarLevel()+super.getCocoaButterLevel()+super.getCocoaMassLevel();
    }

}
