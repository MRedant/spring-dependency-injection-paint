package com.switchfully.spring.dependencyinjection._03_manualspring.paint.config;

import com.switchfully.spring.dependencyinjection._03_manualspring.paint.PaintService;
import com.switchfully.spring.dependencyinjection._03_manualspring.paint.shapes.Triangle;
import org.springframework.context.annotation.Bean;

public class PaintConfig {

    /**
     * We define a PaintService Bean,
     * It should return an object of PaintService.
     * We create a PaintService instance and a Triangle instance.
     * The Triangle instance is 'injected' (a required dependency) to the PaintService instance.
     *
     * This class, in essence, replaces the IoCPainter class
     */
    @Bean
    public PaintService paintService() {
        return new PaintService(new Triangle());
    }

}
