package anemiaDiagnosis;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;

public class PatientUnit implements RuleUnitData { //La clase implementa el interfaz RuleUnitDta

    private final DataStore<Patient> patients;

    public PatientUnit() {
        this(DataSource.createStore());
    }

    public PatientUnit(DataStore<Patient> patients) {
        this.patients = patients;
    }

    public DataStore<Patient> getPatients() {
        return patients;
    }


}
