package ui;


import anemiaDiagnosis.Patient;

import java.io.*;

public abstract class Utilities {
    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);

    public static int readInteger(String question) {

        int num;
        String line;
        while (true) {
            try {
                System.out.print(question);
                line = br.readLine();
                num = Integer.parseInt(line);
                return num;

            } catch (IOException ioe) {
                System.out.println(" ERROR: Unable to read.");

            } catch (NumberFormatException nfe) {
                System.out.println(" ERROR: Must be a integer number.");
            }
        }
    }
    public static String readString(String question) {

        String line;
        while (true) {
            try {
                System.out.print(question);
                line = br.readLine();
                return line;

            } catch (IOException ioe) {
                System.out.println(" ERROR: Unable to read.");
            }
        }
    }

    public static Patient askPersonalData(){
        while(true) {
            String name = readString("Name: ");
            String surname = readString("Surname: ");
            int id = readInteger("ID: ");

            return new Patient(name,surname,id);
        }

    }
    public static void showReport(File report) {

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(report));
            String line;
            System.out.println("\nPatient file content: (" + report.getName() + ")");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println(" ERROR: File under " + report.getName() + " not found.");
        } catch (IOException e) {
            System.out.println(" ERROR: Unable to read file correcly.");
        }
    }
    public static void showSignsAndSymptons() {
        System.out.println("\nAnemic signs and symptons: "
                + "\n 1. Skin paleness"
                + "\n 2. Tachycardia"
                + "\n 3. Tinnitus "
                + "\n 4. Palpitations"
                + "\n 5. Chest Pain"
                + "\n 6. Infraction"
                + "\n 7. Dizziness"
                + "\n 8. Blurred vision"
                + "\n 9. Hedache"
                + "\n 10. Fatigue"
                + "\n 11. Muscle Pain"
                + "\n 12. Dyspnea"
                + "\n 13. Tachypena"
                + "\n 14. Cold limps (cold hands/feet)"
                + "\n 15. Intern Hemorrage"
                + "\n 16. Extern Hemorrage"
                + "\n 17. Nausea"
                + "\n 18. Jaundice"
                + "\n 19. Splenomegalia"
                + "\n 20. Cranean balloning"
                + "\n 21. Aplastic Crisis"
                + "\n 22. Bacterian infection"
                + "\n 23. Osteoporosis"
                + "\n 24. Bone deformation"
                + "\n 25. Maxilar Bone Hyperplasia"
                + "\n 26. Brittle Nails"
                + "\n 27. Tongue inflamation"
                + "\n 28. Diarrhoea"
                + "\n 29. Paresthesia"
                + "\n 30. Petechiae");

    }


    public static void showMenu(){ //shows the Menu

        System.out.println("\nAnemia Diagnostic menu: "
                + "\n 1. Register personal data"
                + "\n 2. Load patient's hemogram"
                + "\n 3. Introduce visible signs and symptons "
                + "\n 4. Perform the anemia diagnosis supported by a DSS"
                + "\n 5. Patient's diagnosis report"
                + "\n 0. Exit");

    }


}
