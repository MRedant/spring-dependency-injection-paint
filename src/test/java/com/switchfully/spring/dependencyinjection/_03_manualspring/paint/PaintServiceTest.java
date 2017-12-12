package com.switchfully.spring.dependencyinjection._03_manualspring.paint;

import com.switchfully.spring.dependencyinjection._03_manualspring.paint.shapes.Square;
import com.switchfully.spring.dependencyinjection._03_manualspring.paint.shapes.Triangle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.verification.Times;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * We can now test all possible scenario's of our PaintService:
 * allowing us to paint (and test) any Shape.
 *
 * We can also start Mocking!
 * --> Sometimes, creating instances of dependencies is hard / require a lot of resources / ...
 * --> Sometimes, dependencies have dependencies of their own, which we cannot or don't want to instantiate in our tests
 *     Therefore, it can be very useful to create Mocks (/ Stubs) which we can assign behavior
 */
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