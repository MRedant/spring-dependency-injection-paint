package com.switchfully.spring.dependencyinjection._04_automatedspringjavax.paint;

import com.switchfully.spring.dependencyinjection._04_automatedspringjavax.paint.shapes.Square;
import com.switchfully.spring.dependencyinjection._04_automatedspringjavax.paint.shapes.Triangle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.verification.Times;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PaintServiceTest {

    @Mock
    private Triangle triangle;

    @InjectMocks
    private PaintService paintService;

    /**
     * A Mocking test (verify)
     */
    @Test
    public void paint_verifyDrawAndColorizeMethodsOfShapeAreCalled() throws Exception {
        paintService.paint();

        Mockito.verify(triangle, new Times(1)).draw();
        Mockito.verify(triangle, new Times(1)).colorize();
    }

    /**
     * A Mocking test (when)
     */
    @Test
    public void paint_givenATriangle_thenResultIsTheConcatenatedResultOfDrawAndColorize() throws Exception {
        when(triangle.draw()).thenReturn("DRAWING!");
        when(triangle.colorize()).thenReturn("COLORIZING!");

        String textPainted = paintService.paint();

        assertEquals(textPainted, "DRAWING!\nCOLORIZING!");
    }

    /**
     * A non-mocking test
     */
    @Test
    public void paint_givenATriangle_thenDrawATriangleAndColorizeIt() throws Exception {
        // GIVEN
        PaintService paintService = new PaintService(new Triangle());

        // WHEN
        String textPainted = paintService.paint();

        // THEN
        assertEquals(textPainted, "Drawing a Triangle!\nGiving the Triangle a pretty color!");
    }

    /**
     * A non-mocking test
     */
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