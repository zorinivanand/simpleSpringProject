package ru.zorinivan.simplespringproject2;

import org.springframework.stereotype.Component;

@Component
class NameBean {
    private static String name;


    public NameBean(String name) {
        NameBean.name = name;
    }
    public static String getName() {
        return name;
    }
    public void setName(String name) {NameBean.name = name;}
}
