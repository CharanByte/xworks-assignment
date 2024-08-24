public class AutoDriver {
    double height;
    double weight;
    String name;

    AutoDriver(){
        System.out.println("AutoDriver constructor");
    }

    public static void main(String[] args) {
        AutoDriver autoDriver=new AutoDriver();
        autoDriver.height=150;
        autoDriver.weight=90;
        autoDriver.name="raju";
        System.out.println(autoDriver.height);
        System.out.println(autoDriver.weight);
        System.out.println(autoDriver.name);


    }
    
}
