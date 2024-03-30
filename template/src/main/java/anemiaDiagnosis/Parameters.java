package anemiaDiagnosis;

import ui.Utilities;

public class Parameters {
    //HEMOGRAM SYMPTOMS
    private Anemia anemia;
    private float hb; //Hemoglobin (g/dL)
    private float epo; //Eritropoyetin (mU/mL)
    private int hematocrit; // (%)
    private float plaquets; //(fL)
    private float anysocytosis; // coeficcient(%)
    private float retyculocytes; //(%)
    private float leucocytes; //(µL)
    private BloodVolume bloodVolume;
    private float rbc; //Red Blood Cells (cells/µL) ; 10^6 ( million cells/µL)
    private int mcv; //Mean Corpuscular Volume (fL) or millions per microlites (10^6/µL)
    private int mch; //Mean Corpuscular Hemoglobin picogrames(pg)
    private int mchc; //Mean Corpuscular Hemoglobin Concentration (g/L)
    private int fe; //Iron values (mcg/dL) microgrames per decilitre
    private float bilirubin; //(mcg/dL)
    private int ldh; //Lactate Dehydrogenase (U/L) units per litre
    private float haptoglobin; //(mg/dL) miligrames
    private float ferritin; //(ng/mL) nanogrames
    private float b12; //Vitamin B12 (pg/mL) picogrames per mililitre
    private float folicAcid; //(ng/mL)
    private float glucocorticoids; //(µg/dL)
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

    private int index;
    private RiskProbability risk;
    public Parameters(){
        this.index = 0;
        //inicializar todo a null
    }

    //methos that assigns a score that increetns the general risk index based on the patient's parameters
    private void incrementIndex(int index){
        this.index = this.index + index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public RiskProbability getRisk() {
        return risk;
    }

    public void setRisk(RiskProbability risk) {
        this.risk = risk;
    }

//to facilitate the test, we have created a constructor per rule to just stablish the parameters that the rule depends on
    //constructor that creates a parameter that triggers rule 1

    public Parameters(float hb, float epo, int hematocrit, float plaquets, float anysocytosis, float retyculocytes, float leucocytes, float rbc, int mcv, int mchc, int fe, float bilirubin, int ldh, float haptoglobin, float ferritin, float b12, float folicAcid, float glucocorticoids, boolean skinPalenes, boolean tachycardia, boolean tinnitus, boolean palpitations, boolean chestPain, boolean infarction, boolean dizziness, boolean blurredVision, boolean headAche, boolean fatigue, boolean musclePain, boolean dyspnea, boolean tachypnea, boolean coldLimp) {
        this.hb = hb;
        this.epo = epo;
        this.hematocrit = hematocrit;
        this.plaquets = plaquets;
        this.anysocytosis = anysocytosis;
        this.retyculocytes = retyculocytes;
        this.leucocytes = leucocytes;
        this.rbc = rbc;
        this.mcv = mcv;
        this.mchc = mchc;
        this.fe = fe;
        this.bilirubin = bilirubin;
        this.ldh = ldh;
        this.haptoglobin = haptoglobin;
        this.ferritin = ferritin;
        this.b12 = b12;
        this.folicAcid = folicAcid;
        this.glucocorticoids = glucocorticoids;
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
    }

    //constructor that creates a parameter that triggers rule 2
    public Parameters(float epo, int hematocrit, float plaquets, float anysocytosis, float retyculocytes, float leucocytes, BloodVolume bloodVolume, int mcv, float bilirubin, int ldh, float haptoglobin, float ferritin, float b12, float folicAcid, float glucocorticoids, boolean skinPalenes, boolean tachycardia, boolean dizziness, boolean fatigue, boolean dyspnea, boolean tachypnea, boolean internHemorrage, boolean externHemorrage) {
        this.epo = epo;
        this.hematocrit = hematocrit;
        this.plaquets = plaquets;
        this.anysocytosis = anysocytosis;
        this.retyculocytes = retyculocytes;
        this.leucocytes = leucocytes;
        this.bloodVolume = bloodVolume;
        this.mcv = mcv;
        this.bilirubin = bilirubin;
        this.ldh = ldh;
        this.haptoglobin = haptoglobin;
        this.ferritin = ferritin;
        this.b12 = b12;
        this.folicAcid = folicAcid;
        this.glucocorticoids = glucocorticoids;
        this.skinPalenes = skinPalenes;
        this.tachycardia = tachycardia;
        this.dizziness = dizziness;
        this.fatigue = fatigue;
        this.dyspnea = dyspnea;
        this.tachypnea = tachypnea;
        this.internHemorrage = internHemorrage;
        this.externHemorrage = externHemorrage;
    }
    //constructor that creates a parameter that triggers rule 3
    public Parameters(float hb, float epo, int hematocrit, float plaquets, float anysocytosis, float retyculocytes, float leucocytes, float rbc, int mcv, int mch, int mchc, int fe, float bilirubin, int ldh, float haptoglobin, float ferritin, float b12, float folicAcid, float glucocorticoids, boolean hbUrine, boolean feUrine, boolean skinPalenes, boolean fatigue, boolean jaundice, boolean splenomegalia, boolean cranealBallooning, boolean aplasticCrisis) {
        this.hb = hb;
        this.epo = epo;
        this.hematocrit = hematocrit;
        this.plaquets = plaquets;
        this.anysocytosis = anysocytosis;
        this.retyculocytes = retyculocytes;
        this.leucocytes = leucocytes;
        this.rbc = rbc;
        this.mcv = mcv;
        this.mch = mch;
        this.mchc = mchc;
        this.fe = fe;
        this.bilirubin = bilirubin;
        this.ldh = ldh;
        this.haptoglobin = haptoglobin;
        this.ferritin = ferritin;
        this.b12 = b12;
        this.folicAcid = folicAcid;
        this.glucocorticoids = glucocorticoids;
        this.hbUrine = hbUrine;
        this.feUrine = feUrine;
        this.skinPalenes = skinPalenes;
        this.fatigue = fatigue;
        this.jaundice = jaundice;
        this.splenomegalia = splenomegalia;
        this.cranealBallooning = cranealBallooning;
        this.aplasticCrisis = aplasticCrisis;
    }

    //constructor that creates a parameter that triggers rule 4
    public Parameters(int hematocrit, float plaquets, float anysocytosis, float retyculocytes, float leucocytes, float rbc, float bilirubin, int mcv, int mchc, int fe, float haptoglobin, float ferritin, float b12, float folicAcid, float glucocorticoids, int ldh, boolean splenomegalia, boolean cranealBallooning, boolean aplasticCrisis, boolean bacterianInfection, boolean osteoporosis, boolean boneDeformation, boolean maxilarBoneHyperplasia) {
        this.hematocrit = hematocrit;
        this.plaquets = plaquets;
        this.anysocytosis = anysocytosis;
        this.retyculocytes = retyculocytes;
        this.leucocytes = leucocytes;
        this.rbc = rbc;
        this.bilirubin = bilirubin;
        this.mcv = mcv;
        this.mchc = mchc;
        this.fe = fe;
        this.haptoglobin = haptoglobin;
        this.ferritin = ferritin;
        this.b12 = b12;
        this.folicAcid = folicAcid;
        this.glucocorticoids = glucocorticoids;
        this.ldh = ldh;
        this.splenomegalia = splenomegalia;
        this.cranealBallooning = cranealBallooning;
        this.aplasticCrisis = aplasticCrisis;
        this.bacterianInfection = bacterianInfection;
        this.osteoporosis = osteoporosis;
        this.boneDeformation = boneDeformation;
        this.maxilarBoneHyperplasia = maxilarBoneHyperplasia;
    }
    //constructor that creates a parameter that triggers rule 5
    public Parameters(float epo, int hematocrit, float plaquets, float anysocytosis, float retyculocytes, float leucocytes, float rbc, int mcv, int mchc, int fe, float bilirubin, int ldh, float haptoglobin, float ferritin, float b12, float folicAcid, float glucocorticoids, boolean skinPalenes, boolean palpitations, boolean headAche, boolean fatigue, boolean dyspnea, boolean coldLimp, boolean nausea, boolean brittleNails, boolean tongueInflamation) {
        this.epo = epo;
        this.hematocrit = hematocrit;
        this.plaquets = plaquets;
        this.anysocytosis = anysocytosis;
        this.retyculocytes = retyculocytes;
        this.leucocytes = leucocytes;
        this.rbc = rbc;
        this.mcv = mcv;
        this.mchc = mchc;
        this.fe = fe;
        this.bilirubin = bilirubin;
        this.ldh = ldh;
        this.haptoglobin = haptoglobin;
        this.ferritin = ferritin;
        this.b12 = b12;
        this.folicAcid = folicAcid;
        this.glucocorticoids = glucocorticoids;
        this.skinPalenes = skinPalenes;
        this.palpitations = palpitations;
        this.headAche = headAche;
        this.fatigue = fatigue;
        this.dyspnea = dyspnea;
        this.coldLimp = coldLimp;
        this.nausea = nausea;
        this.brittleNails = brittleNails;
        this.tongueInflamation = tongueInflamation;
    }
    //constructor that creates a parameter that triggers rule 6
    public Parameters(float epo, int hematocrit, float plaquets, float anysocytosis, float retyculocytes, float leucocytes, float rbc, int mcv, int mchc, int fe, float bilirubin, int ldh, float haptoglobin, float ferritin, float b12, float glucocorticoids, boolean skinPalenes, boolean fatigue, boolean internHemorrage, boolean externHemorrage, boolean petechiae) {
        this.epo = epo;
        this.hematocrit = hematocrit;
        this.plaquets = plaquets;
        this.anysocytosis = anysocytosis;
        this.retyculocytes = retyculocytes;
        this.leucocytes = leucocytes;
        this.rbc = rbc;
        this.mcv = mcv;
        this.mchc = mchc;
        this.fe = fe;
        this.bilirubin = bilirubin;
        this.ldh = ldh;
        this.haptoglobin = haptoglobin;
        this.ferritin = ferritin;
        this.b12 = b12;
        this.glucocorticoids = glucocorticoids;
        this.skinPalenes = skinPalenes;
        this.fatigue = fatigue;
        this.internHemorrage = internHemorrage;
        this.externHemorrage = externHemorrage;
        this.petechiae = petechiae;
    }
    //constructor that creates a parameter that triggers rule 7
    public Parameters(float epo, int hematocrit, float plaquets, float anysocytosis, float retyculocytes, float leucocytes, int mcv, int mchc, int fe, float bilirubin, int ldh, float haptoglobin, float ferritin, float b12, float folicAcid, float glucocorticoids, boolean skinPalenes, boolean headAche, boolean fatigue, boolean dyspnea) {
        this.epo = epo;
        this.hematocrit = hematocrit;
        this.plaquets = plaquets;
        this.anysocytosis = anysocytosis;
        this.retyculocytes = retyculocytes;
        this.leucocytes = leucocytes;
        this.mcv = mcv;
        this.mchc = mchc;
        this.fe = fe;
        this.bilirubin = bilirubin;
        this.ldh = ldh;
        this.haptoglobin = haptoglobin;
        this.ferritin = ferritin;
        this.b12 = b12;
        this.folicAcid = folicAcid;
        this.glucocorticoids = glucocorticoids;
        this.skinPalenes = skinPalenes;
        this.headAche = headAche;
        this.fatigue = fatigue;
        this.dyspnea = dyspnea;
    }
    //constructor that creates a parameter that triggers rule 8
    public Parameters(float epo, int hematocrit, float plaquets, float anysocytosis, float retyculocytes, float leucocytes, float rbc, int mcv, int mchc, int fe, float bilirubin, int ldh, float haptoglobin, float ferritin, float b12, float folicAcid, float glucocorticoids, boolean skinPalenes, boolean dizziness, boolean headAche, boolean fatigue, boolean dyspnea, boolean brittleNails) {
        this.epo = epo;
        this.hematocrit = hematocrit;
        this.plaquets = plaquets;
        this.anysocytosis = anysocytosis;
        this.retyculocytes = retyculocytes;
        this.leucocytes = leucocytes;
        this.rbc = rbc;
        this.mcv = mcv;
        this.mchc = mchc;
        this.fe = fe;
        this.bilirubin = bilirubin;
        this.ldh = ldh;
        this.haptoglobin = haptoglobin;
        this.ferritin = ferritin;
        this.b12 = b12;
        this.folicAcid = folicAcid;
        this.glucocorticoids = glucocorticoids;
        this.skinPalenes = skinPalenes;
        this.dizziness = dizziness;
        this.headAche = headAche;
        this.fatigue = fatigue;
        this.dyspnea = dyspnea;
        this.brittleNails = brittleNails;
    }
    //constructor that creates a parameter that triggers rule 9
    public Parameters(float hb, float epo, int hematocrit, float plaquets, float anysocytosis, float retyculocytes, float leucocytes, BloodVolume bloodVolume, int mcv, float rbc, int mchc, int fe, float bilirubin, int ldh, float haptoglobin, float ferritin, float b12, float folicAcid, float glucocorticoids, boolean dizziness, boolean blurredVision, boolean headAche, boolean fatigue, boolean dyspnea) {
        this.hb = hb;
        this.epo = epo;
        this.hematocrit = hematocrit;
        this.plaquets = plaquets;
        this.anysocytosis = anysocytosis;
        this.retyculocytes = retyculocytes;
        this.leucocytes = leucocytes;
        this.bloodVolume = bloodVolume;
        this.mcv = mcv;
        this.rbc = rbc;
        this.mchc = mchc;
        this.fe = fe;
        this.bilirubin = bilirubin;
        this.ldh = ldh;
        this.haptoglobin = haptoglobin;
        this.ferritin = ferritin;
        this.b12 = b12;
        this.folicAcid = folicAcid;
        this.glucocorticoids = glucocorticoids;
        this.dizziness = dizziness;
        this.blurredVision = blurredVision;
        this.headAche = headAche;
        this.fatigue = fatigue;
        this.dyspnea = dyspnea;
    }

    public void setAnemia(Anemia anemia) {
        this.anemia = anemia;
    }
    public void setBloodVolume(BloodVolume volume) {
        this.bloodVolume = volume;
    }

    public Anemia getAnemia() {
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

    public float getBilirubin() {
        return bilirubin;
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

    public void setHb(float hb) {
        this.hb = hb;
        if(hb>55){
            incrementIndex(5);
        }
    }

    public void setEpo(float epo) {
        this.epo = epo;
    }

    public void setHematocrit(int hematocrit) {
        this.hematocrit = hematocrit;
    }

    public void setPlaquets(float plaquets) {
        this.plaquets = plaquets;
    }

    public void setAnysocytosis(float anysocytosis) {
        this.anysocytosis = anysocytosis;
    }

    public void setRetyculocytes(float retyculocytes) {
        this.retyculocytes = retyculocytes;
    }

    public void setLeucocytes(float leucocytes) {
        this.leucocytes = leucocytes;
    }

    public void setRbc(float rbc) {
        this.rbc = rbc;
    }

    public void setMcv(int mcv) {
        this.mcv = mcv;
    }

    public void setMch(int mch) {
        this.mch = mch;
    }

    public void setMchc(int mchc) {
        this.mchc = mchc;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public void setBilirubin(float bilirubin) {
        this.bilirubin = bilirubin;
    }

    public void setLdh(int ldh) {
        this.ldh = ldh;
    }

    public void setHaptoglobin(float haptoglobin) {
        this.haptoglobin = haptoglobin;
    }

    public void setFerritin(float ferritin) {
        this.ferritin = ferritin;
    }

    public void setB12(float b12) {
        this.b12 = b12;
    }

    public void setFolicAcid(float folicAcid) {
        this.folicAcid = folicAcid;
    }

    public void setGlucocorticoids(float glucocorticoids) {
        this.glucocorticoids = glucocorticoids;
    }

    public void setHbUrine(boolean hbUrine) {
        this.hbUrine = hbUrine;
    }

    public void setFeUrine(boolean feUrine) {
        this.feUrine = feUrine;
    }

    public void setSkinPalenes(boolean skinPalenes) {
        this.skinPalenes = skinPalenes;
    }

    public void setTachycardia(boolean tachycardia) {
        this.tachycardia = tachycardia;
    }

    public void setTinnitus(boolean tinnitus) {
        this.tinnitus = tinnitus;
    }

    public void setPalpitations(boolean palpitations) {
        this.palpitations = palpitations;
    }

    public void setChestPain(boolean chestPain) {
        this.chestPain = chestPain;
    }

    public void setInfarction(boolean infarction) {
        this.infarction = infarction;
    }

    public void setDizziness(boolean dizziness) {
        this.dizziness = dizziness;
    }

    public void setBlurredVision(boolean blurredVision) {
        this.blurredVision = blurredVision;
    }

    public void setHeadAche(boolean headAche) {
        this.headAche = headAche;
    }

    public void setFatigue(boolean fatigue) {
        this.fatigue = fatigue;
    }

    public void setMusclePain(boolean musclePain) {
        this.musclePain = musclePain;
    }

    public void setDyspnea(boolean dyspnea) {
        this.dyspnea = dyspnea;
    }

    public void setTachypnea(boolean tachypnea) {
        this.tachypnea = tachypnea;
    }

    public void setColdLimp(boolean coldLimp) {
        this.coldLimp = coldLimp;
    }

    public void setInternHemorrage(boolean internHemorrage) {
        this.internHemorrage = internHemorrage;
    }

    public void setExternHemorrage(boolean externHemorrage) {
        this.externHemorrage = externHemorrage;
    }

    public void setNausea(boolean nausea) {
        this.nausea = nausea;
    }

    public void setJaundice(boolean jaundice) {
        this.jaundice = jaundice;
    }

    public void setSplenomegalia(boolean splenomegalia) {
        this.splenomegalia = splenomegalia;
    }

    public void setCranealBallooning(boolean cranealBallooning) {
        this.cranealBallooning = cranealBallooning;
    }

    public void setAplasticCrisis(boolean aplasticCrisis) {
        this.aplasticCrisis = aplasticCrisis;
    }

    public void setBacterianInfection(boolean bacterianInfection) {
        this.bacterianInfection = bacterianInfection;
    }

    public void setOsteoporosis(boolean osteoporosis) {
        this.osteoporosis = osteoporosis;
    }

    public void setBoneDeformation(boolean boneDeformation) {
        this.boneDeformation = boneDeformation;
    }

    public void setMaxilarBoneHyperplasia(boolean maxilarBoneHyperplasia) {
        this.maxilarBoneHyperplasia = maxilarBoneHyperplasia;
    }

    public void setBrittleNails(boolean brittleNails) {
        this.brittleNails = brittleNails;
    }

    public void setTongueInflamation(boolean tongueInflamation) {
        this.tongueInflamation = tongueInflamation;
    }

    public void setDiarrhoea(boolean diarrhoea) {
        this.diarrhoea = diarrhoea;
    }

    public void setParesthesia(boolean paresthesia) {
        this.paresthesia = paresthesia;
    }

    public void setPetechiae(boolean petechiae) {
        this.petechiae = petechiae;
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


    @Override
    public String toString() {
        return " -Hemoblobin: " + hb + "g/dL\n"
                + " -Erytropyetin: " + epo + "mU/mL\n"
                + " -Hematocrit: " + hematocrit + "%\n"
                + " -Plaquets: " + plaquets + "fL\n"
                + " -Anysocytosis: " + anysocytosis + "%\n"
                + " -Retyculocytes: " + retyculocytes + "%\n"
                + " -Leucocytes: " + leucocytes + "µL\n"
                + " -Blood volume: " + bloodVolume + "\n"
                + " -Red Blood Cells (RBC): " + rbc + "rbc/mL\n"
                + " -Mean Corpuscular Volume (MCV): " + mcv + "fL\n"
                + " -Mean Corpuscular Hemoglobin (MCH): " + mch + "pg\n"
                + " -Mean Corpuscular Hemoglobin Concentration (MCHC): " + mchc  + "g/L\n"
                + " -Iron (Fe): " + fe  + "mcg/dL\n"
                + " -Bilirubin: " + bilirubin + "mcg/dL\n"
                + " -Lactate Dehydrogenase (LDH): " + ldh  + "units/L\n"
                + " -Haptoglobin: " + haptoglobin + "mg/dL\n"
                + " -Ferritin: " + ferritin + "ng/mL\n"
                + " -B12 Vitamin: " + b12 + "pg/mL\n"
                + " -Folic Acid: " + folicAcid + "ng/mL\n"
                + " -Glucocorticoids: " + glucocorticoids + "µL/dL\n"
                + " -Hemoglin in Urine: " + isHbUrine() + "\n"
                + " -Iron in Urine: " + isFeUrine() + "\n"
                + "\nPatient symptoms:\n"
                + " -Skin paleness: " + isSkinPalenes() + "\n"
                + " -Tachycardia: " + isTachycardia() + "\n"
                + " -Tinnitus: " + isTinnitus() + "\n"
                + " -Palpitations: " + isPalpitations() + "\n"
                + " -Chest Pain: " + isChestPain() + "\n"
                + " -Infraction: " + isInfarction() + "\n"
                + " -Dizziness: " + isDizziness() + "\n"
                + " -Blurred vision: " + isBlurredVision() + "\n"
                + " -Hedache: " + isHeadAche() + "\n"
                + " -Fatigue: " + isFatigue() + "\n"
                + " -Muscle Pain: " + isMusclePain() + "\n"
                + " -Dyspnea: " + isDyspnea() + "\n"
                + " -Tachypena: " + isTachypnea() + "\n"
                + " -Cold limps (cold hands/feet): " + isColdLimp() + "\n"
                + " -Internal Hemorrage: " + isInternHemorrage() + "\n"
                + " -External Hemorrage: " + isExternHemorrage() + "\n"
                + " -Nausea: " + isNausea() + "\n"
                + " -Jaundice: " + isJaundice() + "\n"
                + " -Splenomegalia: " + isSplenomegalia() + "\n"
                + " -Cranean balloning: " + isCranealBallooning() + "\n"
                + " -Aplastic Crisis: " + isAplasticCrisis() + "\n"
                + " -Bacterian infection: " + isBacterianInfection() + "\n"
                + " -Osteoporosis: " + isOsteoporosis() + "\n"
                + " -Bone deformation: " + isBoneDeformation() + "\n"
                + " -Maxilar Bone Hyperplasia: " + isMaxilarBoneHyperplasia() + "\n"
                + " -Brittle Nails: " + isBrittleNails() + "\n"
                + " -Tongue inflamation: " + isTongueInflamation() + "\n"
                + " -Diarrhoea: " + isDiarrhoea() + "\n"
                + " -Paresthesia: " + isParesthesia() + "\n"
                + " -Petechiae: " + isPetechiae() + "\n";
    }
}


// Mas comunes incrementan +5/6
// Menos comunes incrementean +1/2

// Riesgo alto: index > 15
// Riesgo medio: index <= 15 && index > 7
// Riesgo bajo: index <= 7