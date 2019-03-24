package com.example.Injection_Collections;

public class Color {
    private String color;
    private int colorId;

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

    public Color(String color, int colorId) {
        this.color = color;
        this.colorId = colorId;
    }


}
