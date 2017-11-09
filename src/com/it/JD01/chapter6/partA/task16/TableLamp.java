package com.it.JD01.chapter6.partA.task16;

public class TableLamp extends Lamp {
    private int blackout;

    public TableLamp(int shelfLife, int blackout) {
        super(shelfLife);
        this.blackout = blackout;
    }

    public int getBlackout() {
        return blackout;
    }

    public void setBlackout(int blackout) {
        this.blackout = blackout;
    }

    @Override
    public void newLamp(int shelfLife) {
        super.newLamp(shelfLife);
        System.out.println("Лампа заменена");
    }

    @Override
    public void shine(int time) {
        if(this.shelfLife>time) {
            System.out.println("Свечу c яркостью " +(100-this.blackout)+ " "+ time + " минут");
            this.shelfLife -= time;
        }
        else {
            System.out.println("Свечу c яркостью " +(100-this.blackout) +" "+ this.shelfLife + " минут");
            this.shelfLife -= this.shelfLife;
        }
        powerOff();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TableLamp tableLamp = (TableLamp) o;

        return blackout == tableLamp.blackout;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + blackout;
        return result;
    }

    @Override
    public String toString() {
        return "TableLamp{" +
                "blackout=" + blackout +
                "} " + super.toString();
    }
}
