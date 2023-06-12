package com.in28minutues.project1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



record Person(String name, int age) { };
record Address(String firstLine, String city) { };





@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Ardy";
    }

    @Bean
    public int age() {
        return 25;
    }


    @Bean
    public Person person() {
        return new Person("Mocha", 1);
    }

    @Bean
    public Address address() {
        return new Address("Holms", "London");
    }


}
