package com.in28minutues.project1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        // Launch spring application
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);


        // retrieve the bean
        System.out.println(context.getBean("name"));


        // configure the things that we want Spring to manage for us
    }
}
