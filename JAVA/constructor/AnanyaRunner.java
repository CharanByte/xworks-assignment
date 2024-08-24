public class AnanyaRunner {

    public static void main(String[] args) {
        
        Knife knife=new Knife(2, 4);
        Ananya ananya=new Ananya("vivo", knife);
        ananya.details();
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Knife knife1=new Knife(5, 8);
        Ananya ananya1=new Ananya("mi", knife1);
        ananya1.details();
    }
    
}
