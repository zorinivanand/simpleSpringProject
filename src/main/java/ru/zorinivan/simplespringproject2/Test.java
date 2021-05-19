package ru.zorinivan.simplespringproject2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Profile profile = context.getBean("NameBean", NameBean.class);
        Man1 manName = new Man1(profile);
        manName.getProfile();
        Profile profile1 = context.getBean("BeanYear", BeanYear.class);
        Man1 manYear = new Man1(profile1);
        manYear.getProfile();



        context.close();
    }
}
