import java.util.ArrayList;
import java.util.List;

public class Vet {
    private String name;

    // Vet "attends" 1 -- 0..* Appointment
    private List<Appointment> appointments = new ArrayList<>();

    public void addAppointment(Appointment a) {
        appointments.add(a);
    }
}
