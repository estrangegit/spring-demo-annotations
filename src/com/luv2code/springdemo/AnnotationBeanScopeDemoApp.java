package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main( String[] args ) {
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // retrieve a bean from the spring container
        Coach theCoach = context.getBean("tennisCoach" , Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach" , Coach.class);
        
        // check here if they are the same
        boolean result = (theCoach == alphaCoach);
        
        // print out the results
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
        
        // close the context
        context.close();
    }

}
