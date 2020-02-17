package com.cpg.lab10.exercise4;

import java.util.function.Supplier;

public class SimpleClass {
    private String name;
    private int bal;

    public SimpleClass(String name, int bal) {
        this.name = name;
        this.bal = bal;
    }

    public SimpleClass() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public static void main(String args[]) {
        Supplier<SimpleClass> s1 = SimpleClass::new;
    }
}