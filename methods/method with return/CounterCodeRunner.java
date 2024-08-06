public class CounterCodeRunner {
    public static void main(String[] args) {
       String countryName1= CountryCode.code(91);
       System.out.println("countryName : " +countryName1);
       String countryName2= CountryCode.code(90);
       System.out.println("countryName : " +countryName2);
       String countryName3= CountryCode.code(960);
       System.out.println("countryName : " +countryName3);
       String countryName4= CountryCode.code(974);
       System.out.println("countryName : " +countryName4);
       String countryName5= CountryCode.code(54);
       System.out.println("countryName : " +countryName5);
       String countryName6= CountryCode.code(50);
       System.out.println("countryName : " +countryName6);




        System.out.println("*******************************************************************");
       double pencost= ItemPrice.item("pen");
       System.out.println("pencost : "+pencost);
       double bookcost= ItemPrice.item("book");
       System.out.println("bookcost : "+bookcost);
       double bagcost= ItemPrice.item("bag");
       System.out.println("bagcost : "+bagcost);
       double clothscost= ItemPrice.item("cloths");
       System.out.println("clothscost : "+clothscost);
       double shoescost= ItemPrice.item("shoes");
       System.out.println("shoescost : "+shoescost);
       double boxcost= ItemPrice.item("box");
       System.out.println("boxcost : "+boxcost);
       
       System.out.println("*******************************************************************");
       String kalikiProducer=MovieProducer.movieName("kalki");
       System.out.println("kalikiProducer : "+kalikiProducer);
       String kgfproducer=MovieProducer.movieName("kgf");
       System.out.println("kgfproducer : "+kgfproducer);
       String kabzaaproducer=MovieProducer.movieName("Kabzaa");
       System.out.println("kabzaaproducer : "+kabzaaproducer);
       String rrrproducer=MovieProducer.movieName("RRR");
       System.out.println("rrrproducer : "+rrrproducer);
       String pushpaproducer=MovieProducer.movieName("pushpa");
       System.out.println("pushpaproducer : "+pushpaproducer);
       String producerName=MovieProducer.movieName("Animal");
       System.out.println("producerName : "+producerName);
    }
    
}
