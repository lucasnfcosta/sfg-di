package guru.springframework.sfgdi.services;

public class PrimaryGreetingService implements GreetingService{

    @Override
    public String getGreeting() {
        return "Hello from primary";
    }
    
}
