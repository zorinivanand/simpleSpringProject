package ru.zorinivan.simplespringproject2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class Man1 {
    private Profile profile;

    public Man1(Profile profile){
        this.profile=profile;
    }

    public void getProfile(){
        System.out.println("Making:  "+profile.getInfo());
    }

}
