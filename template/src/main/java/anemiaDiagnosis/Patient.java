package anemiaDiagnosis;

/**
 * @author alberto.gildelafuent
 */
public class Patient {

    private final int id_patient; // id of the operation
    private String anemia;

    //HEMOGRAM SYMPTOMS
    private float hb; //Hemoglobin
    private float epo; //Eritropoyetin
    private int hematocrit;
    private float plaquets;
    private float anysocytosis;
    private float retyculocytes;
    private float leucocytes;
    private BloodVolume bloodVolume;
    private float rbc; //Red Blood Cells
    private int mcv; //Mean Corpuscular Volume
    private int mch; //Mean Corpuscular Hemoglobin
    private int mchc; //Mean Corpuscular Hemoglobin Concentration
    private int fe; //Iron values
    private float bilirubine;
    private int ldh; //Lactate Dehydrogenase
    private float haptoglobin;
    private float ferritin;
    private float b12; //Vitamin B12
    private float folicAcid;
    private float glucocorticoids;
    private boolean hbUrine; //Amount of Hemoglobin in Urine
    private boolean feUrine; // Amount of Iron in Urine

    //PHYSICAL SYMPTOMS
    private boolean skinPalenes;
    private boolean tachycardia; //your heart is beating faster than normal (more than 100 beats per minute)
    private boolean tinnitus; //perception of sound that does not have an external source, so other people cannot hear it
    private boolean palpitations; //irregular heartbeat
    private boolean chestPain;
    private boolean infarction; //obstruction of the blood supply to the heart
    private boolean dizziness;
    private boolean blurredVision;
    private boolean headAche;
    private boolean fatigue;
    private boolean musclePain;
    private boolean dyspnea; //difficulty breathing or breathlessness
    private boolean tachypnea; //rapid breathing
    private boolean coldLimp; //Hands or feet are cold
    private boolean internHemorrage;
    private boolean externHemorrage;
    private boolean nausea;
    private boolean jaundice; //yellowish appearance of the skin
    private boolean splenomegalia; //enlargement of the spleen
    private boolean cranealBallooning; //Abnormal craneal growth
    private boolean aplasticCrisis; //the bone marrow suddenly stops producing red blood cells
    private boolean bacterianInfection;
    private boolean osteoporosis; // bone density and mass decreases
    private boolean boneDeformation;
    private boolean maxilarBoneHyperplasia; //asymmetry of one half of the mandible
    private boolean brittleNails; //thin, weak, and fragile nails
    private boolean tongueInflamation;
    private boolean diarrhoea;
    private boolean paresthesia; //sensation of tingling or “pins and needles” underneath your skin
    private boolean petechiae; //pinpoint non-blanching spots in the skin



    public Patient(int id_patient, String anemia, float hb, float epo, int hematocrit, float plaquets, float anysocytosis, float retyculocytes, float leucocytes, BloodVolume bloodVolume, float rbc, int mcv, int mch, int mchc, int fe, float bilirubine, int ldh, float haptoglobin, float ferritin, float b12, float folicAcid, float glucocorticoids, boolean hbUrine, boolean feUrine, boolean skinPalenes, boolean tachycardia, boolean tinnitus, boolean palpitations, boolean chestPain, boolean infarction, boolean dizziness, boolean blurredVision, boolean headAche, boolean fatigue, boolean musclePain, boolean dyspnea, boolean tachypnea, boolean coldLimp, boolean internHemorrage, boolean externHemorrage, boolean nausea, boolean jaundice, boolean splenomegalia, boolean cranealBalloning, boolean aplasticCrisis, boolean bacterianInfection, boolean osteoporosis, boolean boneDeformation, boolean maxilarBoneHyperplasia, boolean brittleNails, boolean tongueInflamation, boolean diarrhoea, boolean paresthesia, boolean petechiae) {
        this.id_patient = id_patient;
        this.anemia = anemia;
        this.hb = hb;
        this.epo = epo;
        this.hematocrit = hematocrit;
        this.plaquets = plaquets;
        this.anysocytosis = anysocytosis;
        this.retyculocytes = retyculocytes;
        this.leucocytes = leucocytes;
        this.bloodVolume = bloodVolume;
        this.rbc = rbc;
        this.mcv = mcv;
        this.mch = mch;
        this.mchc = mchc;
        this.fe = fe;
        this.bilirubine = bilirubine;
        this.ldh = ldh;
        this.haptoglobin = haptoglobin;
        this.ferritin = ferritin;
        this.b12 = b12;
        this.folicAcid = folicAcid;
        this.glucocorticoids = glucocorticoids;
        this.hbUrine = hbUrine;
        this.feUrine = feUrine;
        this.skinPalenes = skinPalenes;
        this.tachycardia = tachycardia;
        this.tinnitus = tinnitus;
        this.palpitations = palpitations;
        this.chestPain = chestPain;
        this.infarction = infarction;
        this.dizziness = dizziness;
        this.blurredVision = blurredVision;
        this.headAche = headAche;
        this.fatigue = fatigue;
        this.musclePain = musclePain;
        this.dyspnea = dyspnea;
        this.tachypnea = tachypnea;
        this.coldLimp = coldLimp;
        this.internHemorrage = internHemorrage;
        this.externHemorrage = externHemorrage;
        this.nausea = nausea;
        this.jaundice = jaundice;
        this.splenomegalia = splenomegalia;
        this.cranealBallooning = cranealBalloning;
        this.aplasticCrisis = aplasticCrisis;
        this.bacterianInfection = bacterianInfection;
        this.osteoporosis = osteoporosis;
        this.boneDeformation = boneDeformation;
        this.maxilarBoneHyperplasia = maxilarBoneHyperplasia;
        this.brittleNails = brittleNails;
        this.tongueInflamation = tongueInflamation;
        this.diarrhoea = diarrhoea;
        this.paresthesia = paresthesia;
        this.petechiae = petechiae;
    }

    public void setAnemia(String anemia) {
        this.anemia = anemia;
    }

    public int getId_patient() {
        return id_patient;
    }

    public String getAnemia() {
        return anemia;
    }

    public float getHb() {
        return hb;
    }

    public float getEpo() {
        return epo;
    }

    public int getHematocrit() {
        return hematocrit;
    }

    public float getPlaquets() {
        return plaquets;
    }

    public float getAnysocytosis() {
        return anysocytosis;
    }

    public float getRetyculocytes() {
        return retyculocytes;
    }

    public float getLeucocytes() {
        return leucocytes;
    }

    public BloodVolume getBloodVolume() {
        return bloodVolume;
    }

    public float getRbc() {
        return rbc;
    }

    public int getMcv() {
        return mcv;
    }

    public int getMch() {
        return mch;
    }

    public int getMchc() {
        return mchc;
    }

    public int getFe() {
        return fe;
    }

    public float getBilirubine() {
        return bilirubine;
    }

    public int getLdh() {
        return ldh;
    }

    public float getHaptoglobin() {
        return haptoglobin;
    }

    public float getFerritin() {
        return ferritin;
    }

    public float getB12() {
        return b12;
    }

    public float getFolicAcid() {
        return folicAcid;
    }

    public float getGlucocorticoids() {
        return glucocorticoids;
    }

    public boolean isHbUrine() {
        return hbUrine;
    }

    public boolean isFeUrine() {
        return feUrine;
    }

    public boolean isSkinPalenes() {
        return skinPalenes;
    }

    public boolean isTachycardia() {
        return tachycardia;
    }

    public boolean isTinnitus() {
        return tinnitus;
    }

    public boolean isPalpitations() {
        return palpitations;
    }

    public boolean isChestPain() {
        return chestPain;
    }

    public boolean isInfarction() {
        return infarction;
    }

    public boolean isDizziness() {
        return dizziness;
    }

    public boolean isBlurredVision() {
        return blurredVision;
    }

    public boolean isHeadAche() {
        return headAche;
    }

    public boolean isFatigue() {
        return fatigue;
    }

    public boolean isMusclePain() {
        return musclePain;
    }

    public boolean isDyspnea() {
        return dyspnea;
    }

    public boolean isTachypnea() {
        return tachypnea;
    }

    public boolean isColdLimp() {
        return coldLimp;
    }

    public boolean isInternHemorrage() {
        return internHemorrage;
    }

    public boolean isExternHemorrage() {
        return externHemorrage;
    }

    public boolean isNausea() {
        return nausea;
    }

    public boolean isJaundice() {
        return jaundice;
    }

    public boolean isSplenomegalia() {
        return splenomegalia;
    }

    public boolean isCranealBallooning() {
        return cranealBallooning;
    }

    public boolean isAplasticCrisis() {
        return aplasticCrisis;
    }

    public boolean isBacterianInfection() {
        return bacterianInfection;
    }

    public boolean isOsteoporosis() {
        return osteoporosis;
    }

    public boolean isBoneDeformation() {
        return boneDeformation;
    }

    public boolean isMaxilarBoneHyperplasia() {
        return maxilarBoneHyperplasia;
    }

    public boolean isBrittleNails() {
        return brittleNails;
    }

    public boolean isTongueInflamation() {
        return tongueInflamation;
    }

    public boolean isDiarrhoea() {
        return diarrhoea;
    }

    public boolean isParesthesia() {
        return paresthesia;
    }

    public boolean isPetechiae() {
        return petechiae;
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
        return "Operation{" +
                "id_patient=" + id_patient +
                ", anemia='" + anemia + '\'' +
                ", hb=" + hb +
                ", epo=" + epo +
                ", hematocrit=" + hematocrit +
                ", plaquets=" + plaquets +
                ", anysocytosis=" + anysocytosis +
                ", retyculocytes=" + retyculocytes +
                ", leucocytes=" + leucocytes +
                ", bloodVolume=" + bloodVolume +
                ", rbc=" + rbc +
                ", mcv=" + mcv +
                ", mch=" + mch +
                ", mchc=" + mchc +
                ", fe=" + fe +
                ", bilirubine=" + bilirubine +
                ", ldh=" + ldh +
                ", haptoglobin=" + haptoglobin +
                ", ferritin=" + ferritin +
                ", b12=" + b12 +
                ", folicAcid=" + folicAcid +
                ", glucocorticoids=" + glucocorticoids +
                ", hbUrine=" + hbUrine +
                ", feUrine=" + feUrine +
                ", skinPalenes=" + skinPalenes +
                ", tachycardia=" + tachycardia +
                ", tinnitus=" + tinnitus +
                ", palpitations=" + palpitations +
                ", chestPain=" + chestPain +
                ", infarction=" + infarction +
                ", dizziness=" + dizziness +
                ", blurredVision=" + blurredVision +
                ", headAche=" + headAche +
                ", fatigue=" + fatigue +
                ", musclePain=" + musclePain +
                ", dyspnea=" + dyspnea +
                ", tachypnea=" + tachypnea +
                ", coldLimp=" + coldLimp +
                ", internHemorrage=" + internHemorrage +
                ", externHemorrage=" + externHemorrage +
                ", nausea=" + nausea +
                ", jaundice=" + jaundice +
                ", splenomegalia=" + splenomegalia +
                ", cranealBalloning=" + cranealBallooning +
                ", aplasticCrisis=" + aplasticCrisis +
                ", bacterianInfection=" + bacterianInfection +
                ", osteoporosis=" + osteoporosis +
                ", boneDeformation=" + boneDeformation +
                ", maxilarBoneHyperplasia=" + maxilarBoneHyperplasia +
                ", brittleNails=" + brittleNails +
                ", tongueInflamation=" + tongueInflamation +
                ", diarrhoea=" + diarrhoea +
                ", paresthesia=" + paresthesia +
                ", petechiae=" + petechiae +
                '}';
    }

}
