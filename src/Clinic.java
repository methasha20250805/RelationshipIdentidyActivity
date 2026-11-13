import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private String name;

    // Aggregation: Clinic "employs" 1 -- 1..* Vet
    private List<Vet> vets = new ArrayList<>();

    public void addVet(Vet vet) {
        vets.add(vet);
    }
}