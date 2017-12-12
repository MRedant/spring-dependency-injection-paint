package com.switchfully.spring.dependencyinjection._02_withoutspring;

import com.switchfully.spring.dependencyinjection._02_withoutspring.paint.IoCPainter;

public class Application {

    /**
     * We need to create an Instance of IoCPainter,
     * which will create our PaintService and Shape instance
     */
    public static void main(String[] args) {
        IoCPainter ioCPainter = new IoCPainter();
        String resultOfPaint = ioCPainter.paintUsingIoC();

        System.out.println("\nDependency Injection without Spring\n-----------------------------------\n");
        System.out.println(resultOfPaint);
        System.out.println("\n\n\n");
    }

}
