package anemiaDiagnosis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Patient {

    private String name;
    private String surname;
    private final int id_patient; // id of the patient
    private Anemia anemia;
    private Parameters parameters;


    public Patient(String name, String surname, int id_patient) {
        this.name = name;
        this.surname = surname;
        this.id_patient = id_patient;
        this.anemia = null;
        parameters = new Parameters();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId_patient() {
        return id_patient;
    }
    public Anemia getAnemia() {
        return anemia;
    }
    public Parameters getParameters() {
        return parameters;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAnemia(Anemia anemia) {
        this.anemia = anemia;
    }
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public File storeFinalReport() throws FileNotFoundException { //creates a txt file with the patient data
        File file = new File("Reports\\" + name + "_" + surname + ".txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(this.toString());
        pw.close();
        return file;
    }

    @Override //calculates a hash code based in the id_patient attribute of the class
    public int hashCode() { //hashCode for obtaining the hash code of an object (numeric value that respresents in an unique way the object status )
        int hash = 7; //initialize a local hash variable with an initial value of 7. This value could be any inital value.

        //Calculates the hash code combining the actual hash value and the value of id_operation.Easy way of calculating the hash code
        //that multiplies the existing hash code by a prime number (89) then. it adds the value of the attribute id_operation
        //id_operation
        hash = 89 * hash + this.id_patient;
        return hash;
    }

    //takes an object as the argument adn returns a boolean that indicates if the actual object is
    //the same as the object that has been passed as the argument

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj; //casts the propocionated object (obj) to an instance
        // of the class Patient, as it now knows that they are the same object
        if (this.id_patient != other.id_patient) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String s = "Patient ID: " + id_patient + "\n"
                + "Name: " + name + " " + surname + "\n"
                + "\nAnalytic Parameters: \n" + parameters.toString();

        if(anemia == null){
            s = s + "\nAnemia risk probability: " + parameters.getRisk();
        } else {
            s = s + "\nAnemia type: " + anemia + "\n";
        }
        return s;
    }
}
