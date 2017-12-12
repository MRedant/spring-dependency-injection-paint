package com.switchfully.spring.dependencyinjection._03_manualspring;

import com.switchfully.spring.dependencyinjection._03_manualspring.paint.PaintService;
import com.switchfully.spring.dependencyinjection._03_manualspring.paint.config.PaintConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    /**
     * We create a an ApplicationContext (Spring (IoC) container) which we provide with the PaintConfig class.
     * the config file will create a Bean of PaintService which will be managed by the ApplicationContext
     *
     * We then get our PaintService bean from the ApplicationContext container, and call its paint method (which
     * should paint a Triangle)
     *
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PaintConfig.class);

        PaintService paintService = applicationContext.getBean(PaintService.class);
        String resultOfPaint = paintService.paint();

        System.out.println("\nDependency Injection with Spring\n-----------------------------------\n");
        System.out.println(resultOfPaint);
        System.out.println("\n\n\n");
    }
}
