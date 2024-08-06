class Kerosene {
    double price;
    int quantity;
    boolean quality;

    Kerosene() {
        System.out.println("No-parameter constructor:");
    
    }

    Kerosene(double price, int quantity, boolean quality) {
        System.out.println("Constructor with price, quantity, and quality parameters:");
        System.out.println(this.price);
        System.out.println(price);
        System.out.println(this.quantity);
        System.out.println(quantity);
        System.out.println(this.quality);
        System.out.println(quality);
    }

    Kerosene(boolean quality) {
        System.out.println("Constructor with quality parameter:");
        System.out.println(this.quality);
        System.out.println(quality);
    }

    Kerosene(double price) {
        System.out.println("Constructor with price parameter:");
        System.out.println(this.price);
        System.out.println(price);
    }
}