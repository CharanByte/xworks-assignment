public class Place {
    double distance;
    double price;
    String name;

    Place(){
        System.out.println("Place constructor");
    }

    public static void main(String[] args) {
        Place place=new Place();
        place.distance=100;
        place.price=200;
        place.name="Nandi Hills";
        System.out.println(place.distance);
        System.out.println(place.price);
        System.out.println(place.name);


    }
    
}
