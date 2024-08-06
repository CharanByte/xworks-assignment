public class ChainRunner {
    public static void main(String[] args){
        System.out.println("runnig main method");
        int carat=Chain.carat(24);
        System.out.println("carat : "+carat);

        System.out.println("runnig main method");
        double price=Chain.costPerGram(6000);
        System.out.println("cost_per_gram : "+price);

        System.out.println("runnig main method");
        String chainType=Chain.type("Rope Chain");
        System.out.println("chaintype : "+chainType);

        System.out.println("runnig main method");
        String quality=Chain.quality("First class");
        System.out.println("quality : "+quality);

        System.out.println("runnig main method");
        int  quantity=Chain.quantity(2);
        System.out.println("quantity : "+quantity);

        System.out.println("runnig main method");
        String  wastage=Chain.wastage("10%");
        System.out.println("quantity : "+wastage);

        System.out.println("runnig main method");
        double  serviceCharge=Chain.serviceCharge(500);
        System.out.println("serviceCharge : "+serviceCharge);

        System.out.println("runnig main method");
        double  gst=Chain.gst(100);
        System.out.println("gst : "+gst);



        
    }
    
}
