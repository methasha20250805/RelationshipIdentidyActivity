import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Appointment implements Billable {
    private LocalDate date;

    // Composition: Appointment "contains" 0..* Prescription
    private List<Prescription> prescriptions = new ArrayList<>();

    // Association: Appointment "attends" -> 1 Vet
    private Vet vet;

    public void addPrescription(String medicine) {
        prescriptions.add(new Prescription(medicine));
    }

    @Override
    public double calculateFee() {
        return 0.0;
    }
}