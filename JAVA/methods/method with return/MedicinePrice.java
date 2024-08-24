
public class MedicinePrice {

    public static double medName(String name){
        System.out.println("running medname in MedicinePrice ");
        if(name=="Paracetamol"){
            return 2;
        }
        else if(name=="Acetazolamide"){
            return 10;
        }
        else if(name=="Sabril"){
            return 20;
        }
        else if(name=="Topamax"){
            return 30;
        }
        else if(name=="Cipro"){
            return 5;
        }
        return 0;

    }

    
}