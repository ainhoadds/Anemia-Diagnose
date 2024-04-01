package anemiaDiagnosis;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;

public class ParametersUnit implements RuleUnitData { //ruleUnit allows working with rule units

    private final DataStore<Parameters> parameters; //it will store Parameters
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
