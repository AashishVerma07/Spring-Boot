package com.learnSpring.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name , int age) {};
record Address (String firstLine, String city) {} ;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Ashish";
    }

    @Bean
    public int age(){
        return 25;
    }

    @Bean
    public Person person(){
        Person person = new Person("ashu", 23 );
        return person;

        // Also write like this
        // return new person("ashu", 23 );
    }

    // You just call the methods for create person existing bean.
    @Bean
    public Person personByExistingBeanCallMethod() {
        Person person = new Person(name(), age());
        return person;
    }

    // You just pass existing Bean as parameter.
    @Bean
    public Person personByExistingBeanByPassingAsParameter(String name, int age) {
        Person person = new Person(name, age);
        return person;
    }

    @Bean
    public Address address() {
        Address address =  new Address("Lohgaon", "pune");
        return address;
    }
}
