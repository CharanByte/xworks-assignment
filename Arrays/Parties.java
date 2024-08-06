public class Parties {
    public static void party(String[] partyname) {
        System.out.println("running party in parties");
        for(String name : partyname){
            System.out.println("party name : "+name);
        }
        System.out.println("*******************************************************");
        System.out.println("printing in backword direction");
        for(int i=partyname.length-1;i>=0;i--){
            System.out.println("party name : "+partyname[i]);
        }
        System.out.println("end party in parties");
    }
    
}
