public class Ananya {
    String mobile;
    Knife knife;

    Ananya(String mobile,Knife knife){
        this.knife=knife;
        this.mobile=mobile;
    }
    public void  details(){
        System.out.println(mobile);
        knife.details();
    }
    
}
