package guru.springframework.sfgdi.services;

public class I18nSpanishGreetingService implements GreetingService{

    @Override
    public String getGreeting() {
        return "Hola Mundo!";
    }
    
}
