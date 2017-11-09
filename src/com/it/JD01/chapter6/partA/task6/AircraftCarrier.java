package com.it.JD01.chapter6.partA.task6;

public class AircraftCarrier extends Warship implements Comparable<AircraftCarrier> {
    private int numberOfFighter;

    public AircraftCarrier(int numberOfGuns, int numberOfFighter) {
        super(numberOfGuns);
        this.numberOfFighter = numberOfFighter;
    }

    public AircraftCarrier() {
        this.numberOfFighter = 10;
    }

    public int getNumberOfFighter() {
        return numberOfFighter;
    }

    public void setNumberOfFighter(int numberOfFighter) {
        if(numberOfFighter>30)
            System.out.println("Столько нельзя");
        else
            this.numberOfFighter = numberOfFighter;
    }

    @Override
    public void sail(int speed) {
        if(speed>100) {
            super.setSpeed(speed);
            System.out.println("Так быстро я не умею");
        }
        System.out.println("Плыву со скоростью "+super.getSpeed());
    }

    @Override
    public int compareTo(AircraftCarrier o) {
        if(this.numberOfFighter==o.numberOfFighter)
            return 0;
        else if(this.numberOfFighter<o.numberOfFighter)
            return 1;
        else return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        AircraftCarrier that = (AircraftCarrier) o;

        return numberOfFighter == that.numberOfFighter;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfFighter;
        return result;
    }

    @Override
    public String toString() {
        return "AircraftCarrier{" +
                "numberOfFighter=" + numberOfFighter +
                "} " + super.toString();
    }
}
