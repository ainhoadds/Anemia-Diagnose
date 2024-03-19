package anemiaDiagnosis;


import org.drools.ruleunits.api.RuleUnitProvider;
import org.drools.ruleunits.api.RuleUnitInstance;
import org.junit.Test; //Importa la anotación Test de JUnit, que se utiliza para marcar métodos como pruebas unitarias.
import org.slf4j.Logger; //Importa las clases Logger y LoggerFactory del paquete org.slf4j, que se utilizan para registrar mensajes de registro.
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class OperationUnitTest {


    static final Logger LOG = LoggerFactory.getLogger(OperationUnitTest.class);
        //Declara una constante estática LOG para registrar mensajes relacionados con esta clase de prueba.
    @Test
    public void test() {
        LOG.info("Creating RuleUnit");
        ParametersUnit operationUnit = new ParametersUnit();

        RuleUnitInstance<ParametersUnit> instance = RuleUnitProvider.get().createRuleUnitInstance(operationUnit);
        try {
            LOG.info("Insert data"); //Registra un mensaje de información indicando que se están insertando datos.
            //Crea varias instancias de la clase Operation con diferentes valores para probar.
            Patient op1 = new Patient(1, true, false, true, BloodVolume.INCREASED, 100, 1000, 500);
            Patient op2 = new Patient(2, true, false, true, BloodVolume.DECREASED, 100, 1000, 500);
            Patient op3 = new Patient(3, true, false, true, BloodVolume.DECREASED, 1000, 100, 500);
            Patient op4 = new Patient(4, true, false, true, BloodVolume.DECREASED, 1000, 10000, 500);
            Patient op5 = new Patient(5, true, true, true, BloodVolume.INCREASED, 100, 1000, 500);
            Patient op6 = new Patient(6, false, true, true, BloodVolume.DECREASED, 100, 1000, 500);
            Patient op7 = new Patient(6, false, true, true, BloodVolume.DECREASED, 100, 1000, 500);

            //Agrega las operaciones creadas anteriormente a operationUnit.
            operationUnit.getParameters().add(op1);
            operationUnit.getParameters().add(op2);
            operationUnit.getParameters().add(op3);
            operationUnit.getParameters().add(op4);
            operationUnit.getParameters().add(op5);
            operationUnit.getParameters().add(op6);
            operationUnit.getParameters().add(op7);

            LOG.info("Run query. Rules are also fired");
            //Registra un mensaje de información indicando que se está ejecutando una consulta y que también se activarán reglas.
            instance.fire(); //el método fire() en la instancia de RuleUnitInstance, ejecuta las reglas.

            //Ejecuta la query "FindAuthorizedOperations" en la instancia de RuleUnitInstance y almacena el resultado en una lista llamada authorizedOperations.
            List<Patient> authorizedOperations = instance.executeQuery("FindAuthorizedOperations").toList("$operations");

            //Comprueba que solo haya una operación autorizada en la lista authorizedOperations y que sea igual a op3.
            assertEquals(1, authorizedOperations.size());
            assertEquals(op3, authorizedOperations.get(0));


        } finally {
            instance.close();
        }
    }

}