package com.it.JD01.javaBasics.tasksB.Communarka;

import com.it.JD01.javaBasics.tasksB.entity.*;

/**
 * Created by Denis on 02.11.2017.
 */
abstract public class Manufacturer extends Candy {
   abstract public CandyWithChop createCandyWithChop();
   abstract public Candy createCandyWithFried();
   abstract public Candy createCandyWithLiqueurAndJelly();
   abstract public Candy createCandyWithMilAndChocolate();
   abstract public Chocolate createDesertTile();
}
