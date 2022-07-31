package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.SetterGreetingService;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp(){
        setterInjectedController = new SetterInjectedController();

        setterInjectedController.setGreetingService(new SetterGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting());
    }
}
