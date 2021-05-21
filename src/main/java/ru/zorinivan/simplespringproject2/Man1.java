package ru.zorinivan.simplespringproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("man1")
class Man1 implements Profile  {

    public Profile profile;


    @Autowired
    public void setProfile(Profile profile){this.profile = profile;
    }
    @Override
    public int getInfoAge() {
        return 24;
    }

    @Override
    public List<String> getInfoName() {
        List<String> list = new ArrayList<>();
        list.add("Angelica");
        list.add("Sergeevna");
        list.add("Zorina");
        return list;
    }



}
