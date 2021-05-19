package ru.zorinivan.simplespringproject2;

import org.springframework.stereotype.Component;

@Component ("NameBean")
class NameBean implements Profile{

    @Override
    public String getInfo() {
        return "UserName1";
    }
}
