package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

public class SetterGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "hi setter";
    }
}
