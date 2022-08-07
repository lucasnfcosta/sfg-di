package guru.springframework.sfgdi.services;


public class I18nEnglishGreetingService implements GreetingService{

    @Override
    public String getGreeting() {
        return "Hello World!";
    }

    
}
