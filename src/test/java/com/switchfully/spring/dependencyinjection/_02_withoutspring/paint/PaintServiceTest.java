package com.switchfully.spring.dependencyinjection._02_withoutspring.paint;

import com.switchfully.spring.dependencyinjection._02_withoutspring.paint.shapes.Square;
import com.switchfully.spring.dependencyinjection._02_withoutspring.paint.shapes.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * We can now test all possible scenario's of our PaintService:
 * allowing us to paint (and test) any Shape
 */
public class PaintServiceTest {

    @Test
    public void paint_givenATriangle_thenDrawATriangleAndColorizeIt() throws Exception {
        // GIVEN
        PaintService paintService = new PaintService(new Triangle());

        // WHEN
        String textPainted = paintService.paint();

        // THEN
        assertEquals(textPainted, "Drawing a Triangle!\nGiving the Triangle a pretty color!");
    }

    @Test
    public void paint_givenASquare_thenDrawASquareAndColorizeIt() throws Exception {
        // GIVEN
        PaintService paintService = new PaintService(new Square());

        // WHEN
        String textPainted = paintService.paint();

        // THEN
        assertEquals(textPainted, "Drawing a Square!\nGiving the Square a pretty color!");
    }

}