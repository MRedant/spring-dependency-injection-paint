package com.switchfully.spring.dependencyinjection._03_manualspring.paint.shapes;

public class Square implements Shape {
    @Override
    public String draw() {
        return "Drawing a Square!";
    }

    @Override
    public String colorize() {
        return "Giving the Square a pretty color!";
    }
}
