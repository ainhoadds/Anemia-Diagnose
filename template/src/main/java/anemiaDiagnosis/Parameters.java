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
    private float rbc; //Red Blood Cells 10^6  (million/µL)
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

    private int index; //index of risk for the atributes (cumulative sum of the score contributions of the attributes)
    private RiskProbability risk; //final risk prob of having anemia in case of no specific anemic diagnose


    public Parameters() {
        this.anemia = null;
        this.hb = 0;
        this.epo = 0;
        this.hematocrit = 0;
        this.plaquets = 0;
        this.anysocytosis = 0;
        this.retyculocytes = 0;
        this.leucocytes = 0;
        this.bloodVolume = null;
        this.rbc = 0;
        this.mcv = 0;
        this.mch = 0;
        this.mchc = 0;
        this.fe = 0;
        this.bilirubin = 0;
        this.ldh = 0;
        this.haptoglobin = 0;
        this.ferritin = 0;
        this.b12 = 0;
        this.folicAcid = 0;
        this.glucocorticoids = 0;
        this.hbUrine = false;
        this.feUrine = false;
        this.skinPalenes = false;
        this.tachycardia = false;
        this.tinnitus = false;
        this.palpitations = false;
        this.chestPain = false;
        this.infarction = false;
        this.dizziness = false;
        this.blurredVision = false;
        this.headAche = false;
        this.fatigue = false;
        this.musclePain = false;
        this.dyspnea = false;
        this.tachypnea = false;
        this.coldLimp = false;
        this.internHemorrage = false;
        this.externHemorrage = false;
        this.nausea = false;
        this.jaundice = false;
        this.splenomegalia = false;
        this.cranealBallooning = false;
        this.aplasticCrisis = false;
        this.bacterianInfection = false;
        this.osteoporosis = false;
        this.boneDeformation = false;
        this.maxilarBoneHyperplasia = false;
        this.brittleNails = false;
        this.tongueInflamation = false;
        this.diarrhoea = false;
        this.paresthesia = false;
        this.petechiae = false;
        this.index = 0;
        this.risk = null;
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

    public int getIndex() {
        return index;
    }

    public RiskProbability getRisk() {
        return risk;
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

    public void setAnemia(Anemia anemia) {
        this.anemia = anemia;
    }

    public void setHb(float hb) { //when setting the Hb, it sums to the total index a score from 1 to 5 depending on its weigh when diagnosing anemia
        this.hb = hb;
        if(hb >= 11 && hb <= 13.5){
            incrementIndex(3); // this Hb value is deterministic for mild anemia so sums a score (importance) of 3
        }
        if(hb > 8 && hb < 11){
            incrementIndex(4); //this Hb value indicates moderate anemia and so a higher weigh, it sums 4 to the index
        }
        if(hb <= 8){
            incrementIndex(5); //hb value that indicates severe anemia, it has the higher score indicating higher risk
        }
    }

    public void setEpo(float epo) {
        this.epo = epo;
    }

    public void setHematocrit(int hematocrit) { //hematocrit below a certain value is also a deterministic parameter for diagnosisng anemia
        this.hematocrit = hematocrit;
        if(hematocrit < 53){
            incrementIndex(4); //sums a value of 4 to the index if so
        }
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

    public void setBloodVolume(BloodVolume bloodVolume) {
        this.bloodVolume = bloodVolume;
    }

    public void setRbc(float rbc) { //rbc below a certain value also contributes to the risk of having anemia
        this.rbc = rbc;
        if(rbc < 5.3){
            incrementIndex(4); //sums a value of 4 to the index
        }
    }

    public void setMcv(int mcv) {
        this.mcv = mcv;
        if(mcv < 80){ //indicates possible microcytic anemia so sums 3 to the index
            incrementIndex(3);
        }
        if(mcv > 100){ //indicates possible macrocytic anemia
            incrementIndex(3);
        }
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

    public void setFerritin(float ferritin) { //ferritin below 12 is a minor sign of anemia but it also counts
        this.ferritin = ferritin;
        if(ferritin < 12){
            incrementIndex(2); //sums 2 to the index
        }
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

    public void setSkinPalenes(boolean skinPalenes) { //this is a common sign of having anemia with a low score as it is not that important
        this.skinPalenes = skinPalenes;
        incrementIndex(1);
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

    public void setFatigue(boolean fatigue) { //common sign of anemia with a minimum score as it has no much importance
        this.fatigue = fatigue;
        incrementIndex(1);
    }

    public void setMusclePain(boolean musclePain) { //common sign of anemia with a minimum score as it has no much importance
        this.musclePain = musclePain;
        incrementIndex(1);
    }

    public void setDyspnea(boolean dyspnea) { //common sign of anemia with a minimum score as it has no much importance
        this.dyspnea = dyspnea;
        incrementIndex(1);
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

    public void setIndex(int index) {
        this.index = index;
    }

    public void setRisk(RiskProbability risk) {
        this.risk = risk;
    }

    //method that assigns a score that increments the general risk index based on the patient's parameters
    private void incrementIndex(int index){
        this.index = this.index + index;
    }

    //method that calculates the risk of having anemia according to the index
    public void calculateRisk(){
        if(this.index>= 17){
            this.setRisk(RiskProbability.HIGH);
        }else if (index > 7 && index < 17){
            this.setRisk(RiskProbability.MODERATE);
        }else if(index <= 7 && index != 0){
            this.setRisk(RiskProbability.LOW);
        }
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

