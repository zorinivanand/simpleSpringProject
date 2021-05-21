package ru.zorinivan.simplespringproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("store")
public class Store {
    private PeopleForm peopleForm;
    private int id;
@Autowired
    public Store(PeopleForm peopleForm) {
        this.id = 1;
        this.peopleForm = peopleForm;
    }

    @Override
    public String toString() {
        return peopleForm.getInfoPeople() + System.lineSeparator()+
                "Store id: " + id ;
    }
}
