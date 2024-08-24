public class Airconditioner {
    public static void freshAir(){
        System.out.println("Press 1 to get Fresh Air");
        gentleWind();
    }
    public static void gentleWind(){
        System.out.println("press 2 to get Gentle Wind");
        Sleep();
    }
    public static void Sleep(){
        System.out.println("press 3 to get Sleep");
        turbo();
    }
    public static void turbo(){
        System.out.println("press 4 to Turbo");
        eco();
    }
    public static void eco(){
        System.out.println("press 5 to get Eco");
    }
}
