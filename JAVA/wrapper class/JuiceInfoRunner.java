public class JuiceInfoRunner {

    public static void main(String[] args) {
        
        if(args.length==5){
            String name=args[0];
            String  brand =args[1];
            String flavour=args[2];
            String price=args[3];
            String quantity=args[4];
            
         double price1 = Double.parseDouble(price);  
         int quan =Integer.parseInt(quantity);

         JuiceInfo.juice(name,brand,flavour,price1,quan);
        }
    }
    
}
