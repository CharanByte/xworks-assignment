public class Symptom {

        public static String symptom(String symptom){
            if(symptom=="Headache"){
                return " Acetaminophen";
            }
            else if(symptom=="Fever"){
                return "Acetaminophen";
            }
            else if(symptom=="Cough"){
                return " Dextromethorphan";
            }
            else if(symptom=="Sore Throat"){
                return " acetaminophen";
            }
            else if(symptom=="Diarrhea"){
                return " Loperamide";
            }


            return "not found";

        }
    
}