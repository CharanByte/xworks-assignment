public class MedicineInfoRunner {
    public static void main(String[] args) {
        
        if(args.length==4){
            String name=args[0];
            String manfDate=args[1];
            String price=args[2];
            String quantity=args[3];
            
         double price1 = Double.parseDouble(price);  
         int quan =Integer.parseInt(quantity);

         MedicineInfo.medicine(name, manfDate,price1,quan);
        }
    }
    
}
