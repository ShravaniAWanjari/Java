package Java;

import java.util.Objects;
import java.util.HashMap;

public class Patient {
    private final String id;
    private final String name;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        else if (o == null || getClass() != o.getClass())
            return false;

        Patient patient = (Patient) o;
        return Objects.equals(id, patient.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {

        HashMap<Patient, String> patientMap = new HashMap<>();
        Patient p1 = new Patient("P101", "Alice");
        patientMap.put(p1, "Room101");

        Patient p2 = new Patient("P101", "Alice");
        System.out.println(patientMap.get(p2));
    }
}