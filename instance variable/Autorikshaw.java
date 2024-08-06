public class Autorikshaw {
    double height;
    double weight;
    String color;

    Autorikshaw(){
        System.out.println("Autorikshaw constructor");
    }

    public static void main(String[] args) {
        Autorikshaw autorikshaw=new Autorikshaw();
		
        autorikshaw.height=100;
        autorikshaw.weight=100;
        autorikshaw.color="yellow";
        System.out.println(autorikshaw.height);
        System.out.println(autorikshaw.weight);
        System.out.println(autorikshaw.color);


    }
}
