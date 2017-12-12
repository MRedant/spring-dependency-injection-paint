package com.switchfully.spring.dependencyinjection._01_nodependencyinjection.paint;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaintServiceTest {

    /**
     * The PaintService is difficult to test...
     *
     * We know, by looking at the implementation, that it is painting a triangle,
     * however, we don't have any control over it.
     * We can't test the scenario of painting a Square or any other kind of Shape
     *
     * This is due to the fact that the dependency on Triangle of PaintService is non injectable at the moment, it's a
     * hard dependency (High coupling)
     */
    @Test
    public void paint_thenReturnWhatIsPainted() throws Exception {
        PaintService paintService = new PaintService();

        String textPainted = paintService.paint();

        assertEquals(textPainted, "Drawing a Triangle!\nGiving the Triangle a pretty color!");
    }

}