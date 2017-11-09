package com.it.JD01.chapter6.partA.task9;

import java.util.ArrayList;

abstract public class Cupboard implements Furniture{
    private final String type;

    public Cupboard(String type) {
        this.type = type;
    }

    public Cupboard() {
        type = "Деревянный";
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cupboard cupboard = (Cupboard) o;

        return type != null ? type.equals(cupboard.type) : cupboard.type == null;
    }

    @Override
    public int hashCode() {
        return type != null ? type.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "type='" + type + '\'' +
                "} ";
    }
}
