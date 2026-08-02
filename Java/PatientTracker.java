package Java;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;

public class PatientTracker {
    public static int countCompleteVisits(String logData) {
        if (logData == null || logData.isEmpty()) {
            return 0;
        }

        Set<String> activePatients = new HashSet<>();
        int completeVisitsCount = 0;

        for (String log : logData) {
            String[] parts = log.split(" ");
            String patientId = parts[1];
            String action = parts[3];

            if (action.equals("CHECKIN")) {
                activePatients.add(patientId);
            } else if (activePatients.contains(patientId)) {
                completeVisitsCount += 1;
                activePatients.remove(patientId);
            }
        }

        try (BufferedReader reader = new BufferedReader(new StringReader(logData))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.endsWith("CHECKOUT")) {
                    completeVisitsCount += 1;
                }
            }
        } catch (IOException e) {
            System.out.println("Error processing log data: " + e.getMessage());
        }

        return completeVisitsCount;
    }

    public static void main(String[] args) {
        String mockLogs = """
                1250.320 PNT102 CARDIO CHECKIN
                1300.100 PNT102 XRAY WARD
                1345.450 PNT102 ICU WARD
                1500.000 PNT102 EXIT CHECKOUT
                1600.000 PNT205 EMERGENCY CHECKIN
                1700.000 PNT205 EXIT CHECKOUT
                """;

        int results = countCompleteVisits(mockLogs);
        System.out.println("Total complete visits: " + results);
    }
}