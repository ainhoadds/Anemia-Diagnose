package inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import anemiaDiagnosis.*;

public class DataReader {
    public static void readHemogram(String fileroute, Patient patient) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileroute));
        String titleLine = br.readLine(); //Reads the first row (title)
        String[] title = titleLine.split(",");
        String line = br.readLine(); //Reads the second row
        String[] data = line.split(",");
        /*float hb; //Hemoglobin
        float epo; //Eritropoyetin
        int hematocrit;
        float plaquets;
        float anysocytosis;
        float retyculocytes;
        float leucocytes;
        BloodVolume bloodVolume;
        float rbc; //Red Blood Cells
        int mcv; //Mean Corpuscular Volume
        int mch; //Mean Corpuscular Hemoglobin
        int mchc; //Mean Corpuscular Hemoglobin Concentration
        int fe; //Iron values
        float bilirubine;
        int ldh; //Lactate Dehydrogenase
        float haptoglobin;
        float ferritin;
        float b12; //Vitamin B12
        float folicAcid;
        float glucocorticoids;
        boolean hbUrine; //Amount of Hemoglobin in Urine
        boolean feUrine; // Amount of Iron in Urine*/
        if (title.length != data.length){
            System.out.println("Error, CSV data is not correct");
        } else {
            for (int i = 0; i < title.length; i++){
                switch (title[i]){
                    case "hb":
                        float hb = Float.parseFloat(data[i]);
                        patient.getParameters().setHb(hb);
                        break;
                    case "epo":
                        float epo = Float.parseFloat(data[i]);
                        patient.getParameters().setEpo(epo);
                        break;
                    case "hematocrit":
                        int hematocrit = Integer.parseInt(data[i]);
                        patient.getParameters().setHematocrit(hematocrit);
                        break;
                    case "plaquets":
                        float plaquets = Float.parseFloat(data[i]);
                        patient.getParameters().setPlaquets(plaquets);
                        break;
                    case "anysocytosis":
                        float anysocytosis = Float.parseFloat(data[i]);
                        patient.getParameters().setAnysocytosis(anysocytosis);
                        break;
                    case "retyculocytes":
                        float retyculocytes = Float.parseFloat(data[i]);
                        patient.getParameters().setRetyculocytes(retyculocytes);
                        break;
                    case "leucocytes":
                        float leucocytes = Float.parseFloat(data[i]);
                        patient.getParameters().setLeucocytes(leucocytes);
                        break;
                    case "bloodVolume":
                        BloodVolume bv;
                        if(data[i].equalsIgnoreCase("INCREASED")){
                            bv = BloodVolume.INCREASED;
                        } else {
                            bv = BloodVolume.DECREASED;
                        }
                        patient.getParameters().setBloodVolume(bv);
                        break;
                    case "rbc":
                        float rbc = Float.parseFloat(data[i]);
                        patient.getParameters().setRbc(rbc);
                        break;
                    case "mcv":
                        int mcv = Integer.parseInt(data[i]);
                        patient.getParameters().setMcv(mcv);
                        break;
                    case "mch":
                        int mch = Integer.parseInt(data[i]);
                        patient.getParameters().setMch(mch);
                        break;
                    case "mchc":
                        int mchc = Integer.parseInt(data[i]);
                        patient.getParameters().setMchc(mchc);
                        break;
                    case "fe":
                        int fe = Integer.parseInt(data[i]);
                        patient.getParameters().setFe(fe);
                        break;
                    case "bilirubine":
                        float bilirubine = Float.parseFloat(data[i]);
                        patient.getParameters().setBilirubine(bilirubine);
                        break;
                    case "ldh":
                        int ldh = Integer.parseInt(data[i]);
                        patient.getParameters().setLdh(ldh);
                        break;
                    case "haptoglobin":
                        float haptoglobin = Float.parseFloat(data[i]);
                        patient.getParameters().setHaptoglobin(haptoglobin);
                        break;
                    case "ferritin":
                        float ferritin = Float.parseFloat(data[i]);
                        patient.getParameters().setFerritin(ferritin);
                        break;
                    case "b12":
                        float b12 = Float.parseFloat(data[i]);
                        patient.getParameters().setB12(b12);
                        break;
                    case "folicAcid":
                        float folicAcid = Float.parseFloat(data[i]);
                        patient.getParameters().setFolicAcid(folicAcid);
                        break;
                    case "glucocorticoids":
                        float glucocorticoids = Float.parseFloat(data[i]);
                        patient.getParameters().setGlucocorticoids(glucocorticoids);
                        break;
                    case "hbUrine":
                        boolean hbUrine = Boolean.getBoolean(data[i]); //importante que el valor sea 'true' o 'false' en minúsculas, porque si no pondrá que es falso ponga lo que ponga
                        patient.getParameters().setHbUrine(hbUrine);
                        break;
                    case "feUrine":
                        boolean feUrine = Boolean.getBoolean(data[i]); //Igual que en hbUrine
                        patient.getParameters().setFeUrine(feUrine);
                }
            }
        }
    }
}
