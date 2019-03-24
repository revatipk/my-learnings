package com.example.Injection_Collections;

public class Point {
    int x;
    int y;

//    public Point()
//    {
//        System.out.println("Constructor called");
//    }
    public Point(int x, int y)
    {
        System.out.println(x+","+y);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
