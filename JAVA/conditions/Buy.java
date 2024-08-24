class Buy{
    public static void product(String brand,double price ){
        System.out.println("Running product in Buy");
        System.out.println("Brand : "+brand);
        System.out.println("Price : "+price);

        if(price>=500){
            System.out.println("Buy that brand ");
        }
        else{
            System.out.println("dont buy that brand : ");
        }
        
        
    }

    public static void product(String name,int quantity,String quality,double price){
        System.out.println("running product in buy with 4 parameters");
        System.out.println("Name : "+name);
        System.out.println("quantity : "+quantity);
        System.out.println("qauality : "+quality);
        System.out.println("price : "+price);

        if(quantity>=2 && price==30){
            System.out.println("order  quantity is correct");
        }
        else{
            System.out.println("order  quantity is wrong");
        }

        if(price==40 && price<60){
            System.out.println("it is  a good price");
        }
        else{
            System.out.println("price is to high");
        }
    }
    public static void bookMovieTicket(String name,String theaterName,int quantity,double price){
        System.out.println("running bookMovieTicket in buy with 4 parameters");
        System.out.println("Name : "+name);
        System.out.println("theaterName : "+theaterName);
        System.out.println("quantity : "+quantity);
        System.out.println("price : "+price);

        if(quantity==3 && price==200){
            System.out.println("conform the booking");

        }
        else{
            System.out.println("Go back to menu");
        }

        if(price>=500 && quantity==5){
            System.out.println("Book movie tickets");
        }
        else{
            System.out.println("cancel the booking");
        }  

    }
    public static void buyEgg(int total,double pricePerEgg){
        System.out.println("running buyegg in buy");
        System.out.println("total : "+total);
        System.out.println("pricePerEgg : "+pricePerEgg);

        if(total>5 && pricePerEgg==6){
            System.out.println("buy eggs");
        }
        else {
            System.out.println("don't buy");
        }
    }
    public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate){
        System.out.println("running buyshampoo in buy");
        System.out.println("quantityInMl : "+quantityInMl);
        System.out.println("pricr : "+price);
        System.out.println("brand : "+brand);
        System.out.println("manfdate : "+manfDate);

        if(quantityInMl>=50 && price==300){
            System.out.println("BUy that shampoo");
        }
        else{
            System.out.println("don't buy that shampoo");
        
        }
    }

    public static void buyCake(char size,String type,String flavour,double cost,int quantity){
        System.out.println("runnig buycake in buy");
        System.out.println("size : "+size);
        System.out.println("type : "+type);;
        System.out.println("flavour : "+flavour);
        System.out.println("cost : "+cost);
        System.out.println("quantity : "+quantity);

        if(cost>600 && quantity>=2){
            System.out.println("Buy a cake");
        }
        else{
            System.out.println("don't buy a cake");
        }
    }
    public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize){
        System.out.println("running buylaptop in buy");
        System.out.println("brand : "+brand);
        System.out.println("serialNo : "+serialNo);
        System.out.println("price : "+price);
        System.out.println("Baterycapaxity : "+batteryCapacity);
        System.out.println("Screensize : "+screenSize);
        System.out.println("os : "+os);
        System.out.println("harddisk : "+harddiskSize);
        System.out.println("ramsize : "+ramSize);

        if(price>=30000){
            System.out.println("buy laptop");
        }
        else{
            System.out.println("don't buy laptop");
        }
    }

    public static void buySmartWatch(String brand,double price,String color,char type,int model){
        System.out.println("running buysmartwatch ");
        System.out.println("brand : "+brand);
        System.out.println("price : "+price);
        System.out.println("color : "+color);
        System.out.println("type : "+type);
        System.out.println("model : "+model);

        if(price>=2500 && color=="black"){
            System.out.println("buy that smartwatch");
        }
        else{
            System.out.println("dont buy that smart watch");
        }
        }
    

}