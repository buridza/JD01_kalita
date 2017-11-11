package com.it.JD01.classAndObj.tasksB.quadEquation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static double summSol(double[] sol){
        return sol[0]+sol[1];
    }
    public static void main(String[] args) {
        ArrayList<QuadraticEquation> allEquation = new ArrayList<>();
        Random random = new Random();
        int max=0;
        int min=0;
        int count =1000;
        for (int i = 0; i < count;i++) {
            allEquation.add(new QuadraticEquation(random.nextInt(100)+1, random.nextInt(100)+1, random.nextInt(100)+1));
            if(allEquation.get(i).findDiscriminant()>=0){
            min=i;
            max=i;
            }
        }
        for (int i = 0; i < count;i++) {
            if(allEquation.get(i).findDiscriminant()<0)
                continue;
            if(summSol(allEquation.get(i).findSolutionn())<=summSol(allEquation.get(min).findSolutionn())){
                min = i;
            }
            if(summSol(allEquation.get(i).findSolutionn())>=summSol(allEquation.get(max).findSolutionn())){
                max = i;
            }
            System.out.println(allEquation.get(i).findSolutionn()[0]+","+allEquation.get(i).findSolutionn()[1]);
        }
        System.out.println(Arrays.toString(allEquation.get(min).findSolutionn()));
        System.out.println(Arrays.toString(allEquation.get(max).findSolutionn()));
        allEquation.get(max).interval();

    }
}
