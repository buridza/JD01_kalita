package com.it.JD01.chapter6.partA.task16;

public class Lamp implements LightSource{
    protected int shelfLife;
    private boolean power;

    public Lamp() {
    }

    public Lamp(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    protected void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public boolean isPower() {
        return power;
    }

    public void powerOn(){
        if(!this.power) {
            if(checkBurnOut()){
                this.power = !this.power;
                System.out.println("Включена");
                shine(10);
            } else System.out.println("Лапма перегорела");
        }
        else if(checkBurnOut())
            System.out.println("Уже включена");
        else System.out.println("Лапма перегорела");
    }
    public void powerOn(int time){
        if(!this.power) {
            if(checkBurnOut()){
            this.power = !this.power;
            System.out.println("Включена");
            shine(time);
            } else System.out.println("Лапма перегорела");
        }
        else if(checkBurnOut())
            System.out.println("Уже включена");
        else System.out.println("Лапма перегорела");
    }
    public void powerOff(){
        if(this.power) {
            this.power = !this.power;
            System.out.println("Выключена");
        }
        else
            System.out.println("Уже выключена");
    }

    @Override
    public void shine(int time) {

        if(this.shelfLife>time) {
            System.out.println("Свечу ярко " + time + " минут");
            this.shelfLife -= time;
        }
        else {
            System.out.println("Свечу ярко " + this.shelfLife + " минут");
            this.shelfLife -= this.shelfLife;
        }
        powerOff();
    }

    private boolean checkBurnOut(){
        if(this.shelfLife==0)
            return false;
        else return true;
    }

    protected void newLamp(int shelfLife){
        this.shelfLife = shelfLife;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lamp lamp = (Lamp) o;

        return shelfLife == lamp.shelfLife;
    }

    @Override
    public int hashCode() {
        return shelfLife;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "shelfLife=" + shelfLife +
                '}';
    }


}
