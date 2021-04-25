package ru.zorinivan.simplespringproject2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Bean bean = context.getBean("Bean",Bean.class);
        System.out.println(Bean.getName());
        context.close();
    }
}
