package com.it.JD01.javaBasics.tasksB.entity;

/**
 * Created by Denis on 02.11.2017.
 */
public class CandyWithChop extends Candy{
    private double chopLevel;

    public CandyWithChop(double chopLevel) {
        this.chopLevel = chopLevel;
    }

    @Override
    public String toString() {
        return "CandyWithChop{" +
                "chopLevel=" + chopLevel +
                '}';
    }
}
