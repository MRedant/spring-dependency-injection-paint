package com.switchfully.spring.dependencyinjection._01_nodependencyinjection.paint;

import com.switchfully.spring.dependencyinjection._01_nodependencyinjection.paint.shapes.Triangle;

/**
 * Make sure to inspect the Test
 */
public class PaintService {

    public String paint() {
        Triangle triangle = new Triangle();
        return triangle.draw() + "\n" + triangle.colorize();
    }

}
