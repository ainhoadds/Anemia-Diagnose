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
        //LOG registers messages associated with the test class

    @Test //tests that the rules are trigged
    public void test() {
        LOG.info("Creating RuleUnit");
        ParametersUnit parametersUnit = new ParametersUnit();
        RuleUnitInstance<ParametersUnit> instance = RuleUnitProvider.get().createRuleUnitInstance(parametersUnit);
        try {
            LOG.info("Insert data");

            //parameter that makes rule "anemic syndrome" trigged
            Parameters p1 = new Parameters();
            p1.setHb(6.0f);
            p1.setEpo(20.0f);
            p1.setHematocrit(52);
            p1.setPlaquets(8.1f);
            p1.setAnysocytosis(12.0f);
            p1.setRetyculocytes(2.4f);
            p1.setLeucocytes(5.0f);
            p1.setRbc(5.0f);
            p1.setMcv(90);
            p1.setMchc(330);
            p1.setFe(100);
            p1.setBilirubin(0.5f);
            p1.setLdh(100);
            p1.setHaptoglobin(50.5f);
            p1.setFerritin(11.5f);
            p1.setB12(250);
            p1.setFolicAcid(3.0f);
            p1.setGlucocorticoids(20.0f);
            p1.setSkinPalenes(true);
            p1.setTachycardia(true);
            p1.setTinnitus(true);
            p1.setPalpitations(true);
            p1.setChestPain(true);
            p1.setInfarction(true);
            p1.setDizziness(true);
            p1.setBlurredVision(true);
            p1.setHeadAche(true);
            p1.setFatigue(true);
            p1.setMusclePain(true);
            p1.setDyspnea(true);
            p1.setTachypnea(true);
            p1.setColdLimp(true);

            //parameter that makes rule "Post hemorragic anemia" trigged
            Parameters p2 = new Parameters();
            p2.setHb(11.2f);
            p2.setEpo(15.0f);
            p2.setHematocrit(50);
            p2.setPlaquets(8.1f);
            p2.setAnysocytosis(12.1f);
            p2.setRetyculocytes(2.6f);
            p2.setLeucocytes(5.1f);
            p2.setBloodVolume(BloodVolume.DECREASED);
            p2.setMcv(90);
            p2.setBilirubin(0.5f);
            p2.setLdh(100);
            p2.setHaptoglobin(50.5f);
            p2.setFerritin(9.5f);
            p2.setB12(300);
            p2.setFolicAcid(3.0f);
            p2.setGlucocorticoids(20.0f);
            p2.setSkinPalenes(true);
            p2.setTachycardia(true);
            p2.setDizziness(true);
            p2.setFatigue(true);
            p2.setDyspnea(true);
            p2.setTachypnea(true);
            p2.setInternHemorrage(true);
            p2.setExternHemorrage(true);

            //parameter that makes rule "Hemolytic anemia" trigged
            Parameters p3 = new Parameters();
            p3.setHb(9.0f);
            p3.setEpo(20.0f);
            p3.setHematocrit(52);
            p3.setPlaquets(8.1f);
            p3.setAnysocytosis(12.1f);
            p3.setRetyculocytes(3.0f);
            p3.setLeucocytes(5.6f);
            p3.setRbc(6.0f);
            p3.setMcv(90);
            p3.setMch(33);
            p3.setMchc(340);
            p3.setFe(180);
            p3.setBilirubin(1.7f);
            p3.setLdh(160);
            p3.setHaptoglobin(40.0f);
            p3.setFerritin(10.5f);
            p3.setB12(250);
            p3.setFolicAcid(3.0f);
            p3.setGlucocorticoids(20.0f);
            p3.setHbUrine(true);
            p3.setFeUrine(true);
            p3.setSkinPalenes(true);
            p3.setFatigue(true);
            p3.setJaundice(true);
            p3.setSplenomegalia(true);
            p3.setCranealBallooning(true);
            p3.setAplasticCrisis(true);

            //parameter that makes rule "InheritedSpherocytosis" trigged
            Parameters p4 = new Parameters();
            p4.setHb(12.5f);
            p4.setHematocrit(52);
            p4.setPlaquets(8.1f);
            p4.setAnysocytosis(12.1f);
            p4.setRetyculocytes(5.0f);
            p4.setLeucocytes(5.6f);
            p4.setRbc(5.0f);
            p4.setMcv(79);
            p4.setMchc(309);
            p4.setFe(100);
            p4.setBilirubin(1.5f);
            p4.setLdh(160);
            p4.setHaptoglobin(42.0f);
            p4.setFerritin(8.5f);
            p4.setB12(250);
            p4.setFolicAcid(3.0f);
            p4.setGlucocorticoids(20.0f);
            p4.setSplenomegalia(true);
            p4.setCranealBallooning(true);
            p4.setAplasticCrisis(true);
            p4.setBacterianInfection(true);
            p4.setOsteoporosis(true);
            p4.setBoneDeformation(true);
            p4.setMaxilarBoneHyperplasia(true);

            //parameter that makes rule "Thalassemia" trigged
            Parameters p5 = new Parameters();
            p5.setHb(11.2f);
            p5.setEpo(17.0f);
            p5.setHematocrit(52);
            p5.setPlaquets(8.1f);
            p5.setAnysocytosis(12.1f);
            p5.setRetyculocytes(2.0f);
            p5.setLeucocytes(5.6f);
            p5.setRbc(5.0f);
            p5.setMcv(79);
            p5.setMchc(409);
            p5.setFe(100);
            p5.setBilirubin(0.5f);
            p5.setLdh(140);
            p5.setHaptoglobin(43.0f);
            p5.setFerritin(7.5f);
            p5.setB12(250);
            p5.setFolicAcid(3.0f);
            p5.setGlucocorticoids(20.0f);
            p5.setSkinPalenes(true);
            p5.setPalpitations(true);
            p5.setHeadAche(true);
            p5.setFatigue(true);
            p5.setDyspnea(true);
            p5.setColdLimp(true);
            p5.setNausea(true);
            p5.setBrittleNails(true);
            p5.setTongueInflamation(true);

            //parameter that makes rule "MegaloblasticAnemia" trigged
            Parameters p6 = new Parameters();
            p6.setHb(10.4f);
            p6.setEpo(3.0f);
            p6.setHematocrit(52);
            p6.setPlaquets(8.5f);
            p6.setAnysocytosis(11.1f);
            p6.setRetyculocytes(2.0f);
            p6.setLeucocytes(5.6f);
            p6.setRbc(5.0f);
            p6.setMcv(110);
            p6.setMchc(730);
            p6.setFe(80);
            p6.setBilirubin(0.5f);
            p6.setLdh(100);
            p6.setHaptoglobin(45.0f);
            p6.setFerritin(10.5f);
            p6.setB12(150);
            p6.setGlucocorticoids(20.0f);
            p6.setSkinPalenes(true);
            p6.setFatigue(true);
            p6.setInternHemorrage(true);
            p6.setExternHemorrage(true);
            p6.setPetechiae(true);

            //parameter that makes rule "AplasticAnemia" trigged
            Parameters p7 = new Parameters();
            p7.setHb(13.2f);
            p7.setEpo(3.0f);
            p7.setHematocrit(52);
            p7.setPlaquets(7.0f);
            p7.setAnysocytosis(12.0f);
            p7.setRetyculocytes(2.0f);
            p7.setLeucocytes(4.0f);
            p7.setMcv(90);
            p7.setMchc(340);
            p7.setFe(80);
            p7.setBilirubin(0.5f);
            p7.setLdh(100);
            p7.setHaptoglobin(45.0f);
            p7.setFerritin(10.5f);
            p7.setB12(250);
            p7.setFolicAcid(3.0f);
            p7.setGlucocorticoids(20.0f);
            p7.setSkinPalenes(true);
            p7.setHeadAche(true);
            p7.setFatigue(true);
            p7.setDyspnea(true);

            //parameter that makes rule "ChronicAnemia" trigged
            Parameters p8 = new Parameters();
            p8.setHb(10.5f);
            p8.setEpo(2.5f);
            p8.setHematocrit(52);
            p8.setPlaquets(7.5f);
            p8.setAnysocytosis(12.0f);
            p8.setRetyculocytes(2.0f);
            p8.setLeucocytes(5.0f);
            p8.setRbc(6.0f);
            p8.setMcv(70);
            p8.setMchc(320);
            p8.setFe(100);
            p8.setBilirubin(0.5f);
            p8.setLdh(100);
            p8.setHaptoglobin(45.0f);
            p8.setFerritin(6.5f);
            p8.setB12(250);
            p8.setFolicAcid(3.0f);
            p8.setGlucocorticoids(20.0f);
            p8.setSkinPalenes(true);
            p8.setDizziness(true);
            p8.setHeadAche(true);
            p8.setFatigue(true);
            p8.setDyspnea(true);
            p8.setBrittleNails(true);

            //parameter that makes rule "Policythemia" trigged
            Parameters p9 = new Parameters();
            p9.setHb(18.0f);
            p9.setEpo(19.0f);
            p9.setHematocrit(55);
            p9.setPlaquets(12.0f);
            p9.setAnysocytosis(14.0f);
            p9.setRetyculocytes(2.0f);
            p9.setLeucocytes(4.0f);
            p9.setBloodVolume(BloodVolume.INCREASED);
            p9.setRbc(5.0f);
            p9.setMcv(200);
            p9.setMchc(330);
            p9.setFe(100);
            p9.setBilirubin(0.5f);
            p9.setLdh(100);
            p9.setHaptoglobin(45.0f);
            p9.setFerritin(5.6f);
            p9.setB12(250);
            p9.setFolicAcid(3.0f);
            p9.setGlucocorticoids(26.7f);
            p9.setDizziness(true);
            p9.setBlurredVision(true);
            p9.setHeadAche(true);
            p9.setFatigue(true);
            p9.setDyspnea(true);

            //parameter that makes rule "IronDeficiencyAnemia" trigged
            Parameters p10 = new Parameters();
            p10.setHb(11.0f);
            p10.setEpo(20.0f);
            p10.setHematocrit(45);
            p10.setAnysocytosis(11.0f);
            p10.setRetyculocytes(2.0f);
            p10.setRbc(5.0f);
            p10.setMcv(70);
            p10.setMchc(30);
            p10.setFe(15);
            p10.setBilirubin(0.5f);
            p10.setLdh(100);
            p10.setHaptoglobin(45.0f);
            p10.setFerritin(5.6f);
            p10.setB12(250);
            p10.setFolicAcid(3.0f);
            p10.setGlucocorticoids(32);
            p10.setSkinPalenes(true);
            p10.setFatigue(true);
            p10.setDyspnea(true);
            p10.setDiarrhoea(true);
            p10.setParesthesia(true);


            //parameters added to the rule unit to fire the rules over them
            parametersUnit.getParameters().add(p1);
            parametersUnit.getParameters().add(p2);
            parametersUnit.getParameters().add(p3);
            parametersUnit.getParameters().add(p4);
            parametersUnit.getParameters().add(p5);
            parametersUnit.getParameters().add(p6);
            parametersUnit.getParameters().add(p7);
            parametersUnit.getParameters().add(p8);
            parametersUnit.getParameters().add(p9);
            parametersUnit.getParameters().add(p10);

            LOG.info("Run query. Rules are also fired"); //message that indicates that query is being done and rules are beig executing
            instance.fire(); //el método fire() en la instancia de RuleUnitInstance, ejecuta las reglas.
            //Executes query "Diagnose" at the RuleUnitInstance instance y and stores the result in a list called queryResult.
            List<Parameters> queryResult = instance.executeQuery("Diagnose").toList("$parameters");
            System.out.println(queryResult.size());

            //checks that there is just one element at the queryResult that matches the query and that corresponds to parameter 9
            assertEquals(1, queryResult.size());
            assertEquals(p9, queryResult.get(0)); //checks that the one and only element of the list is p9
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
            LOG.info("Insert data");

            //parameter that doesnt trigger any rule
            Parameters p = new Parameters();
            //Adds the parameter to the rule unit to trigger the rules over it
            parametersUnit.getParameters().add(p);

            LOG.info("Run query. Rules are also fired");
            instance.fire(); //rules are trigged
            List<Parameters> queryResult = instance.executeQuery("Diagnose").toList("$parameters");
            System.out.println(queryResult.size());

            //checks that there are no expected parameters that asses the done query as any rule has been trigged
            assertEquals(0, queryResult.size());


        } finally {
            instance.close();
        }
    }

}