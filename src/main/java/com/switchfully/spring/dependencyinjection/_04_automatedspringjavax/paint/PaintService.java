package com.switchfully.spring.dependencyinjection._04_automatedspringjavax.paint;

import com.switchfully.spring.dependencyinjection._04_automatedspringjavax.paint.shapes.Shape;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * PaintService becomes a Managed Bean due to the @Named annotation.
 * It will be picked up by the @ComponentScan
 *
 * The @Named and @Inject are both part of the JAVA EE specification of Dependency Injection,
 * they are not part of Spring, however, Spring is able to use them.
 * Spring offers its own implementation:
 * ---> @Named can be replaced by @Component / @Service / @Controller / @Repository
 * ---> @Inject can be replace by @Autowired
 * It is preferred to use the JAVA EE specification over the Spring specific implementation
 * ---> If we would ever swap out Spring's Dependency Injection with that of another framework, we won't have to
 *      refactor the annotations.
 */
@Named
public class PaintService {

    private Shape shape;

    /**
     * We inject the Shape as a dependency to the PaintService.
     * By using the @Qualifier annotation, we can specify which concrete Shape bean we want to inject.
     */
    @Inject
    public PaintService(@Qualifier("SquareBean") Shape shape) {
        this.shape = shape;
    }

    public String paint() {
        return shape.draw() + "\n" + shape.colorize();
    }
}
