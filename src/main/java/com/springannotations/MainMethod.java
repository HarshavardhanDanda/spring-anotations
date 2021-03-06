package com.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {
    public static void main(String[] args){
        //read spring config file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from container
        Coach theCoach= context.getBean("thatSillyCoach", Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        //close context
        context.close();
    }
}
