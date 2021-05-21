package ru.zorinivan.simplespringproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("peopleForm")
public class PeopleForm {
    private Man1 man1;
    private  Man2 man2;

    @Autowired
    public PeopleForm(Man1 man1, Man2 man2){
        this.man1 = man1;
        this.man2 = man2;
    }
    public String getInfoPeople(){
        return "Username:  "+ man1.getInfoName()  +System.lineSeparator() + "UserAge:  "+man1.getInfoAge();
//        System.out.println("Username:  "+ man1.getInfoName()  +System.lineSeparator() + "UserAge:  "+man1.getInfoAge());
//        System.out.println("Username:  "+ man2.getInfoName()  +System.lineSeparator() + "UserAge:  "+man2.getInfoAge());

    }
}
