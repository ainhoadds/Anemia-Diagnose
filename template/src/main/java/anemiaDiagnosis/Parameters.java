package anemiaDiagnosis;

public class Parameters {
    //HEMOGRAM SYMPTOMS
    private Anemia anemia;
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

    public Parameters(){

    }

    public Parameters(float hb, float epo, int hematocrit, float plaquets, float anysocytosis, float retyculocytes, float leucocytes, BloodVolume bloodVolume, float rbc, int mcv, int mch, int mchc, int fe, float bilirubine, int ldh, float haptoglobin, float ferritin, float b12, float folicAcid, float glucocorticoids, boolean hbUrine, boolean feUrine, boolean skinPalenes, boolean tachycardia, boolean tinnitus, boolean palpitations, boolean chestPain, boolean infarction, boolean dizziness, boolean blurredVision, boolean headAche, boolean fatigue, boolean musclePain, boolean dyspnea, boolean tachypnea, boolean coldLimp, boolean internHemorrage, boolean externHemorrage, boolean nausea, boolean jaundice, boolean splenomegalia, boolean cranealBallooning, boolean aplasticCrisis, boolean bacterianInfection, boolean osteoporosis, boolean boneDeformation, boolean maxilarBoneHyperplasia, boolean brittleNails, boolean tongueInflamation, boolean diarrhoea, boolean paresthesia, boolean petechiae) {
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
        this.cranealBallooning = cranealBallooning;
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

    //to facilitate the test, i have created a constructor per rule to just stablish the parametrs that the rule depende on


    public Parameters(float hb, float epo, boolean skinPalenes, boolean tachycardia, boolean tinnitus, boolean palpitations, boolean chestPain, boolean infarction, boolean dizziness, boolean blurredVision, boolean headAche, boolean fatigue, boolean musclePain, boolean dyspnea, boolean tachypnea, boolean coldLimp) {
        this.hb = hb;
        this.epo = epo;
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

    public Parameters(float retyculocytes, BloodVolume bloodVolume, float rbc, int mchc, int fe, boolean skinPalenes, boolean tachycardia, boolean dizziness, boolean fatigue, boolean dyspnea, boolean tachypnea, boolean internHemorrage, boolean externHemorrage) {
        this.retyculocytes = retyculocytes;
        this.bloodVolume = bloodVolume;
        this.rbc = rbc;
        this.mchc = mchc;
        this.fe = fe;
        this.skinPalenes = skinPalenes;
        this.tachycardia = tachycardia;
        this.dizziness = dizziness;
        this.fatigue = fatigue;
        this.dyspnea = dyspnea;
        this.tachypnea = tachypnea;
        this.internHemorrage = internHemorrage;
        this.externHemorrage = externHemorrage;
    }

    public Parameters(float hb, float epo, float retyculocytes, float rbc, int mcv, int mch, boolean hbUrine,boolean feUrine,int fe, float bilirubine, int ldh, float haptoglobin, boolean skinPalenes, boolean fatigue, boolean jaundice, boolean splenomegalia, boolean cranealBallooning, boolean aplasticCrisis) {
        this.hb = hb;
        this.epo = epo;
        this.retyculocytes = retyculocytes;
        this.rbc = rbc;
        this.mcv = mcv;
        this.mch = mch;
        this.haptoglobin = haptoglobin;
        this.hbUrine = hbUrine;
        this.fe = fe;
        this.bilirubine = bilirubine;
        this.ldh = ldh;
        this.feUrine = feUrine;
        this.skinPalenes = skinPalenes;
        this.fatigue = fatigue;
        this.jaundice = jaundice;
        this.splenomegalia = splenomegalia;
        this.cranealBallooning = cranealBallooning;
        this.aplasticCrisis = aplasticCrisis;
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

    public void setHb(float hb) {
        this.hb = hb;
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

    public void setBilirubine(float bilirubine) {
        this.bilirubine = bilirubine;
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
        return "Parameters{" +
                "hb=" + hb +
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
                ", cranealBallooning=" + cranealBallooning +
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
