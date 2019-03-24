package com.example.Injection_Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Animal {
    private float weight;
    private double height;
    private String speciesName;
    private Color color;

    Map<String,String> namesMap;

    List<String> names;
    Set<String> namesSet;

    public Map<String, String> getNamesMap() {
        return namesMap;
    }

    public void setNamesMap(Map<String, String> namesMap) {
        this.namesMap = namesMap;
    }


    public Set<String> getNamesSet() {
        return namesSet;
    }

    public void setNamesSet(Set<String> namesSet) {
        this.namesSet = namesSet;
    }


    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public Animal()
    {

    }
    public Animal(float weight, double height, String speciesName, Color color) {
        this.weight = weight;
        this.height = height;
        this.speciesName = speciesName;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }


}
