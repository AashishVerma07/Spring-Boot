package com.learnSpring.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("personByExistingBeanCallMethod"));
        System.out.println(context.getBean("personByExistingBeanByPassingAsParameter"));




    }



}
