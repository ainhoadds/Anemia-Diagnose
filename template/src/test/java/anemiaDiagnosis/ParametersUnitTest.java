package anemiaDiagnosis;


import org.drools.ruleunits.api.RuleUnitProvider;
import org.drools.ruleunits.api.RuleUnitInstance;
import org.junit.Test; //Importa la anotación Test de JUnit, que se utiliza para marcar métodos como pruebas unitarias.
import org.slf4j.Logger; //Importa las clases Logger y LoggerFactory del paquete org.slf4j, que se utilizan para registrar mensajes de registro.
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ParametersUnitTest {


    static final Logger LOG = LoggerFactory.getLogger(ParametersUnitTest.class);
        //Declara una constante estática LOG para registrar mensajes relacionados con esta clase de prueba.

    @Test //tests that the rules are trigged
    public void test() {
        LOG.info("Creating RuleUnit");
        ParametersUnit parametersUnit = new ParametersUnit();
        RuleUnitInstance<ParametersUnit> instance = RuleUnitProvider.get().createRuleUnitInstance(parametersUnit);
        try {
            LOG.info("Insert data"); //Registra un mensaje de información indicando que se están insertando datos.

            //parameter that makes rule "Anemic syndrome" trigged
            Parameters p1 = new Parameters(7,20, true,true,true,true,true,true,true,true,true,true,true,true,true,true);
            //parameter that makes rule "Post hemorragic anemia" trigged
            Parameters p2 = new Parameters(3, BloodVolume.DECREASED,3,300,50,true,true,true,true,true,true,true,true);
            //parameter that makes rule "Hemolytic anemia" trigged

            Parameters p3 = new Parameters(10,20,3,6,200,40,true,true,200,2,200,30,true,true,true,true,true,true);
            //Agrega las operaciones creadas anteriormente a parametersUnit.

            parametersUnit.getParameters().add(p1);
            parametersUnit.getParameters().add(p2);
            parametersUnit.getParameters().add(p3);

            LOG.info("Run query. Rules are also fired");
            //Registra un mensaje de información indicando que se está ejecutando una consulta y que también se activarán reglas.
            instance.fire(); //el método fire() en la instancia de RuleUnitInstance, ejecuta las reglas.
            //Ejecuta la query "Diagnose" en la instancia de RuleUnitInstance y almacena el resultado en una lista llamada queryResult.
            List<Parameters> queryResult = instance.executeQuery("Diagnose").toList("$parameters");
            System.out.println(queryResult.size());

            //Comprueba que hay dos parametros en la lista de queryResult y que sea igual a p1 y p3, que corresponden con las anemias cuya hb es <18.5
            assertEquals(1, queryResult.size());
            assertEquals(p3, queryResult.get(0)); //verfica que el primer y tercer elemento de la lista sea p1 y p3;
            System.out.println(queryResult.get(0));





        } finally {
            instance.close();
        }
    }
    @Test //tests that the rules are NOT trigged due to no parameter matching
    public void test2() {
        LOG.info("Creating RuleUnit");
        ParametersUnit parametersUnit = new ParametersUnit();
        RuleUnitInstance<ParametersUnit> instance = RuleUnitProvider.get().createRuleUnitInstance(parametersUnit);
        try {
            LOG.info("Insert data"); //Registra un mensaje de información indicando que se están insertando datos.

            //parameter that doesnt trigger any rule
            Parameters p = new Parameters();
            //Agrega las operaciones creadas anteriormente a operationUnit.

            parametersUnit.getParameters().add(p);


            LOG.info("Run query. Rules are also fired");
            //Registra un mensaje de información indicando que se está ejecutando una consulta y que también se activarán reglas.
            instance.fire(); //el método fire() en la instancia de RuleUnitInstance, ejecuta las reglas.
            //Ejecuta la query "Diagnose" en la instancia de RuleUnitInstance y almacena el resultado en una lista llamada queryResult.
            List<Parameters> queryResult = instance.executeQuery("Diagnose").toList("$parameters");
            System.out.println(queryResult.size());

            //Comprueba que hay dos parametros en la lista de queryResult y que sea igual a p1 y p3, que corresponden con las anemias cuya hb es <18.5
            assertEquals(0, queryResult.size());
            //assertEquals(p3, queryResult.get(0)); //verfica que el primer y tercer elemento de la lista sea p1 y p3;
            //System.out.println(queryResult.get(0));

        } finally {
            instance.close();
        }
    }

}