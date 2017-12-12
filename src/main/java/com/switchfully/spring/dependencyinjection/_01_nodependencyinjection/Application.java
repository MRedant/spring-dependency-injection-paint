package com.switchfully.spring.dependencyinjection._01_nodependencyinjection;


import com.switchfully.spring.dependencyinjection._01_nodependencyinjection.paint.PaintService;

public class Application {

    /**
     * We simply create an instance of PaintService and call its paint() method
     */
    public static void main(String[] args) {
        PaintService paintService = new PaintService();
        String resultOfPaint = paintService.paint();

        System.out.println("\nNo Dependency Injection\n-----------------------\n");
        System.out.println(resultOfPaint);
        System.out.println("\n\n\n");
    }

}
