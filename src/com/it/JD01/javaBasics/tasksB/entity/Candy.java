package com.it.JD01.javaBasics.tasksB.entity;

/**
 * Created by Denis on 02.11.2017.
 */
public abstract class Candy {
    private double sugarLevel;
    private final String name;

    public Candy(){
        this.sugarLevel = 0.0;
        this.name = null;
    }

    public double getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(double sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public String getName() {
        return name;
    }
}
