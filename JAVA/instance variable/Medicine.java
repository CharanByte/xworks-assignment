public class Medicine {
    int quantity;
    double price;
    String name;

    Medicine(){
        System.out.println("Place constructor");
    }

    public static void main(String[] args) {
        Medicine medicine=new Medicine();
        medicine.quantity=1;
        medicine.price=2;
        medicine.name="Dolo 650";
        System.out.println(medicine.quantity);
        System.out.println(medicine.price);
        System.out.println(medicine.name);


    }
    
    
}
