package com.switchfully.spring.dependencyinjection._03_manualspring.paint;

import com.switchfully.spring.dependencyinjection._03_manualspring.paint.shapes.Shape;

public class PaintService {
    private Shape shape;

    public PaintService(Shape shape) {
        this.shape = shape;
    }

    public String paint() {
        return shape.draw() + "\n" + shape.colorize();
    }
}
