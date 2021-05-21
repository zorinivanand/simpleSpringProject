package ru.zorinivan.simplespringproject2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component ("man2")
class Man2 implements Profile{
    @Override
    public int getInfoAge() {
        return 25;
    }

    @Override
    public List<String> getInfoName() {
        List<String> list = new ArrayList<>();
        list.add("IVAN");
        list.add("andreevich");
        list.add("zorin");


        return list;
    }


}
