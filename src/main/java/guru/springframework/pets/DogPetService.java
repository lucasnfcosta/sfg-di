package guru.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("petService")
@Profile("dog")
public class DogPetService implements PetService{

    @Override
    public String getPetType() {
        return "dogs are the best!";
    }
    
}
