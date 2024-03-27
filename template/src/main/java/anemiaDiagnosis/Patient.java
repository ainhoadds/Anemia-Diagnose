package anemiaDiagnosis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author alberto.gildelafuent
 */
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
        parameters = new Parameters();
    }




    public void setAnemia(Anemia anemia) {
        this.anemia = anemia;
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

    public File storeFinalReport() throws FileNotFoundException {

        File file = new File("Reports\\" + name + "_" + surname + ".txt");

        PrintWriter pw = new PrintWriter(file);
        pw.println("\nPatient: " + name + " " + surname);
        pw.println("\nId: " +id_patient);
        pw.println("\nParameters: " + parameters.toString());
        pw.close();
        return file;

    }




    @Override //calcula un código hash basado en el atributo id_operation del objeto actual
    public int hashCode() { //hashCode para obtener el código hash de un objeto (valor numérico que representa de manera única el estado de un objeto)
        int hash = 7; //Inicializa una variable local hash con un valor de inicio de 7. Este valor es una convención y puede ser cualquier valor inicial.
        /*Calcula el código hash combinando el valor actual de hash con el valor de id_operation. Se utiliza una fórmula simple para calcular el código hash,
        que generalmente implica multiplicar el código hash existente por un número primo grande (en este caso, 89) y luego sumar el valor del atributo
        id_operation.*/
        hash = 89 * hash + this.id_patient;
        return hash;
    }

    /*Declara el método equals(), que toma un objeto como argumento y devuelve un valor booleano que indica si
    el objeto actual es igual al objeto proporcionado como argumento.*/
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
        final Patient other = (Patient) obj; //realiza un casting del objeto proporcionado (obj) a una instancia
        // de la clase Operation, ya que ahora se sabe que son de la misma clase.
        if (this.id_patient != other.id_patient) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id_patient=" + id_patient +
                ", anemia='" + anemia + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
