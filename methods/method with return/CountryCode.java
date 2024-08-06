public class CountryCode {
    public static String code(int code){
        System.out.println("running code in countrycode");
        if(code==91){
            return "India";
        }
        else if(code==90){
            return "Turkey";
        }
        else if(code==960){
            String countryName= "Maldives";
            return countryName;
        }
        else if(code==974){
            return "Qatar";
        }
        else if(code==54){
            return "Argentina";
        }
        

        return "not found";
    }

    
}
