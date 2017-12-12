package com.switchfully.spring.dependencyinjection._04_automatedspringjavax.paint.shapes;

import javax.inject.Named;

/**
 * Managed beans are by default singletons / stateless, meaning they should not have any state.
 * If our Square class would have any state (e.g. color), this would be bad practice!
 *
 * The value inside @Named is the unique qualifier of this bean. It can be used to make sure the Square shape is injected
 * as a dependency (for PaintService)
 *
 */
@Named("SquareBean")
public class Square implements Shape {
    @Override
    public String draw() {
        return "Drawing a Square!";
    }

    @Override
    public String colorize() {
        return "Giving the Square a pretty color!";
    }
}
