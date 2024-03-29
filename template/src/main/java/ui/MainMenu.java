package ui;

import JDBC.JDBCManager;
import Pojos.User;
import anemiaDiagnosis.Parameters;
import anemiaDiagnosis.ParametersUnit;
import anemiaDiagnosis.Patient;
import org.drools.ruleunits.api.RuleUnitInstance;
import org.drools.ruleunits.api.RuleUnitProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainMenu {
    private static Patient patient;
    private static Parameters parameters;
    private static File finalReport;

    public static void menu(){

        patient = null;
        parameters = null;
        finalReport = null;

        int option;
        while (true) {

            Utilities.showMenu();
            option = Utilities.readInteger("Choose an option: ");

            switch (option) {
                case 1: {
                    System.out.println("Register personal data");
                    patient = Utilities.askPersonalData();
                    break;
                }
                case 2: {
                    System.out.println("Load patient's hemogram");
                    try {
                        String route = "CSV\\" + patient.getName() + "_" + patient.getSurname() + ".csv";
                        DataReader.readHemogram(route, patient);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (NullPointerException n) {
                        System.out.println("ERROR: you must first register patient's data");
                    }
                    System.out.println(patient.getParameters());
                    break;

                }

                case 3: {
                    System.out.println("Introduce visible signs and symptons");
                    try {
                        Parameters.setParameters(patient);
                        parameters = patient.getParameters();
                    } catch (NullPointerException np) {
                        System.out.println("ERROR: you must first register patient's data");
                    }
                    break;
                }

                case 4: {
                    System.out.println("Perform the anemia diagnosis supported by a DSS");

                    ParametersUnit parametersUnit = new ParametersUnit();
                    RuleUnitInstance<ParametersUnit> instance = RuleUnitProvider.get().createRuleUnitInstance(parametersUnit);
                    try {
                        parametersUnit.getParameters().add(parameters);
                        instance.fire();


                    } finally {
                        instance.close();
                    }

                    break;

                }

                case 5: {
                    System.out.println("Patient's diagnosis report");
                    try {
                        finalReport = patient.storeFinalReport();
                        Utilities.showReport(finalReport);
                    } catch (NullPointerException e) {
                        System.out.println(" ERROR: You must first register your patient information.");
                    } catch (FileNotFoundException fn) {
                        System.out.println();
                    }
                    break;
                }

                case 0: {
                    System.out.println("Loggin out...");
                    //user = null;
                    return;
                }

                default: {
                    System.out.println(" ERROR: Invalid option.");
                    break;
                }
            }
        }
    }
}
















    /*public static void main(String[] args) {

        ParametersUnit parametersUnit = new ParametersUnit();

        RuleUnitInstance<ParametersUnit> instance = RuleUnitProvider.get().createRuleUnitInstance(parametersUnit);
        try{
            Parameters p1 = new Parameters(7.0f, 20.0f, 52, 8.1f, 12.0f, 2.4f, 5.0f, 5.0f, 90, 330, 100, 0.5f, 100, 50.5f, 20.5f, 250, 3.0f, 20.0f, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
            parametersUnit.getParameters().add(p1);

            instance.fire();
            System.out.println(p1);

        }finally{
            instance.close();
        }

    }*/

