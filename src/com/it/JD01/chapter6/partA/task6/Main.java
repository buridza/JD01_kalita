package com.it.JD01.chapter6.partA.task6;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<AircraftCarrier> allAircraft = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            allAircraft.add(new AircraftCarrier(random.nextInt(10),random.nextInt(20)));
        }
        for (int i = 0; i < allAircraft.size(); i++) {
            System.out.println(allAircraft.get(i));
        }
        TreeSet<AircraftCarrier> setAircraft = new TreeSet<>();
        setAircraft.addAll(allAircraft);
        for (AircraftCarrier air: setAircraft) {
            System.out.println(air);

        }

    }
}
