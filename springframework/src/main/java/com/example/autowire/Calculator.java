package com.example.autowire;

public class Calculator {
    private int x;
    private int y;

    public Calculator(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public double divide()
    {
        return (double)x/(double)y;
    }
    public double multiply()
    {
        return (double)x*(double)y;
    }
    public double add()
    {
        return (double)x+(double)y;
    }
    public double substract()
    {
        return (double)x-(double)y;
    }
}
