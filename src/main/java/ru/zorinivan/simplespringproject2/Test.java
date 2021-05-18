package ru.zorinivan.simplespringproject2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Bean beanName = context.getBean("Bean",Bean.class);
        //beanName.setName("NEWNAME");
        System.out.println(Bean.getName());

        Bean beanYear = context.getBean("Bean",Bean.class);
        beanYear.setYear(2);
        System.out.println(Bean.getYear());
        context.close();
    }
}
