package com.it.JD01.javaBasics.tasksB.Communarka;

import com.it.JD01.javaBasics.tasksB.entity.Candy;
import com.it.JD01.javaBasics.tasksB.entity.CandyWithChop;
import com.it.JD01.javaBasics.tasksB.entity.Chocolate;

/**
 * Created by Denis on 02.11.2017.
 */
public class Communarka extends Manufacturer{
    public Communarka() {
    }

    @Override
    public CandyWithChop createCandyWithChop() {
        return new CandyWithChop(25.5);
    }

    @Override
    public Candy createCandyWithFried() {
        return null;
    }

    @Override
    public Candy createCandyWithLiqueurAndJelly() {
        return null;
    }

    @Override
    public Candy createCandyWithMilAndChocolate() {
        return null;
    }

    @Override
    public Chocolate createDesertTile() {
        return null;
    }
}
