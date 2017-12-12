package com.switchfully.spring.dependencyinjection._02_withoutspring.paint;

import com.switchfully.spring.dependencyinjection._02_withoutspring.paint.shapes.Shape;

/**
 * Make sure to inspect the Test
 */
public class PaintService {
    private Shape shape;

    PaintService(Shape shape) {
        this.shape = shape;
    }

    public String paint() {
        return shape.draw() + "\n" + shape.colorize();
    }
}
