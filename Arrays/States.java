public class States {
    public static void stateName(String[] state){
        System.out.println("running state in states");
        for(String i : state){
            System.out.println("State-Name : "+i);
        }
        System.out.println("*******************************************************");
        System.out.println("printing in backword direction");
        for(int i=state.length-1;i>=0;i--){
            System.out.println("state-name : "+state[i]);
        }
        System.out.println("end state in states");
        
    }
    
}
