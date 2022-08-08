package guru.springframework.sfgdi.services;

public class SetterGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "hi setter";
    }
}
