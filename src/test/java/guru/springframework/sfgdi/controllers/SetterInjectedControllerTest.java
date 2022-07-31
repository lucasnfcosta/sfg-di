package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp(){
        setterInjectedController = new SetterInjectedController();

        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting());
    }
}
