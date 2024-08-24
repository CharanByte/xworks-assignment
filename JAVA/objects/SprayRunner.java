public class SprayRunner {
  public static void main(String[] args)
  {
	  System.out.print("Start main in  SprayRunner ");
	  
	   Spray  spray=new Spray();
	   spray.name="fogg";
	   spray.type="bodyspray";
	   System.out.println("spray name :"+spray.name);
	   System.out.println("spray type :"+spray.type);
	   System.out.println("spray cost:"+spray.cost);
	  
	  
	   System.out.print("end main in SprayRunner");
  }   
}
