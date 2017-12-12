package com.switchfully.spring.dependencyinjection._02_withoutspring.paint;

import com.switchfully.spring.dependencyinjection._02_withoutspring.paint.shapes.Shape;
import com.switchfully.spring.dependencyinjection._02_withoutspring.paint.shapes.Triangle;

/**
 * We do require this class, which does the 'wiring together' of our PaintService and a Shape.
 * We'll see how Spring can facilitate with this.
 *
 * Testing this class would lead to the same difficulties we had in the previous exercise (_01_nodependencyinjection).
 * However, we are now able to test our PaintService in a more flexible way, which is a big plus.
 */
public class IoCPainter {
    public String paintUsingIoC() {
        Shape shape = new Triangle();
        PaintService paintService = new PaintService(shape);
        return paintService.paint();
    }
}
