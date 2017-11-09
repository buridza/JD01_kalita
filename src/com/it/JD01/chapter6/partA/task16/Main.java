package com.it.JD01.chapter6.partA.task16;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(100);
        lamp.powerOn();
        lamp.powerOn(5);
        lamp.powerOn(55);
        lamp.powerOn(999);
        lamp.powerOn();
        lamp.powerOn();
        TableLamp tableLamp = new TableLamp(50,10);
        tableLamp.powerOn(50);
        tableLamp.powerOn();
        tableLamp.powerOn();
        tableLamp.newLamp(1000);
        tableLamp.powerOn(2000);
    }
}
