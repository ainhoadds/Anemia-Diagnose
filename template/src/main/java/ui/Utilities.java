package ui;


import anemiaDiagnosis.BloodVolume;
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
                + "\n 1. Register personal data and load patient's hemogram"
                + "\n 2. Introduce visible signs and symptons "
                + "\n 3. Perform the anemia diagnosis supported by a DSS"
                + "\n 4. Patient's diagnosis report"
                + "\n 0. Log out");

    }

    public static void LogInMenu(){ //shows the Log In Menu

        System.out.println("\nWelcome to the Anemia Diagnostic DSS Program: "
                + "\n 1. Log In"
                + "\n 2. Register"
                + "\n 0. Exit");

    }

    public static void setParameters(Patient p) throws NullPointerException{
        if (p == null){
            throw new NullPointerException();
        }
        Utilities.showSignsAndSymptons();
        System.out.println("Introduce the number(s) of the symptoms that the patient presents: ");
        System.out.println(" Press 0 to exit: ");
        while(true) {
            int i = Utilities.readInteger("   ");
            if(i == 0) {
                break;
            } else {
                switch (i){
                    case 1: {
                        p.getParameters().setSkinPalenes(true);
                        break;
                    }
                    case 2: {
                        p.getParameters().setTachycardia(true);
                        break;
                    }
                    case 3:{
                        p.getParameters().setTinnitus(true);
                        break;
                    }
                    case 4:{
                        p.getParameters().setPalpitations(true);
                        break;
                    }
                    case 5:{
                        p.getParameters().setChestPain(true);
                        break;
                    }
                    case 6:{
                        p.getParameters().setInfarction(true);
                        break;
                    }
                    case 7:{
                        p.getParameters().setDizziness(true);
                        break;
                    }
                    case 8:{
                        p.getParameters().setBlurredVision(true);
                        break;
                    }
                    case 9:{
                        p.getParameters().setHeadAche(true);
                        break;
                    }
                    case 10:{
                        p.getParameters().setFatigue(true);
                        break;
                    }
                    case 11:{
                        p.getParameters().setMusclePain(true);
                        break;
                    }
                    case 12:{
                        p.getParameters().setDyspnea(true);
                        break;
                    }
                    case 13:{
                        p.getParameters().setTachypnea(true);
                        break;
                    }
                    case 14:{
                        p.getParameters().setColdLimp(true);
                        break;
                    }
                    case 15:{
                        p.getParameters().setInternHemorrage(true);
                        break;
                    }
                    case 16:{
                        p.getParameters().setExternHemorrage(true);
                        break;
                    }
                    case 17:{
                        p.getParameters().setNausea(true);
                        break;
                    }
                    case 18:{
                        p.getParameters().setJaundice(true);
                        break;
                    }
                    case 19:{
                        p.getParameters().setSplenomegalia(true);
                        break;
                    }
                    case 20:{
                        p.getParameters().setCranealBallooning(true);
                        break;
                    }
                    case 21:{
                        p.getParameters().setAplasticCrisis(true);
                        break;
                    }
                    case 22:{
                        p.getParameters().setBacterianInfection(true);
                        break;
                    }
                    case 23:{
                        p.getParameters().setOsteoporosis(true);
                        break;
                    }
                    case 24:{
                        p.getParameters().setBoneDeformation(true);
                        break;
                    }
                    case 25:{
                        p.getParameters().setMaxilarBoneHyperplasia(true);
                        break;
                    }
                    case 26:{
                        p.getParameters().setBrittleNails(true);
                        break;
                    }
                    case 27:{
                        p.getParameters().setTongueInflamation(true);
                        break;
                    }
                    case 28:{
                        p.getParameters().setDiarrhoea(true);
                        break;
                    }
                    case 29:{
                        p.getParameters().setParesthesia(true);
                        break;
                    }
                    case 30:{
                        p.getParameters().setPetechiae(true);
                        break;
                    }
                    default: {
                        System.out.println(" ERROR: Invalid option.");
                        break;
                    }
                }
            }
        }
    }

    public static Patient readHemogram(String fileroute, Patient patient) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileroute));
        String titleLine = br.readLine(); //Reads the first row (title)
        String[] title = titleLine.split(",");
        String line = br.readLine(); //Reads the second row
        String[] data = line.split(",");

        if (title.length != data.length){
            System.out.println("Error, CSV data is not correct");
        } else {
            for (int i = 0; i < title.length; i++){
                switch (title[i]){
                    case "hb":
                        float hb = Float.parseFloat(data[i]);
                        patient.getParameters().setHb(hb);
                        break;
                    case "epo":
                        float epo = Float.parseFloat(data[i]);
                        patient.getParameters().setEpo(epo);
                        break;
                    case "hematocrit":
                        int hematocrit = Integer.parseInt(data[i]);
                        patient.getParameters().setHematocrit(hematocrit);
                        break;
                    case "plaquets":
                        float plaquets = Float.parseFloat(data[i]);
                        patient.getParameters().setPlaquets(plaquets);
                        break;
                    case "anysocytosis":
                        float anysocytosis = Float.parseFloat(data[i]);
                        patient.getParameters().setAnysocytosis(anysocytosis);
                        break;
                    case "retyculocytes":
                        float retyculocytes = Float.parseFloat(data[i]);
                        patient.getParameters().setRetyculocytes(retyculocytes);
                        break;
                    case "leucocytes":
                        float leucocytes = Float.parseFloat(data[i]);
                        patient.getParameters().setLeucocytes(leucocytes);
                        break;
                    case "bloodVolume":
                        BloodVolume bv;
                        if(data[i].equalsIgnoreCase("INCREASED")){
                            bv = BloodVolume.INCREASED;
                        } else {
                            bv = BloodVolume.DECREASED;
                        }
                        patient.getParameters().setBloodVolume(bv);
                        break;
                    case "rbc":
                        float rbc = Float.parseFloat(data[i]);
                        patient.getParameters().setRbc(rbc);
                        break;
                    case "mcv":
                        int mcv = Integer.parseInt(data[i]);
                        patient.getParameters().setMcv(mcv);
                        break;
                    case "mch":
                        int mch = Integer.parseInt(data[i]);
                        patient.getParameters().setMch(mch);
                        break;
                    case "mchc":
                        int mchc = Integer.parseInt(data[i]);
                        patient.getParameters().setMchc(mchc);
                        break;
                    case "fe":
                        int fe = Integer.parseInt(data[i]);
                        patient.getParameters().setFe(fe);
                        break;
                    case "bilirubine":
                        float bilirubine = Float.parseFloat(data[i]);
                        patient.getParameters().setBilirubin(bilirubine);
                        break;
                    case "ldh":
                        int ldh = Integer.parseInt(data[i]);
                        patient.getParameters().setLdh(ldh);
                        break;
                    case "haptoglobin":
                        float haptoglobin = Float.parseFloat(data[i]);
                        patient.getParameters().setHaptoglobin(haptoglobin);
                        break;
                    case "ferritin":
                        float ferritin = Float.parseFloat(data[i]);
                        patient.getParameters().setFerritin(ferritin);
                        break;
                    case "b12":
                        float b12 = Float.parseFloat(data[i]);
                        patient.getParameters().setB12(b12);
                        break;
                    case "folicAcid":
                        float folicAcid = Float.parseFloat(data[i]);
                        patient.getParameters().setFolicAcid(folicAcid);
                        break;
                    case "glucocorticoids":
                        float glucocorticoids = Float.parseFloat(data[i]);
                        patient.getParameters().setGlucocorticoids(glucocorticoids);
                        break;
                    case "hbUrine":
                        boolean hbUrine = Boolean.parseBoolean(data[i]);
                        patient.getParameters().setHbUrine(hbUrine);
                        break;
                    case "feUrine":
                        boolean feUrine = Boolean.parseBoolean(data[i]);
                        patient.getParameters().setFeUrine(feUrine);
                }
            }
        }
        return patient;
    }

}
