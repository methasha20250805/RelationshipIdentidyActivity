import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;

    // Owner "owns" 1..* Pet
    private List<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet) {
        pets.add(pet);
    }
}