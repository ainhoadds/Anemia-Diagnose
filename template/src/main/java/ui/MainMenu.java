package ui;

import anemiaDiagnosis.Anemia;
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
                    System.out.println("Register personal data:");
                    patient = Utilities.askPersonalData();
                    System.out.println("Loading patient's hemogram...");
                    try {
                        String route = "CSV\\" + patient.getName() + "_" + patient.getSurname() + ".csv";
                        Utilities.readHemogram(route, patient);
                        System.out.println("Parameters loaded correctly");
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (NullPointerException n) {
                        System.out.println("ERROR: there is no hemogram data associated to the patient.");
                    }
                    break;
                }

                case 2: {
                    System.out.println("Introduce visible signs and symptons:");
                    try {
                        Utilities.setParameters(patient);
                        parameters = patient.getParameters();
                    } catch (NullPointerException np) {
                        System.out.println("ERROR: You must first register a patient.");
                    }
                    break;
                }

                case 3: {
                    System.out.println("Perform the anemia diagnosis supported by a DSS: ");
                    ParametersUnit parametersUnit = new ParametersUnit();
                    RuleUnitInstance<ParametersUnit> instance = RuleUnitProvider.get().createRuleUnitInstance(parametersUnit);
                    try {
                        parametersUnit.getParameters().add(parameters);
                        instance.fire();
                        patient.setAnemia(parameters.getAnemia());
                        if (parameters.getAnemia() == null) {
                            parameters.calculateRisk();
                        }

                    }catch(NullPointerException np) {
                        System.out.println("ERROR: You must first register patient and symptoms to fire the rules.");
                    }finally{
                        instance.close();
                    }
                    break;
                }

                case 4: {
                    System.out.println("Patient's diagnosis report:");
                    try {
                        finalReport = patient.storeFinalReport();
                        Utilities.showReport(finalReport);
                    } catch (NullPointerException e) {
                        System.out.println(" ERROR: You must first register a patient.");
                    } catch (FileNotFoundException fn) {
                        System.out.println();
                    }
                    break;
                }

                case 0: {
                    System.out.println("Loggin out...");
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



