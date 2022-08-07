package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

public class PropertyGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "hi property";
    }
}
