public class cabinetMin {
    public static void cabinet(String[] minister){
        System.out.println("running cabinet in cabinetMin");
        for(String min : minister){
            System.out.println("Cabinet Minister : "+min);
        }
        System.out.println("*******************************************************");
        System.out.println("printing in backword direction");
        for(int i=minister.length-1;i>=0;i--){
            System.out.println("Cabinet-minister : "+minister[i]);
        }
        System.out.println("end of cabinet in cabinetMin");
    }
    
}
