public class Primeminister {
    public static void name(String[] primename){
        System.out.println("running name in Primeminister");
        for(String prime : primename){
            System.out.println("PrimeMinister Name : "+prime);
        }
        System.out.println("*******************************************************");
        System.out.println("printing in backword direction");
        for(int i=primename.length-1;i>=0;i--){
            System.out.println("primename : "+primename[i]);
        }
        System.out.println("end name in Primeminister");
    }
    
}
