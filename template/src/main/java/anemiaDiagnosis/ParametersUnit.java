package anemiaDiagnosis;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;

import java.util.HashSet;
import java.util.Set;

public class ParametersUnit implements RuleUnitData { //La clase implementa el interfaz RuleUnitDta

    private final DataStore<Parameters> parameters;
    public ParametersUnit() {
        this(DataSource.createStore());
    }

    public ParametersUnit(DataStore<Parameters> parameters) {
        this.parameters = parameters;
    }
    public DataStore<Parameters> getParameters() {
        return parameters;
    }

}
