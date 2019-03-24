package com.example.autowire;

import java.util.Map;

public class Animal {
    private String speciesName;
    private Color color;
    private Animal animal;

    private Map<Integer,String> names;

    public Animal()
    {}
    public Animal(Color color)
    {
        this.color = color;
    }
    public Map<Integer, String> getNames() {
        return names;
    }

    public void setNames(Map<Integer, String> names) {
        this.names = names;
    }


    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }


}
