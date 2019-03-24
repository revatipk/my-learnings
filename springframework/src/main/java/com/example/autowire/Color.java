package com.example.autowire;

public class Color {
    private String color;
    private int colorId;

    public Color()
    {

    }

    public Color(String color, int colorId) {
        this.color = color;
        this.colorId = colorId;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }


}
