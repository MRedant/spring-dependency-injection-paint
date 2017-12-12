package com.switchfully.spring.dependencyinjection._04_automatedspringjavax.paint.shapes;

import org.springframework.context.annotation.Primary;

import javax.inject.Named;

/**
 * Managed beans are by default singletons / stateless, meaning they should not have any state.
 * If our Triangle class would have any state (e.g. color), this would be bad practice!
 *
 * The @Primary annotation indicates that the Triangle is the default shape to be injected (into PaintService).
 *
 */
@Named
@Primary
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
