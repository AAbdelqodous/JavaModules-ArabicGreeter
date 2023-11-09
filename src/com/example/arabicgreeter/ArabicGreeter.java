package com.example.arabicgreeter;

import com.example.greeterapi.Greeter;

public class ArabicGreeter implements Greeter {
    @Override
    public String greet(String name) {
        return "As-salam " +name;
    }
}
