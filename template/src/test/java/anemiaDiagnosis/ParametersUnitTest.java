package anemiaDiagnosis;


import org.drools.ruleunits.api.RuleUnitInstance;
import org.drools.ruleunits.api.RuleUnitProvider;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;


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
            Parameters p1 = new Parameters(7.0f, 20.0f, 52, 8.1f, 12.0f, 2.4f, 5.0f, 5.0f, 90, 330, 100, 0.5f, 100, 50.5f, 20.5f, 250, 3.0f, 20.0f, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
            //parameter that makes rule "Post hemorragic anemia" trigged
            Parameters p2 = new Parameters(15.0f, 50, 8.1f, 12.1f, 2.6f, 5.1f, BloodVolume.DECREASED, 90, 0.5f, 100, 50.5f, 20.5f, 300, 3.0f, 20.0f, true, true, true, true, true, true, true, true);
            //parameter that makes rule "Hemolytic anemia" trigged

            Parameters p3 = new Parameters(9.0f, 20.0f, 52, 8.1f, 12.1f, 3.0f, 5.6f, 6.0f, 90, 33, 340, 180, 0.5f, 160, 40.0f, 20.5f, 250, 3.0f, 20.0f, true, true, true, true, true, true, true, true);
            //Agrega las operaciones creadas anteriormente a parametersUnit.
            Parameters p4 = new Parameters(52, 8.1f, 12.1f, 5.0f, 5.6f, 5.0f,0.6f, 79, 309, 100, 42.0f, 20.5f, 250, 3.0f, 20.0f,200, true, true, true, true, true, true, true);
            Parameters p5 = new Parameters(17.0f, 52, 8.1f, 12.1f, 2.0f, 5.6f, 5.0f, 79, 409, 100, 0.5f, 140, 43.0f, 20.5f, 250, 3.0f, 20.0f, true, true, true, true, true, true, true, true, true);
            Parameters p6 = new Parameters(3.0f, 52, 8.5f, 11.0f, 2.0f, 5.6f, 5.0f, 110, 370, 80, 0.5f, 100, 45.0f, 20.5f, 150, 20.0f, true, true, true, true, true);
            Parameters p7 = new Parameters(3.0f, 52, 7.0f, 12.0f, 2.0f, 4.0f, 90, 340, 80, 0.5f, 100, 45.0f, 20.5f, 250, 3.0f, 20.0f, true, true, true, true);
            Parameters p8 = new Parameters(2.5f, 52, 7.5f, 12.0f, 2.0f, 5.0f, 6.0f, 70, 320, 100, 0.5f, 100, 45.0f, 20.5f, 250, 3.0f, 20.0f, true, true, true, true, true, true);
            Parameters p9 = new Parameters(18.0f, 19.0f, 55, 12.0f, 14.0f, 2.0f, 4.0f, BloodVolume.INCREASED, 200,5.0f, 330, 100, 0.5f, 100, 45.0f, 20.5f, 250, 3.0f,26.7f, true, true, true, true, true);


            parametersUnit.getParameters().add(p1);
            parametersUnit.getParameters().add(p2);
            parametersUnit.getParameters().add(p3);
            parametersUnit.getParameters().add(p4);
            parametersUnit.getParameters().add(p5);
            parametersUnit.getParameters().add(p6);
            parametersUnit.getParameters().add(p7);
            parametersUnit.getParameters().add(p8);
            parametersUnit.getParameters().add(p9);






            LOG.info("Run query. Rules are also fired");
            //Registra un mensaje de información indicando que se está ejecutando una consulta y que también se activarán reglas.
            instance.fire(); //el método fire() en la instancia de RuleUnitInstance, ejecuta las reglas.
            //Ejecuta la query "Diagnose" en la instancia de RuleUnitInstance y almacena el resultado en una lista llamada queryResult.
            List<Parameters> queryResult = instance.executeQuery("Diagnose").toList("$parameters");
            System.out.println(queryResult.size());

            //Comprueba que hay dos parametros en la lista de queryResult y que sea igual a p1 y p3, que corresponden con las anemias cuya hb es <18.5
            assertEquals(1, queryResult.size());
            assertEquals(p9, queryResult.get(0)); //verfica que el primer y tercer elemento de la lista sea p1 y p3;
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