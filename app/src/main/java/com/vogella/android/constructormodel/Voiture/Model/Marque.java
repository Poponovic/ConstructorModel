package com.vogella.android.constructormodel.Voiture.Model;

public class Marque {
    private String name;
    private int id;
    //private String image;

    public Marque(String name, int id){//, String image) {
        this.name = name;
        this.id = id;
        //this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    //public String getImage(){ return image;}
}
