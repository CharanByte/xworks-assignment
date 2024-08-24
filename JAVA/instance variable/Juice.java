public class Juice {
    int quantity;
    double price;
    String flavour;

    Juice(){
        System.out.println("juice constructor");
    }

    public static void main(String[] args) {
        Juice juice=new Juice();
        juice.quantity=2;
        juice.price=20;
        juice.flavour="straberry";
        System.out.println(juice.quantity);
        System.out.println(juice.price);
        System.out.println(juice.flavour);


    }
    
}
