package com.it.JD01.chapter6.partA.task6;

abstract public class Warship implements Ship{
    private int numberOfGuns;
    private int speed;
    public void shoot(){
        System.out.println("Стреляю из " + numberOfGuns + " орудий");
    }

    public Warship(int numberOfGuns) {
        this.numberOfGuns = numberOfGuns;
    }

    public Warship() {
    }

    public int getNumberOfGuns() {
        return numberOfGuns;
    }

    public void addGuns(int numberOfGuns) {
        if(this.numberOfGuns<100) {
            this.numberOfGuns = numberOfGuns;
            System.out.println("Мы стали сильнее!!");
        }
        else
            System.out.println("Больше не влазит");

    }

    public int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Warship warship = (Warship) o;

        if (numberOfGuns != warship.numberOfGuns) return false;
        return speed == warship.speed;
    }

    @Override
    public int hashCode() {
        int result = numberOfGuns;
        result = 31 * result + speed;
        return result;
    }

    @Override
    public String toString() {
        return "Warship{" +
                "numberOfGuns=" + numberOfGuns +
                ", speed=" + speed +
                '}';
    }
}
