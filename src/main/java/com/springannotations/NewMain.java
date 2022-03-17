package com.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewMain {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach theCoach= context.getBean("cricketBean", CricketCoach.class);

        System.out.println(theCoach.getEmailAddress());
        System.out.println((theCoach.getTeam()));

    }
}
