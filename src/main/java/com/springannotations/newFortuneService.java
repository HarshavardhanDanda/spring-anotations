package com.springannotations;

import org.springframework.stereotype.Component;

public class newFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "this is new fortune";
    }
}
