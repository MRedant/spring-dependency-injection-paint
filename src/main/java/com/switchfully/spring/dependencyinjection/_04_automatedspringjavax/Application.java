package com.switchfully.spring.dependencyinjection._04_automatedspringjavax;

import com.switchfully.spring.dependencyinjection._04_automatedspringjavax.paint.PaintService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * the @ComponentScan annotation will go and find all classes that it should manage
 * (manage lifecycle, wire together,... in the Spring container / Application context)
 * ---> All classes annotated with @Named (or @Component, @Service, @Controller & @Repository) will become managed beans.
 *
 * the @Inject annotation will allow Spring to automatically inject managed beans (@Named) as dependencies.
 *
 * By defining basePackages, we can tell Spring which packages to (recursively) explore.
 * If no basePackage is defined, scanning will occur from the package of the class that declares @ComponentScan.
 * Scanning will occur in different (Maven) modules if they share the basePackage.
 */
@ComponentScan(basePackages = {"com.switchfully.spring.dependencyinjection._04_automatedspringjavax.paint"})
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);

        PaintService paintService = applicationContext.getBean(PaintService.class);
        String resultOfPaint = paintService.paint();

        System.out.println("\nAutomated Dependency Injection with Spring & Javax\n-----------------------------------\n");
        System.out.println(resultOfPaint);
        System.out.println("\n\n\n");
    }
}
