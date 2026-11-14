import java.util.ArrayList;
import java.util.List;

public abstract class Pet {
    protected String name;

    // Pet "has" 0..* Appointment
    private List<Appointment> appointments = new ArrayList<>();

    public abstract String getType();

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}
