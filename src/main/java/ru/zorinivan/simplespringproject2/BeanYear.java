package ru.zorinivan.simplespringproject2;

import org.springframework.stereotype.Component;

@Component("BeanYear")
class BeanYear implements Profile  {

    @Override
    public String getInfo() {
        return "4";
    }
}
