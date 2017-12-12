package com.switchfully.spring.dependencyinjection._03_manualspring.paint.shapes;

public class Triangle implements Shape {
    @Override
    public String draw() {
        return "Drawing a Triangle!";
    }

    @Override
    public String colorize() {
        return "Giving the Triangle a pretty color!";
    }
}
