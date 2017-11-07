package com.it.JD01.javaBasics.tasksB;

import com.it.JD01.javaBasics.tasksB.Communarka.Communarka;

/**
 * Created by Denis on 02.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        Communarka communarka = new Communarka();
        communarka.createCandyWithChop();
        System.out.println(communarka.createCandyWithChop());
        System.out.println(communarka.createCandyWithFried());
    }

}
