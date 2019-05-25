package com.parkview.springdemo;

public class StringFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Catch lightning in a bottle for good fortune";
    }
}
