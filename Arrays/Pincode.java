public class Pincode {
    public static void pincodeNo(int[] pin){
        System.out.println("running pincode in pincode");
        for(int code :pin){
            System.out.println("pincode : "+code);
        }
        System.out.println("*******************************************************");
        System.out.println("printing in backword direction");
        for(int i=pin.length-1;i>=0;i--){
            System.out.println("pincode : "+pin[i]);
        }
        System.out.println("end pincode in pincode");
    }
    
}
