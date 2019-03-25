package com.vogella.android.constructormodel.Voiture.SecondActivity.model;

public class Marque {
    private String name;
    private int id;

    public Marque(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
