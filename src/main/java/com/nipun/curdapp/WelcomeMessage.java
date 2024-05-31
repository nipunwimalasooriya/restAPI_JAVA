package com.nipun.curdapp;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public String getWelcomeMessage() {
        return "Welcome to the spring Boot Application";

    }
}