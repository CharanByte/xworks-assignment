class MedicinePriceRunner{
    public static void main(String[] args) {
        double ParacetamolPrice=MedicinePrice.medName("Paracetamol");
        System.out.println("ParacetamolPrice : "+ParacetamolPrice);
        double AcetazolamidePrice=MedicinePrice.medName("Acetazolamide");
        System.out.println("AcetazolamidePrice : "+AcetazolamidePrice);
        double SabrilPrice=MedicinePrice.medName("Sabril");
        System.out.println("SabrilPrice : "+SabrilPrice);
        double TopamaxPrice=MedicinePrice.medName("Topamax");
        System.out.println("TopamaxPrice : "+TopamaxPrice);
        double CiproPrice=MedicinePrice.medName("Cipro");
        System.out.println("CiproPrice : "+CiproPrice);
        double CimziaPrice=MedicinePrice.medName("Cimzia");
        System.out.println("CimziaPrice : "+CimziaPrice);

        System.out.println("********************************************************");

        String headacheMedicine=Symptom.symptom("Headache");
        System.out.println("HeadacheMedicine : "+headacheMedicine);
        String feverMedicine=Symptom.symptom("Fever");
        System.out.println("FeverMedicine : "+feverMedicine);
        String coughMedicine=Symptom.symptom("Cough");
        System.out.println("CoughMedicine : "+coughMedicine);
        String soreThroatMedicine=Symptom.symptom("Sore Throat");
        System.out.println("soreThroatMedicine : "+soreThroatMedicine);
        String diarrheaMedicine=Symptom.symptom("Diarrhea");
        System.out.println("diarrheaMedicine : "+diarrheaMedicine);
        String Medicine=Symptom.symptom("pain");
        System.out.println("painMedicine : "+Medicine);

        System.out.println("***********************************************************");
        
        boolean rajuAvaliable=DoctorAvailiability.doctorname("raju");
        System.out.println("rajuAvaliable : "+rajuAvaliable);
        boolean sanjuAvaliable=DoctorAvailiability.doctorname("sanju");
        System.out.println("sanjuAvaliable : "+sanjuAvaliable);
        boolean venkyAvaliable=DoctorAvailiability.doctorname("venky");
        System.out.println("venkyAvaliable : "+venkyAvaliable);
        boolean saiAvaliable=DoctorAvailiability.doctorname("sai");
        System.out.println("saiAvaliable : "+saiAvaliable);
        boolean ramAvaliable=DoctorAvailiability.doctorname("ram");
        System.out.println("ramAvaliable : "+ramAvaliable);
        boolean chotuAvaliable=DoctorAvailiability.doctorname("chotu");
        System.out.println("chotuAvaliable : "+chotuAvaliable);    
    }
}