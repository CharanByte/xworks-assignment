public class ItemPrice {
    public static double item(String item){
        System.out.println("running item in itemprice");
        if(item=="pen"){
            return 10;
        }
        else if(item=="book"){
            return 40;
        }
        else if(item=="bag"){
            return 500;
        }

        else if(item=="cloths"){
            return 1000;
        }

        else if(item=="shoes"){
            return 700;
        }
        return 0;
    }
    
}
