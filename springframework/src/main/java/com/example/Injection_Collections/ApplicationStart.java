package com.example.Injection_Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {
    public static void main(String []args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
        Point p = (Point)applicationContext.getBean("Point10");
        System.out.println(p.getX());
        System.out.println(p.getY());

        Calculator calculator = (Calculator)applicationContext.getBean("calc");
        System.out.println(calculator.divide());
        System.out.println(calculator.add());
        System.out.println(calculator.substract());
        System.out.println(calculator.multiply());

        /*Animal animal = (Animal)applicationContext.getBean("animal");
        System.out.println(animal.getHeight());
        System.out.println(animal.getWeight());
        System.out.println(animal.getSpeciesName());
        System.out.println(animal.getColor().getColor());
        System.out.println(animal.getColor().getColorId());*/

        Animal animal = (Animal)applicationContext.getBean("animal1");
        System.out.println(animal.getHeight());
        System.out.println(animal.getWeight());
        System.out.println(animal.getSpeciesName());
        System.out.println(animal.getColor().getColor());
        System.out.println(animal.getColor().getColorId());

        /*Animal animal2 = (Animal)applicationContext.getBean("animal2");
        System.out.println(animal2.getHeight());
        System.out.println(animal2.getWeight());
        System.out.println(animal2.getSpeciesName());
        System.out.println(animal2.getColor().getColor());
        System.out.println(animal2.getColor().getColorId());
*/
        /*ALIAS*/
          Animal animal3 = (Animal)applicationContext.getBean("animal13");
        System.out.println(animal3.getHeight());
        System.out.println(animal3.getWeight());
        System.out.println(animal3.getSpeciesName());
        System.out.println(animal3.getColor().getColor());
        System.out.println(animal3.getColor().getColorId());

        /*Collection injection*/
        /*List*/
        Animal animal4 = (Animal)applicationContext.getBean("animal4");
        System.out.println(animal4.getNames());
        /*set*/
        Animal animal5 = (Animal)applicationContext.getBean("animal5");
        System.out.println(animal5.getNamesSet());
        /*Map*/
        Animal animal6 = (Animal)applicationContext.getBean("animal6");
        System.out.println(animal5.getNamesSet());
    }
}
