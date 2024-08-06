public class AlcoholBrand {
    int quantity;
    double price;
    String brand;

    AlcoholBrand(){
        System.out.println("AlcoholBrand constructor");
    }

    public static void main(String[] args) {
        AlcoholBrand alcoholBrand=new AlcoholBrand();
        alcoholBrand.quantity=1;
        alcoholBrand.price=1090;
        alcoholBrand.brand="MH";
        System.out.println(alcoholBrand.quantity);
        System.out.println(alcoholBrand.price);
        System.out.println(alcoholBrand.brand);


    }
    
}
