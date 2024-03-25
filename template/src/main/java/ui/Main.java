package ui;

import anemiaDiagnosis.BloodVolume;
import anemiaDiagnosis.Parameters;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {
    public static void main(String[] args) {

        // motor de reglas
        KieServices ks = KieServices.Factory.get(); //instancia de KieServices que es
        KieContainer kc = ks.getKieClasspathContainer(); //contenedor de reglas

        execute(kc);
    }

    public static void execute(KieContainer kc){

        //carga las reglas aso
        KieSession ksession = kc.newKieSession("AnemiaKS"); //Drools utiliza config predeterminada para ejecutar las reglas
        System.out.println(ksession);

        //creo parametros
        Parameters p1 = new Parameters(7,20,true,true,true,true,true,true,true,true,true,true,true,true,true,true);
        Parameters p2 = new Parameters(3, BloodVolume.DECREASED,3,300,50,true,true,true,true,true,true,true,true);
        Parameters p3 = new Parameters(10,20,3,6,200,40,true,true,200,2,200,30,true,true,true,true,true,true);


        //System.out.println(p1);
        //System.out.println(p2);
        //System.out.println(p3);

        //insertar datos en el motor de reglas
        insertData(ksession,p1);
        insertData(ksession,p2);
        insertData(ksession,p3);

        ksession.fireAllRules();

        //imprimo el atributo de anemia para ver que reglas hans ido aplicadas y que anemia ha sido atribuida (o no) a los parametros que les hemos pasado.
        System.out.println(p1.getAnemia());
        System.out.println(p2.getAnemia());
        System.out.println(p3.getAnemia());

        ksession.dispose();


    }
    public static void insertData(KieSession ksession,Parameters p){
        ksession.insert(p);
    }
}

