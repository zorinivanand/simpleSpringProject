package ru.zorinivan.simplespringproject2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Store store = context.getBean("store", Store.class);
        System.out.println(store);




        context.close();
    }
}
