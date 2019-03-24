package com.example.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {
    public static void main(String []args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanAutowire.xml");
        Animal zebra = (Animal)applicationContext.getBean("zebra");
        System.out.println(zebra.getColor().getColor());

//        Animal zebra1 = (Animal)applicationContext.getBean("zebra1");
//        System.out.println(zebra1.getColor().getColor());

        Animal zebra2 = (Animal)applicationContext.getBean("zebra2");
        System.out.println(zebra2.getColor().getColor());
    }
}
