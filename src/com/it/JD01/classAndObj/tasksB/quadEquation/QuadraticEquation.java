package com.it.JD01.classAndObj.tasksB.quadEquation;

import java.util.Arrays;

import static java.lang.Double.NaN;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation() {
        this.a = 1;
        this.b = 2;
        this.c = 3;
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int findDiscriminant(){
        return b*b-4*a*c;
    }

    public double[] findSolutionn(){

            double[] g = {(-this.b - Math.sqrt(findDiscriminant()) / (2 * this.a)), (-this.b + Math.sqrt(findDiscriminant()) / (2 * this.a))};
            return g;



    }

    public int[] findExtremum(){
        int [] extremum = {-b/(2*a),-(findDiscriminant())/(4*a*c)};
        return extremum;
    }

    public void interval(){
        if(a>0)
            System.out.println("["+ Arrays.toString(findExtremum()) + "," + "+"+"\u221E]");
        else  System.out.println("["+ "-\u221E" + "," + Arrays.toString(findExtremum())+"]");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


    @Override
    public String toString() {
        //String.format("%.2f", 0.1321231);
       // String.format("QuadraticEquation{%d*%.1f+%d*%.1f+c=0}", a,findSolutionn()[0],b,findSolutionn()[1],c);
        return String.format("QuadraticEquation{%d*%.1f+%d*%.1f+%d=0}", a,findSolutionn()[0],b,findSolutionn()[1],c);
    }
}
