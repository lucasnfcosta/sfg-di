package guru.springframework.sfgdi.services;

public class PropertyGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "hi property";
    }
}
